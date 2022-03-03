function calcular() {
    var base = document.getElementById("base").value ;
    var Exponente = document.getElementById("Exponente").value ;
    var resultado = ""

    var resultado = Math.pow(base,Exponente)

    document.getElementById("resul").innerHTML = resultado;

}



