function calcularedad(){
    var nombre = document.getElementById("nombre").value;
    var nombre = document.getElementById("edad").value;

    var dias = edad*365;

    document.getElementById("resultado").innerHTML = "Buenas tardes" +nombre+"Usted tiene"+edad+"años, que son"+dias+"Dias, Gracias.";
}