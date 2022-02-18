#!/bin/bash
cd /home

while true; do 
NOTARY_STATUS=$(sshpass -p "password" ssh -p 2222 localhost -l user1 -o "StrictHostKeyChecking no" run networkMapSnapshot | grep NotaryA); 
if [[ $NOTARY_STATUS == *"NotaryA"* ]]; 
then 
	echo "Node registration: NotaryA is up"; break; 
else 
	echo "Node registration: NotaryA is not up yet"; 
	sleep 5; 
fi; 
done;

COUNTER=1
BASE_VAR=30000
while [ "$COUNTER" -lt 4 ]; 
do
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
    COUNTER=`expr "$COUNTER" + 1`;
done;