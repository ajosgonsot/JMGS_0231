#!/bin/bash
ls -f /usr/bin/x*|cut -f 4 -d/ >/tmp/soto.txt
let i=1
exec 4</tmp/soto.txt
pares=""
read -u 4 linea
while [ "$linea" ]
do
pares="$pares $linea $i "
echo "$linea"
echo "$pares"
read -u 4 linea
let i=$i+1
done
dialog --menu "Elige programa" 0 0 0 $pares 2>/tmp/programa.txt
exec 4<&-
programa=$(cat /tm/programa.txt)
/usr/bin/$programa
clear