public class Usuario{

	private String dni;
	private String nombre;
	private String domicilio;
	private int telefono;
	
	// CONSTRUCTOR
	
	public Usuario(){
		dni="";
		nombre="";
		domicilio="";
		telefono=0;
		
	}
	
	//SETERS
	
	public void setDni(String dni){
		this.dni=dni;
	
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	
	}
	public void setDomicilio(String domicilio){
		this.domicilio=domicilio;
	
	}
	public void setTelefono(int telefono){
		this.telefono=telefono;
	
	}
	
	//GETERS
	
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public int getTelefono() {
		return telefono;
	}

}	
	
	
