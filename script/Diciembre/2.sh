#!/bin/bash
let suma=0
let c=0
    for i in {4...4000}
    do
        let suma=$suma+$i
        let c+$c+1
            if[$c-eq 30]
        then
            echo"$i:suma:$suma"
                let c=0
        fi
        done
echo:"El sumatorio de todos los números cada 30 y en total es de :$suma"