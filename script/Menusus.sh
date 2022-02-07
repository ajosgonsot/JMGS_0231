#!/bin/bash
cat /etc/passwd|cut -f1 -d: >/tmp/usu.txt
pares=""
let j=1
exec 24</tmp/usu.txt
read -u 24 linea
while [ "$linea" ]
do
pares="$pares $linea $j"
let j=$j+1
read -u 24 linea
done
echo $pares