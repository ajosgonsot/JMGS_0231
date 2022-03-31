public class Prestamo{
	
	private String id;
	private String fechaPrestamo;
	private String fechaDevolucion;
	private String dni;
	private String isbn;
	
	public Prestamo(){
		
		id="";			
		fechaPrestamo="";
		fechaDevolucion="";
		dni="";
		isbn="";	
	}
	public String getId(){
		return id;				
	}
	public String getFechaPrestamo(){
		return fechaPrestamo;
	}
	public String getFechaDevolucion(){ 		
		return fechaDevolucion; 				
	}
	public String getDni(){	
		return dni;	
	}
	public String getIsbn(){			
		return isbn;
	}
	public void setId(String id){ 					
		this.id=id;			
	} 
	public void setFechaPrestamo(String fechaPrestamo){	
		this.fechaPrestamo=fechaPrestamo;
	}
	public void setFechaDevolucion(String fechaDevolucion){
		this.fechaDevolucion=fechaDevolucion;
	}
	public void setDni(String dni){
		this.dni=dni;
	}
	public void setIsbn(String isbn){
		this.isbn=isbn;
	}
}
