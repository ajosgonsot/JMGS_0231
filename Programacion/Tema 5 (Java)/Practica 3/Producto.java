public class Producto {

	/*Atributos****************/
	
	private int codigo;
	private String nombre;
	private double precioUnidad;

	public Producto() {
	
	/*Constructor**************/

	codigo=0;
	nombre="";
	precioUnidad=0;

	}
	
	public int getCodigo(){return codigo;}
	public void setCodigo (int codigo){this.codigo=codigo;}
	public String getNombre(){return nombre;}
	public void setNombre (String nombre){this.nombre=nombre;}
	public double getPrecioUnidad(){return precioUnidad;}
	public void setPrecioUnidad (double precioUnidad){this.precioUnidad=precioUnidad;}


}
