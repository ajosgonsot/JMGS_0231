#! /bin/bash
read -p "introduzca usuario:" usu 
er=$(cat /etc/passwd | cut -f1 -d: | grep -w $usu)
if [ "$er" ]
then
echo "Esta registrado en el sistema"
else
echo "No esta registrado en el sistema"
fi