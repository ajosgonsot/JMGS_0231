#!/bin/bash
echo "create database administracion;">/tmp/peluca.sql
echo "use administracion;">>/tmp/peluca.sql
echo "create table usuarios(nombre varchar(30),ce varchar(1), uid varchar(5), gid varchar(5), chome varchar(50), dadm varchar(100), shell varchar(30));">>/tmp/peluca.sql
exec 14</etc/passwd
read -u 14 linea
while [ "$linea" ]
do
a=$(echo "$linea"| cut -f1 -d:)
b=$(echo "$linea"| cut -f2 -d:)
c=$(echo "$linea"| cut -f3 -d:)
d=$(echo "$linea"| cut -f4 -d:)
e=$(echo "$linea"| cut -f5 -d:)
f=$(echo "$linea"| cut -f6 -d:)
g=$(echo "$linea"| cut -f7 -d:)
echo "insert into usuarios values('$a','$b','$c','$d','$e','$f','$g');">>/tmp/peluca.sql
read -u 14 linea
done
exec 14<&-
cat /tmp/peluca.sql|mysql 