#!/bin/bash
let suma=0
for i in {4..4000}
do
let suma=$suma+$i
done
echo "el sumario de todos los numeros entre 4 y 4000 es de $suma"