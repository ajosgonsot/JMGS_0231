public class Cliente {

	/*Atributos****************/

	private String dni;
	private String nombre;
	private String domicilio;
	private String telefono;

	public Cliente() {
	
	/*Constructor**************/

	dni="";
	nombre="";
	domicilio="";
	telefono="";

	}

	public String getDni(){return dni;}
	public void setDni (String dni){this.dni=dni;}
	public String getNombre(){return nombre;}
	public void setNombre (String nombre){this.nombre=nombre;}
	public String getDomicilio(){return domicilio;}
	public void setDomicilio (String domicilio){this.domicilio=domicilio;}
	public String getTelefono(){return telefono;}
	public void setTelefono (String telefono){this.telefono=telefono;}


}
