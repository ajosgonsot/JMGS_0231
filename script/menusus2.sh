#!/bin/bash
cat /etc/passwd|cut -f1 -d: >/tmp/usu.txt
pares=""
let i=1
exec 24</tmp/usu.txt
read -u 24 linea
while [ "$linea" ]
do
pares="$pares $linea $i"
let i=$i+1
read -u 24 linea
done
echo $pares
dialog -- menu "Elige usuario" 0 0 0 $pares 2>/tmp/aux.txt
usuario=$(cat /tmp/aux.txt)
usermod $usuario -s /bin/nologin