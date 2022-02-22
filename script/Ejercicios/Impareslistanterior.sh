#!/bin/bash
for i in {0..1999}
do
let numeros[$i]=$RANDOM
done


for i in {0..1999}
do
let a=${numeros[$i]}
let resto=$a%2
if [ $resto -eq 1 ]
then
echo “$a es un numero impar por lista:$i ”
fi
done

