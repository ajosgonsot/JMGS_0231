public class Producto{

	private String codigo;
	private String nombre;
	private float precioUnidad;
	
	public Producto(){
		
		codigo="";
		nombre="";
		precioUnidad=0.0f;
	}	
	public String getCodigo(){
		return codigo;
	}
	public String getNombre(){
		return nombre;
	}
	public float getPrecioUnidad(){
		return precioUnidad;
	}
	public void setCodigo(String codigo){
		this.codigo=codigo;
	} 
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setPrecioUnidad(float precioUnidad){
		this.precioUnidad=precioUnidad;
	}
}
