#!/bin/bash
X=1
while [ $X -le 100 ]
do
	echo $X
	X=$((X+2))
done

X=0
while [ $X -le 100 ]
do
if [ $(($X%2)) != 0 ];
then
echo $X
fi
X=$((X+1))
done