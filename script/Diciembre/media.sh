#!/bin/bash
let suma=0
let n=0
while [ "$1" ]
do
let suma=$suma+$1
let n=$n+1
shift
done
let media=$suma/$n 
echo "media:$media"