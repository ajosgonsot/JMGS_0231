public class Modulo{
	
	private String codigo;
	private String titulo ;
	private int horasSemanales;
	
	public Modulo(){
	
		codigo="";
		titulo="";
		horasSemanales=0;
		
	}
	public String getCodigo(){
		return codigo;	
	}
	public String getTitulo(){
		return titulo;	
	}
	public int getHorasSemanales(){
		return horasSemanales;	
	}
	public void setCodigo(String codigo){
		this.codigo=codigo; 
	}
	public void setTitulo(String titulo){
		this.titulo=titulo; 
	}
	public void setHorasSemanales(int horasSemanales){ 
		this.horasSemanales=horasSemanales; 
	} 
}
