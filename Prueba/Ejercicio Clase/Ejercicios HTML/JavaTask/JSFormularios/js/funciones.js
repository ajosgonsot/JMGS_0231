function validar (campo){
    //var campo = document.getElementById("nombre");
    //alert(campo.value);
    if(campo.value == null || campo.value =="" || campo.value.length == 0){
       // campo.style = "border: 2px solid red";
       // campo.focus();
       mostrarError("spnombre","Error:Nombre Vacio");
    } else {
        //campo.style ="";
        borrarError("spnombre");

    }

}
function mostrarError(nombreSpan, mensaje){
    document.getElementById(nombreSpan).innerHTML = mensaje;
}
function borrarError(nombreSpan){
    document.getElementById(nombreSpan).innerHTML = "";
}
function validarformulario(){
    var cadenaError = "";

    var nombre = document.getElementById("nombre");
    if(nombre.value == null || nombre.value.length == 0){
        cadenaError =cadenaError + "<li>Error:Nombre Vacio</li>";    
    }
    var postal = document.getElementById("postal");
    if (postal.value == null || postal.value == 0){
        cadenaError = cadenaError + "<li>Cod Postal Vacio</li>";
    } else if (postal.value.length !=5)
        cadenaError = cadenaError + "<li>Cod Postal de 5 cifras</li>";

    var tel = document.getElementById("telefono");
    if (tel.value == null || tel.value == 0){
        cadenaError = cadenaError + "<li>telefonos vacios</li>";
    }
    if (cadenaError.length == 0){
        return true;
    } else {
        mostrarError("sperrores", cadenaError);
        return false;
    }

    
}
function mostrarEdad(campoEdad){
    document.getElementById("spedad").innerHTML = campoEdad.value;
}