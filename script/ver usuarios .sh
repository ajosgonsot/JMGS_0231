#!/bin/bash
cat /etc/passwd | cut -f1 -d:> /tmp/usuarios.txt
exec</tmp/usuarios.txt
#anula la entrada estandar y usara como estandar el archivo#
read u 
while [ "$u" ]
do
echo "$u esta registrado"
read u
done
exec<&-
