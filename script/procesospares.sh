#!/bin/bash
ps -A>/tmp/aux.txt
cat /tmp/aux.txt|cut -b1-5|tr -d ' '>tmp/pid.txt
cat /tmp/aux.txt|cut -f3 -d:| cut -f2 -d ' '| grep.>/tmp/nombres.txt
pares=""
exec 8</tmp/pid.txt
exec 9</tmp/nombres.txt
read -u 8 pid
read -u 8 pid
read -u 9 nombres
while [ "$nombres" ]
    do
        pares="$pares $pid $nombres"
        read -u 8 pid
        read -u 9 nombres
    done
dialog --menu 0 0 0 $pares 2>/tmp/pid_sel.txt
selec=$(cat /tmp/pid_sel.txt)
kill -9 $select
exec 8<&-
exec 9<&-