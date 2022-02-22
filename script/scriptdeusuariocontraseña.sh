#!/bin/bash
read -p "Nombre de usuario:" usu 
r=$(cat /etc/passwd|cut -f1 -d:|grep -w $usu)
if ["$r"]
then 
echo "$usu Ya Existe."
else
echo "usuario $usu"
useradd $usu -m -d /home/$usu -s /bin/bash
mkdir /home/$usu/public_html
mkdir /tmp/$usu
wget -i https://thispersondoesnotexist.com/ -P /tmp/$usu
mv /tmp/$usu/image /home/$usu/public_html/$usu.jpg
echo "<html><head><title>Esta es la pagina de $usu</title></head>" >/home/$usu/public_html/index.html
echo "<body><img src='$usu.jpg'/></body></html>">>/home/$usu/public_html/index.html
chown -R $usu:$usu /home/$usu
firefox http://localhost/~$usu
fi