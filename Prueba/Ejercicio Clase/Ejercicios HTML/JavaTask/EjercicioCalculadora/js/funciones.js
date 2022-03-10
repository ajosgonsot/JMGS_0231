function Resultado(){
    var suma = document.getElementById("suma").value ;
    var resta = document.getElementById("resta").value ;
    var multiplicacion = document.getElementById("multiplicacion").value ;
    var division = document.getElementById("division").value ;
    var Numero1 = document.getElementById("Numero1").value;
    var Numero2 = document.getElementById("Numero2").value;
    var Resultado="";
    
let Resultado =eval(suma) 
let Numero1 = Numero1;
let Numero2 = Numero2;
let Resultado = Numero1 + Numero2;
document.getElementById("Resultado").innerHTML = Resultado;

}