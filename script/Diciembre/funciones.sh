#!/bin/bash
for i in {0..99}
do 
let lista[$i]=$RANDOM
done 
echo "$i:${lista[$i]}"
let a=${lista[0]}
for i in {0..98}
do
let t=$i+1
lista[$i]=${lista[$t]}
done
lista[$t]=$a
for i in {0..99}
do
echo "$i:${lista[$i]}"
done