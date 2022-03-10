function calcular(){
    var texto = "<h3>Tabla del "+ Numero +"</h3>";

    for (let i = 1; i<=10; i++){
        texto= texto + Numero + ""+i+"="+(Numero*i)+ "</br>"
    }
    document.getElementById("Resultado").innerHTML = texto;
}