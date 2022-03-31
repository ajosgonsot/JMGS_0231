public class Libro{
	
	private String isbn;
	private String fecha;
	private String titulo;
	private String descripcion;
	
	public Libro(){
		
		isbn="";			
		fecha="";
		titulo="";
		descripcion="";	
	}
	public String getIsbn(){
		return isbn;				
	}
	public String getFecha(){
		return fecha;
	}
	public String getTitulo(){ 		
		return titulo; 				
	}
	public String getDescripcion(){	
		return descripcion;	
	}
	public void setIsbn(String isbn){
		this.isbn=isbn;
	} 
	public void setFecha(String fecha){
		this.fecha=fecha;
	}
	public void setTitulo(String titulo){
		this.titulo=titulo;
	}
	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}
}

