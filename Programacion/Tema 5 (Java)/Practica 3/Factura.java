public class Factura {

	/*Atributos****************/
	
	private int id;
	private String fecha;
	private String dni;
	private int codigoProducto;
	private int cantidad;
	private double iva;
	private double ivaPrecio;
	private double totalSin;
	private double totalCon;

	public Factura() {
	
	/*Constructor**************/

	id=0;
	fecha="";
	dni="";
	codigoProducto=0;
	cantidad=0;
	iva=0;
	ivaPrecio=0;
	totalSin=0;
	totalCon=0;

	}
	
	public int getId() {return id;}
	public void setId (int id) {this.id=id;}
	public String getFecha() {return fecha;}
	public void setFecha (String fecha) {this.fecha=fecha;}
	public String getDni() {return dni;}
	public void setDni (String dni) {this.dni=dni;}
	public int getCodigoProducto() {return codigoProducto;}
	public void setCodigoProducto (int codigoProducto) {this.codigoProducto=codigoProducto;}
	public int getCantidad() {return cantidad;}
	public void setCantidad (int cantidad) {this.cantidad=cantidad;}
	public double getIva() {return iva;}
	public void setIva (double iva) {this.iva=iva;}
	public double getIvaPrecio() {return ivaPrecio;}
	public void setIvaPrecio (double ivaPrecio) {this.ivaPrecio=ivaPrecio;}
	public double getTotalSin() {return totalSin;}
	public void setTotalSin (double totalSin) {this.totalSin=totalSin;}
	public double getTotalCon() {return totalCon;}
	public void setTotalCon (double totalCon) {this.totalCon=totalCon;}
	

}
