#!/bin/bash
read -p "Programa a cargar:"Programa
$Programa
sleep 10
killall $Programa
echo"Codigo fin programa:$?"