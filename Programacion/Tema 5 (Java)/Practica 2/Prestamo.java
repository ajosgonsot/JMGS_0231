public class Prestamo {
	
	private String id;
	private String fechaP;
	private String fechaD;
	private String dni;
	private String isbn;
	
	// CONSTRUCTOR
	
	public Prestamo(){
		id="";
		fechaP="";
		fechaD="";
		dni="";
		isbn="";
		
	}
	//SETERS
	
	public void setId(String id){
		this.id=id;
	
	}
	public void setFechaP(String fechaP){
		this.fechaP=fechaP;
	
	}
	public void setFechaD(String fechaD){
		this.fechaD=fechaD;
	
	}
	public void setDni(String dni){
		this.dni=dni;
	
	}
	public void setIsbn(String isbn){
		this.isbn=isbn;
	
	}

	//GETERS
	
	public String getId() {
		return id;
	}
	public String getFechaP() {
		return fechaP;
	}
	public String getFechaD() {
		return fechaD;
	}
	public String getDni() {
		return dni;
	}
	public String getIsbn() {
		return isbn;
	}
}
