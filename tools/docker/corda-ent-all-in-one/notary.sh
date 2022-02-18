#!/bin/bash
cd /home

while true; 
do 
	NMS_STATUS=$(curl -Is localhost:20000/status | head -n 1); 
	if [[ $NMS_STATUS == *"200"* ]]; 
	then 
	echo "Starting Notary: Nms is up"; 
	break; 
	else 
	echo "Starting Notary: Nms is not up yet"; 
	sleep 5; 
	fi; 
done

cd notary
java -jar corda-4.8.jar
