function validar (){
    //var campo = document.getElementById("nombre");
    //alert(campo.value);
    if(campo.value == null || campo.value =="" || campo.value.lenght == 0){
        campo.style = "border: 2px solid red";
        campo.focus();
    } else {
        campo.style ="";
    }
}