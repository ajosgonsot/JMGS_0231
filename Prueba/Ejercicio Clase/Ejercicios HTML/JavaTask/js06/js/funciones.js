function comprobar(){
    var num1 = document.getElementById("num1").value
    var num2 = document.getElementById("num2").value

    var resultado = ""

    if (num1 > num2) {
        resultado = num1 + " Es mayor que " + num2;
    } else if (num2 > num1){
      resultado = num2 + " Es mayor que " + num1;  
    } else {
        resultado = num1 + " Es igual que " + num2;
    }

    document.getElementById("res").innerHTML = resultado;
}