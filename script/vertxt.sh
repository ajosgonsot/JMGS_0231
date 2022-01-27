#!/bin/bash
echo "content-type: text/html"
echo ""
echo "<html> <head> </head> <body>"
echo "<table border=2> <tr><td>Marca</td> <td>Combustible</td></tr>"
exec 45<modelos.txt
exec 47<url.txt
exec 46<combustible.txt
read -u 45 a
read -u 46 b
read -u 47 c
while [ "$a" ]
do
echo "<tr><td>$a</td><td>$b</td><td>$c</td><td>Si</td></tr>"
read -u 45 a 
read -u 47 c
read -u 46 b
done
exec 45<&-
exec 47<&-
exec 46<&-
echo "</table> </body> </html>"



