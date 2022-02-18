#!/bin/bash
cd /home
mkdir node1 node2 node3
cp -R notary/* node1/
cp -R notary/* node2/
cp -R notary/* node3/

#---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
#---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

cd pki/
java -jar pkitool.jar --config-file pki-generation.conf

#---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
#---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

cp key-stores/corda-identity-manager-keys.jks ../idman/
cp trust-stores/network-root-truststore.jks ../idman/
cd ../idman/
nohup java -jar identitymanager.jar --config-file identity-manager.conf > idman.log 2>&1 &

COUNTER=0
while [ "$COUNTER" -lt 10 ]; 
do
	IDMAN_STATUS=$(curl -Is localhost:10000/status | head -n 1); 
	if [[ $IDMAN_STATUS == *"200"* ]]; 
	then 
		echo "Idman is up"; 
		break; 
	else 
		echo "Idman is not up yet"; 
		sleep 5; 
		COUNTER=`expr "$COUNTER" + 1`; 
	fi; 
done
if [[ "$COUNTER" == "10" ]]; then echo "retries exhausted, exiting";  exit 1; fi

#---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
#---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

cd ../notary
cp ../pki/trust-stores/network-root-truststore.jks .
java -jar corda-4.8.jar --initial-registration --network-root-truststore-password trustpass --network-root-truststore network-root-truststore.jks

#---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
#---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

cd ../networkmap
cp ../notary/nodeInfo* .
cp ../pki/key-stores/corda-network-map-keys.jks .
cp ../pki/trust-stores/network-root-truststore.jks .
NODEINFO_FILE=$(basename nodeInfo*)
sed -i "s/NODEINFO_FILENAME/$NODEINFO_FILE/g" network-parameters.conf

java -jar networkmap.jar --config-file network-map.conf --set-network-parameters network-parameters.conf --network-truststore network-root-truststore.jks --truststore-password trustpass --root-alias cordarootca

nohup java -jar networkmap.jar --config-file network-map.conf  > nms.log 2>&1 &

COUNTER=0
while [ "$COUNTER" -lt 10 ]; 
do 
	NMS_STATUS=$(curl -Is localhost:20000/status | head -n 1); 
	if [[ $NMS_STATUS == *"200"* ]]; 
	then 
	echo "Nms is up"; 
	break; 
	else 
	echo "Nms is not up yet"; 
	sleep 5; 
	COUNTER=`expr "$COUNTER" + 1`; 
	fi; 
done
if [[ "$COUNTER" == "10" ]]; then echo "retries exhausted, exiting";  exit 1; fi

#---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
#---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

cd ../notary

nohup java -jar corda-4.8.jar > notary.log 2>&1 &

COUNTER=0
while [ "$COUNTER" -lt 10 ]; do 
NOTARY_STATUS=$(sshpass -p "password" ssh -p 2222 localhost -l user1 -o "StrictHostKeyChecking no" run networkMapSnapshot | grep NotaryA); 
if [[ $NOTARY_STATUS == *"NotaryA"* ]]; 
then 
	echo "NotaryA is up"; break; 
else 
	echo "NotaryA is not up yet"; 
	sleep 5; 
	COUNTER=`expr "$COUNTER" + 1`; fi; done;
if [[ "$COUNTER" == "10" ]]; 
then 
	echo "retries exhausted, exiting";  
	exit 1; 
fi;


#---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
#---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

cd ..
COUNTER=1
BASE_VAR=30000
while [ "$COUNTER" -lt 4 ]; 
do 
	CORDA_NODE_P2P_PORT=`expr "$COUNTER" \* 1000 + "$BASE_VAR"`; 
	CORDA_NODE_PORT=`expr "$CORDA_NODE_P2P_PORT" + 1`; 
	CORDA_NODE_ADMIN_PORT=`expr "$CORDA_NODE_P2P_PORT" + 2`;  
	sed "s/CORDA_NODE_P2P_PORT/$CORDA_NODE_P2P_PORT/g" general_node.conf > node$COUNTER/node.conf; 
	sed -i "s/CORDA_NODE_PORT/$CORDA_NODE_PORT/g" node$COUNTER/node.conf; 
	sed -i "s/CORDA_NODE_ADMIN_PORT/$CORDA_NODE_ADMIN_PORT/g" node$COUNTER/node.conf;
	sed -i "s/NUMBER/$COUNTER/g" node$COUNTER/node.conf;
	cd node$COUNTER;
	cp ../pki/trust-stores/network-root-truststore.jks .
	java -jar corda-4.8.jar --initial-registration --network-root-truststore-password trustpass --network-root-truststore network-root-truststore.jks
	nohup java -jar corda-4.8.jar > node$COUNTER.log 2>&1 &
	INNER_COUNTER=0
	while [ "$INNER_COUNTER" -lt 10 ]; 
	do
	TEMP=$(curl localhost:20000/network-map/node-infos -o presence.txt);
	NODE_STATUS=$(cat presence.txt | grep Party$COUNTER);
	if [[ $NODE_STATUS == *"matches"* ]];
	then 
	echo "Node is up"; 
	break; 
	else
	echo "Node is not up yet"; 
	sleep 5; 
	INNER_COUNTER=`expr "$INNER_COUNTER" + 1`; 
	fi; 
	done
	COUNTER=`expr "$COUNTER" + 1`; 
	cd ..
done;
