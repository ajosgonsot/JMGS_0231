public class Alumno{
	
	private String dni;
	private String nombre;
	private String fecNac;
	
	public Alumno(){
	
		dni="";
		nombre="";
		fecNac="";
		
	}
	public String getDni(){
		return dni;	
	}
	public String getNombre(){
		return nombre;	
	}
	public String getFecNac(){
		return fecNac;	
	}
	public void setDni(String dni){
		this.dni=dni; 
	}
	public void setNombre(String nombre){
		this.nombre=nombre; 
	}
	public void setFecNac(String fecNac){
		this.fecNac=fecNac; 
	} 
}
