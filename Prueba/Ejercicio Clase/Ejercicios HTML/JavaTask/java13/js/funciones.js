function calcular(){
    var Nombre = document.getElementById("nombre").value;
    var Precio = parseInt(document.getElementById("Precio").value);
    var IVA = parseInt(document.getElementById("IVA").value);
    var tipo = document.getElementById("tipo");
    var Precio = tipo.options[tipo.selectedIndex].value;
    var setinput = document.getElementById("Resultado");
    var ope = Precio * IVA;
    setinput.value = ope;
    document.getElementById("Resultado").innerHTML = ope;
}

