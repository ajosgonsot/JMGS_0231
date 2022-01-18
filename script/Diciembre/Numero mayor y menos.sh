#!/bin/bash
for i in {0..99}
do
let numeros[$i]=$RANDOM
done
let n=100
inter=1
let i=0
let j=0
while [ $inter -eq 1 ]
do
let i=0
let j=1
inter=0
let n=$n
while [ $j -ne $n ]
do
let a=${numeros[$i]}
let b=${numeros[$j]}
if [ $a -gt $b ]
then
inter=1
let c=$a
let a=$b
let b=$c
let numeros[$i]=$a
let numeros[$j]=$b
fi
let i=$i+1
let j=$j+1
done
done
for i in {0..99}
do
echo "$i : ${numeros[$i]}"
done