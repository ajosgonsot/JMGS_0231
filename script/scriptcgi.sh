#!/bin/bash
echo "content-type: text/html"
echo ""
echo"<html> <head> </head> <body>"
echo "<table border=2> <tr> <td> N <td>Cuadrado</td> <td>Cubo</td> <td>par</td></tr>"
for i in {0.200}
do
let c2=$i*$i
let c3=$i*$i*$i
let resto= $i%2
if [$resto -eq 0]
then
echo "<tr><td>$i</td><td>$c2</td><td>$c3</td><td>Si</td></tr>"
else
echo "<tr><td>$i</td><td>$c2</td><td>$c3</td><td>No</td></tr>"
fi
