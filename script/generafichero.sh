#!/bin/bash
#genero un fichero
let t=~random
let c=0
while [ $c -ne $t ]
do
    let n=$random
    let resto=$n%5
    if [$resto -eq 0]
    then 
        echo "">>fichero.txt
    else
        echo "$n">>fichero.txt
    fi
    let c=$c+1
done

read -p "Entra Fichero" fichero.txt
 