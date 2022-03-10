function sumar(){
var Numero1 = parseInt(document.getElementById("Numero1").value);
var Numero2 = parseInt(document.getElementById("Numero2").value);
var setinput = document.getElementById("Resultado");
var ope = Numero1 + Numero2;   
setinput.value = ope;}
    
function restar(){       
var Numero1 = parseInt(document.getElementById("Numero1").value);
var Numero2 = parseInt(document.getElementById("Numero2").value);
var setinput = document.getElementById("Resultado");
var ope = Numero1 - Numero2;
setinput.value = ope;}

function multiplicacion(){
var Numero1 = parseInt(document.getElementById("Numero1").value);
var Numero2 = parseInt(document.getElementById("Numero2").value);
var setinput = document.getElementById("Resultado");
var ope = Numero1 * Numero2;           
setinput.value = ope;}

function division(){
var Numero1 = parseInt(document.getElementById("Numero1").value);
var Numero2 = parseInt(document.getElementById("Numero2").value);
var setinput = document.getElementById("Resultado");
var ope = Numero1 / Numero2;
setinput.value = ope;}