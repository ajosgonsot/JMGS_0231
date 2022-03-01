function comprobar(){
    var Frases = document.getElementById("Frase").value;
    var Veces = document.getElementById("Veces").value;

    var resultado = ""

    for (let i = 0; Veces < Veces; index++) { 
    resultado = resultado + (i+1) + "," + Frases +"<br>";
    }
    document.getElementById("res").innerHTML = resultado;
}