function iniciar(){
    //alert(document.getElementById("usuario").value);
    //var usu = prompt("Introduzca Nombre:");
    //alert("hola " + usu)

    /*var usu = prompt("Introduzca Nombre:")
    document.getElementById("texto").innerHTML = "hola " + usu +"</br>";
    document.getElementById("texto").style = "font-weight:bold";*/

    var radio = document.getElementsByName("valor");
    for (let i = 0; i < radios.length; i++) {
        const element = array[i];
        alert(radios[i],value)
        
    }
    alert(document.getElementsByTagName("P")[0].innerHTML = "primer p")
    document.getElementsByTagName("P")[0].onclick = MostrarMensaje
    document.getElementsByName("Clase")[i].onclick = MostrarMensaje
}

function mostrar(texto){

}

function MostrarMensaje(){
    document.getElementById("texto").innerHTML = "hola ";
    document.getElementById("texto").className = "bordeycolor";
}
function Ocultar(){
    document.getElementById("Principal").style = "display:none"
}
function Mostrar(){
    document.getElementById("Principal").style = "display:block";
}
window.addEventListener("load",iniciar,false);