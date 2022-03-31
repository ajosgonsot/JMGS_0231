public class Cliente{

	private String dni;
	private String nombre;
	private String domicilio;
	private String telefono;
	
	public Cliente(){
		
		dni="";
		nombre="";
		domicilio="";
		telefono="";
	}	
	public String getDni(){
		return dni;
	}
	public String getNombre(){
		return nombre;
	}
	public String getDomicilio(){ 		
		return domicilio; 				
	}
	public String getTelefono(){
		return telefono;
	}
	public void setDni(String dni){
		this.dni=dni;
	} 
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setDomicilio(String domicilio){
		this.domicilio=domicilio;
	}
	public void setTelefono(String telefono){
		this.telefono=telefono;
	}
}
