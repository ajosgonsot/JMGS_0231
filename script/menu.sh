#!/bin/bash
dialog --menu "Elige opcion:" 0 0 0 1 "Apagar" 2 "Reiniciar" 3 "Cambio Nivel" 2>/tmp/aux.txt
opcion=$(cat /tmp/aux.txt)
case $opcion in 
1)
shutdown
;;
2)
init 6
;;
3)
dialog --inputbox "Nuevo Nivel" 0 0 2>/tmp/aux2.txt
Nivel = $(cat /tmp/aux2.txt)
init $Nivel
;;
esac
clear
