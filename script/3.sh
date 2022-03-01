#!/bin/bash
lista = []
for i in {0..999}
do
let lista [$i]=$RANDOM
done
echo "content-type: text/html"
echo ""
echo "<table style border:1px><tr><td>lista nº pares</td></tr>"
for i in {0..999}
do
let a=${lista[$i]}
let resto =$a%2
if [ $resto -eq 0 ]
then
echo "<tr><td></td></tr>
fi
done
echo "</table>
echo "<table style border 1px><tr><td>nº impares</td></tr>
for i in {0..999}
do
let a=${lista[$1]}
let resto =$a%2
if [ $resto -eq 1 ]
then
echo "<tr><td>$b</td></tr>"
fi 
done
echo "</table>"

