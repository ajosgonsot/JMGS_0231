#! /bin/bash
read -p "carpeta que sea:" carpeta
read -p "indica profundidad:" p
find $carpeta type d maxdepth $p