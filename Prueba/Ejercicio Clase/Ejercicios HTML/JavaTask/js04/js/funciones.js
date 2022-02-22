function calcularedad(){
    var nombre = document.getElementById("nombre").value;
    var nombre = document.getElementById("fecha").value;

    if (edad!="" |edad.length >0){
        var dias = edad*365;

        document.getElementById("resultado").innerHTML = "Buenas tardes" + nombre + "Usted Tiene" + edad + "años que son" +dias+ "Gracias";
    }else{

    var fechaInicio = new Date(fecha).getTime();
    var fechaFin =  new Date().getTime();

    var diff = fechaFin - fechaInicio;

    var dias = Math.floor(diff/(1000*60*60*24));

    document.getElementById("resultado").innerHTML = "Buenas tardes" + nombre + "Usted Tiene" + dias + "Dias de edad, Gracias";
    }
}

