public class Factura{

	private String id;
	private String fecha;
	private String dni;
	private String codigo;
	private int cantidad;
	private float iva;
	private float total;
	
	public Factura(){
		
		id="";
		fecha="";
		dni="";
		codigo="";
		cantidad=0;
		iva=0.0f;
		total=0.0f;
	}	
	public String getId(){
		return id;
	}
	public String getFecha(){
		return fecha;
	}
	public String getDni(){
		return dni;
	}
	public int getCantidad(){
		return cantidad;
	}
	public float getIva(){
		return iva;
	}
	public float getTotal(){
		return total;
	}
	public void setId(String id){
		this.id=id;
	} 
	public void setFecha(String fecha){
		this.fecha=fecha;
	}
	public void setDni(String dni){
		this.dni=dni;
	}
	public void setCodigo(String codigo){
		this.codigo=codigo;
	}
	public void setCantidad(int cantidad){
		this.cantidad=cantidad;
	}
	public void setIva(float iva){
		this.iva=iva;
	}
	public void setTotal(float total){
		this.total=total;
	}
}
