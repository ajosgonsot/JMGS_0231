#!/bin/bash
rm /tmp/coches2.txt
read -p "Marca que quieres cambiar:" oldmarca
read -p "Nuevo nombre de la marca:" newmarca
exec 8<coches.txt
read -u 8 linea
while [ "$linea" ]
do
if [ "$linea" = "$oldmarca" ]
then
echo "$newmarca">>/tmp/coches2.txt
else
echo "$linea">>/tmp/coches2.txt
fi
read -u 8 linea
done
exec<&-
cp /tmp/coches2.txt coches.txt