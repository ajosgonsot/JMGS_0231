#!/bin/bash
read -p "Selecciona una de estas opciones: 1:Cambio de nivel: 2:Selección de binario: 0:Salir:" col
while [ $col -ne 0 ]
do
case $col in
0)
echo "Se sale del Script:"
break
;;
2)
read -p "Indicame el binario que buscas:" binario
$binario
;;
1)
read -p "Selecciona Nivel:" nivel
echo "Seleccionaste el nivel $nivel"
sleep 2
init$nivel
;;
*)
echo "No seleccionaste la opcion correcta"
;;
esac
echo "1 Cambio nivel"
echo "2 Selecciona Binario"
echo "0 Salir del binario"
read -p "Selecciona opcion: " col
done