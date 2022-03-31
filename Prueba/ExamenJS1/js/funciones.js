function validar(campo) {
    //var campo = document.getElementById("nombre");
    //alert(campo.value);
    if (campo.value == null || campo.value == "" || campo.value.length == 0) {
        //campo.style = "border: 2px solid red";
        //campo.focus();

        mostrarError("spnombre", "Error: Nombre vacío");
    } else {
        //campo.style = "";

        borrarError("spnombre");
    }
}

function mostrarError(nombreSpan, mensaje) {
    document.getElementById(nombreSpan).innerHTML = mensaje;
}

function borrarError(nombreSpan) {
    document.getElementById(nombreSpan).innerHTML = "";
}

function validarFormulario() {
    var cadenaError = "";

    var Login = document.getElementById("Login");
    if (Login.value == null || Login.value.length == 0) {
        cadenaError = cadenaError + "<li>Error: Login vacío</li>";
    } else if (Login.value.length != 5) {
        cadenaError = cadenaError + "<li>Error: Nombre Corto</li>";
    } 


    var tel = document.getElementById("telefono");
    if (tel.value == null || tel.value.length == 0) {
        cadenaError = cadenaError + "<li>Error: teléfono vacío</li>";
    } else if (tel.value.length != 9) {
        cadenaError = cadenaError + "<li>Error: teléfono de 9 cifras</li>";
    } else if (!tel.value.startsWith(9) && !tel.value.startsWith(6)) {
        cadenaError = cadenaError + "<li>Error: teléfono 9 o 6</li>";
    }


    var web = document.getElementById("web");
    if (web.value == null || web.value.length == 0) {
        cadenaError = cadenaError + "<li>Error: web vacío</li>";
    } else if (web.value.startsWith= www) {
        cadenaError = cadenaError + "<li>Error: no empieza en www</li>";
    }
    var Afi = document.getElementById("Afi").checked;
    if (Afi.value == null) {
        cadenaError = cadenaError + "<li>Error: Aficiones vacias </li>";
    }


    if (cadenaError.length == 0) {
        return true;
    } else {
        document.getElementById("capaerrores").style.visibility = "visible";
        mostrarError("sperrores", cadenaError);
        return false;
    }
}
