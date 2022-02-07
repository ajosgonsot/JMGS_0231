#!/bin/bash
read -p "Entra Funcion:" Funcion
read -p "Fichero.gif:" fgif
echo "set terminal gif">aux.gplot
echo "set output '$fgif'">>aux.gplot
echo "plot $Funcion">>aux.gplot
cat aux.gplot | gnuplot
fim $fgif