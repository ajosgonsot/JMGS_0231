
public class Factura {
	
	/* Atributos ******************************************************/
	private String id;
	private String fecha;
	private String dniCliente;
	private int codigoProducto;
	private int cantidad;
	private double total;

	/* Constructor ****************************************************/
	public Factura() {
		id="";
		fecha="";
		dniCliente="";
		codigoProducto=0;
		cantidad=0;
		total=0.0;
	}

	/* Métodos getters and setters ************************************/
	public void setId(String id) { this.id=id; }
	public String getId() { return id; }
	public void setFecha(String fecha) { this.fecha=fecha; }
	public String getFecha() { return fecha; }
	public void setDNICliente(String dniCliente) { this.dniCliente=dniCliente; }
	public String getDNICliente() { return dniCliente; }
	public void setCodigoProducto(int codigoProducto) { this.codigoProducto=codigoProducto; }
	public int getCodigoProducto() { return codigoProducto; }
	public void setCantidad(int cantidad) { this.cantidad=cantidad; }
	public int getCantidad() { return cantidad; }
	public void setTotal(double total) { this.total=total; }
	public double getTotal() { return total; }
}
