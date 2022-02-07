#!/bin/bash
cat /etc/passwd|cut -f1,6 -d:|grep -w /home|cut -f1 -d: >/tmp/aux.txt
pares=""
let i=1
exec 24</tmp/aux.txt
read -u 24 linea
while [ "$linea" ]
do
pares="$pares $linea $i"
let i=$i+1
read -u 24 linea
done
#echo $pares
dialog --menu "Elige usuario" 0 0 0 $pares 2>/tmp/aux2.txt
usu=$(cat /tmp/aux2.txt)
mkdir -p /home/$usu/public_html
echo "<html><body><h1>Esta es la pagina web de $usu</h1><br><a href="https:\\www.google.es" target="blank" hreflang="en" type="text/html"> Ir a Google</a><br><a href="https:\\www.youtube.es" target="blank" hreflang="en" type="text/html"> Ir a Youtube</a></body></html>">/home/$usu/public_html/index.html
chown -R $usu:$usu /home/$usu

