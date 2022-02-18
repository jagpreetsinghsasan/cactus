#!/bin/bash
cd /home

while true;
do
	IDMAN_STATUS=$(curl -Is localhost:10000/status | head -n 1); 
	if [[ $IDMAN_STATUS == *"200"* ]]; 
	then 
		echo "Idman is up"; 
		break; 
	else 
		echo "Idman is not up yet"; 
		sleep 5; 
	fi; 
done

cd notary
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

java -jar networkmap.jar --config-file network-map.conf
