#! /bin/bash
read -p "usuario:" usuario
esta=$(cat /etc/passwd | cut -f1 -d: | grep -w "$usuario")
if [ "$esta" ]
then
echo "El usuario $usuario esta registrado"
else
echo "El usuario $usuario no esta registrado"
fi