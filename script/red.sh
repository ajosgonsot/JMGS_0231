#!/bin/bash
read -p "entra tarjeta de red:"tarjeta
read -p "Entra Mascara de red" mascara
read -p "Entra IP:" ip
read -p "Entra Gateway:" penlace
read -p "Entra DNS1" dns1
read -p "Entra DNS2" dns2

ifconfig $tarjeta $ip $mascara
router add default gw $penlace
echo "nameserver $DNS1">/etc/resolv.conf
echo "nameserver $DNS2">/etc/resolv.conf
