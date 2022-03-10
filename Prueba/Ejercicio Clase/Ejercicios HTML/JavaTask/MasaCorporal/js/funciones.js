function calcular(){
    var Peso  = document.getElementById("Peso").Value;
    var Altura = document.getElementById("Altura").Value;
    
    var imc= peso/ Math.pow(Altura,2);

    var texto = ""

    if (imc < 18.5){
        texto = "Peso Insuficiente"
    }else if (imc >= 18.5 && imc <= 24.9){
        texto = "normopeso"
    }else if (imc >=25 && imc <= 26.9 ){
        texto = "Sobrepeso Grado 1"
    }else if (imc >=27 && imc <= 29.9 ){
        texto = "Sobrepeso Grado II (Preobesidad)"
    }else if (imc >=30 && imc <= 34,9){
        texto = "Obesidad de tipo I"
    }else if (imc >=35 && imc <= 39.9 ){
        texto = "Obesidad de tipo II"
    }else if (imc >=40 && imc <= 49,0 ){
        texto = "Obesidad de tipo III(morbida)"
    }else {
        texto = "Obesidad de tipo IV(EXtrema)"
    }
    document.getElementById
}

