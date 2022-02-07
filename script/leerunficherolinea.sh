#!/bin/bash
genero un fichero
read -p "Elige fichero:" fichero
exec 3<$fichero
read -u 3 linea
while [ "$linea" ]
do
echo "$linea"
read -u 3 linea
done
exec<&-