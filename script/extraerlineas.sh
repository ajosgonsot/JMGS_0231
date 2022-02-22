#!/bin/bash
read -p "ficheroaleer:" fich
let nlin=$(cat $fich|wc -l)
lista=[]
let i=0
while [ "$1" ]
do
    let  lista[$i]=$1
    shift
    let i=$i+1
done
let np=$i
#echo "$lista[@]"
#echo "$np"
let c=0
exec 14<$fich
read -u 14 linea
while [ $c -ne $nlin ]
do
let i=0
    #echo "$c:$linea"
    while [ $i -ne $np ]
    do 
    let t=${lista[$i]}
    #echo "m:$t"
    let t=$t-1
    #echo "M:$t:$i"
    if [ $c -eq $t ]
    then 
    echo "${lista[$i]}:$linea"
    fi
    let i=$i+1
    done
    read -u 14 linea
    let c=$c+1
    done
    exec 14<&-
