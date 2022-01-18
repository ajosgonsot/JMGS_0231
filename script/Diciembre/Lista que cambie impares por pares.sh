#!/bin/bash
for i in {0..999}
do 
let lista[$i]=$RANDOM
done
for i in {0..999}
do 
echo "$i:${lista[$i]}"
done
for i in {0..999}
do
let resto=${lista[$i]}%2
if [ $resto -eq 1 ]
then
let a=${lista[$i]}
let a=$a +1
let lista[$i]=$a
fi
done
let t=999 
while [ $t -ne -1 ]
do
echo "$t:${lista[$t]}"
let t=$t-1
done 
