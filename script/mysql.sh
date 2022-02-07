#!/bin/bash
read -p "Entra BBDD:" bd
read -p "Entra tabla:" tabla
echo "create database $bd;">aux.sql
echo "use $bd;">>aux.sql
echo "create table $tabla (i int,n int);">>aux.sql
for i in {1..10000}
do
let a=$random
echo "Insert into $tabla values ($j,$a);">>aux.sql
done
cat aux.sql | mysql