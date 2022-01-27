#!/bin/bash
cat /etc/passwd|cut -f1,7 -d:|grep -w /bin/bash|cut -f1 -d:> /tmp/ubash.txt
exec 23</tmp/ubash.txt
read linea
while [ "$linea" ]
do
usermod $linea -s /bin/sh
read linea
done
exec<&-
rm /tmp/ubash.txt