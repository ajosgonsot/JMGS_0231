#!/bin/bash
for i in {0..99}
do
let numeros[$i]=$RANDOM
done

for i in {0..99}
do
echo "pos:$i numero ${numero[$i]}"
done

let min=999999
let max=-1
for i in {0..99}
do
let a=${numero[$i]}
if { $a -gt $max}
then
let max=$a
fi
if { $a -lt $min}
then
let min=$a
fi
done
echo "Maximo:$max"
echo "Minimo:$min"