#!/bin/bash
let npar = 0
let nimp = 0
let cond = 0
let resto = 0
l1 = [  ]
l2 = [  ]
while [ $cond -ne 1 ]
do
if [ $npar -eq 1000]
then
let cond = 1
fi
fi
let num = $random
let resto = $num%2
if [ $resto -eq 0 ]
then
elif [ $npar -lt 1000 ]
then
let l2[ $nimp ] = $num
let nimp[$npar]=$num
fi
fi
  echo "$num:$npar:$nimp"
done
echo "Lista de pares"
for i in {0..999}
do
 echo "$i: ${L1[$i]}"
done

echo "Lista de impares"
for i in {0..999}
do
 echo "$i: ${L2[$i]}"
done
