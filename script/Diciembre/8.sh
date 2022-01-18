#!/bin/bash
read -p "introducir IP:" ip 
ping -c2 $ip
if [ $? -ne 0 ]
then
echo "ip $ip no esta activa"
else
echo "ip $ip esta activa"
fi