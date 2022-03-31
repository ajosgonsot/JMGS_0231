
public class Producto {
	
	/* Atributos ******************************************************/
	private int codigo;
	private String nombre;
	private double precio;

	/* Constructor ****************************************************/
	public Producto() {
		codigo=0;
		nombre="";
		precio=0.0;
	}

	/* Métodos getters and setters ************************************/
	public void setCodigo(int codigo) { this.codigo=codigo; }
	public int getCodigo() { return codigo; }
	public void setNombre(String nombre) { this.nombre=nombre; }
	public String getNombre() { return nombre; }
	public void setPrecio(double precio) { this.precio=precio; }
	public double getPrecio() { return precio; }
}
