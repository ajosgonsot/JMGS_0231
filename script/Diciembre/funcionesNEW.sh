#!/bin/bash
carga(){
    for i in {0..49}
    do
    let lista[$i]=$RANDOM
    done
}
muestra(){
        m=""
        for i in {0..49}
        do
        m="$m:${lista[$i]}"
        done
        echo "$m"
}
rotaI(){
   let a=${lista[0]}
for i in {0..48}
do
let t=$i+1
let lista[$i]=${lista[$t]}
done
let lista[$t]=$a
}
RotaD(){
a=${lista[49]}
for i in {0..49}
do
let t=49-$i
let r=$t-1
let lista[$t]=${lista[$r]}
done
lista[0]=$a
}
rotain(){
    for i in {1..$1}
    do
    rotaI
    done
}
rotadn(){
    for i in {1..$1}
    do
    RotaD
    done
}

carga
muestra
rotaI
muestra
rotain 3
muestra
RotaD
muestra
rotadn 2
muestra
