#!/bin/bash
cd /home

COUNTER=1
BASE_VAR=30000
while true;
do
	sshpass -p "password" ssh -p 2222 localhost -l user1 -o "StrictHostKeyChecking no" run networkMapSnapshot;
	EXIT_CODE=$(echo $?)
	if [ $EXIT_CODE -eq 255 ]
	then
	echo "Notary is not up";
	sleep 5;
	else
	echo "Notary is up and running";
	break;
	fi;
done

FILE=/home/node$COUNTER/nodeInfo*
if ls $FILE 1> /dev/null 2>&1;
then 
	echo "Starting Node$COUNTER: Node registration completed";
	cd /home/node$COUNTER;
	java -jar corda-4.8.jar;
else 
	echo "Starting Node$COUNTER: Registering node";
	CORDA_NODE_P2P_PORT=`expr "$COUNTER" \* 1000 + "$BASE_VAR"`; 
    CORDA_NODE_PORT=`expr "$CORDA_NODE_P2P_PORT" + 1`; 
    CORDA_NODE_ADMIN_PORT=`expr "$CORDA_NODE_P2P_PORT" + 2`;
    CORDA_NODE_SSHD_PORT=`expr 2222 + "$COUNTER"`; 
    sed "s/CORDA_NODE_P2P_PORT/$CORDA_NODE_P2P_PORT/g" /home/general_node.conf > /home/node$COUNTER/node.conf; 
    sed -i "s/CORDA_NODE_SSHD_PORT/$CORDA_NODE_SSHD_PORT/g" /home/node$COUNTER/node.conf; 
    sed -i "s/CORDA_NODE_PORT/$CORDA_NODE_PORT/g" /home/node$COUNTER/node.conf; 
    sed -i "s/CORDA_NODE_ADMIN_PORT/$CORDA_NODE_ADMIN_PORT/g" /home/node$COUNTER/node.conf;
    sed -i "s/NUMBER/$COUNTER/g" /home/node$COUNTER/node.conf;
    cd /home/node$COUNTER;
    cp ../pki/trust-stores/network-root-truststore.jks .
    java -jar corda-4.8.jar --initial-registration --network-root-truststore-password trustpass --network-root-truststore network-root-truststore.jks
	java -jar corda-4.8.jar;
fi; 