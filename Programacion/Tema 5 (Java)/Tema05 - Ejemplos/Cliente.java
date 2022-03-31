
public class Cliente {
	
	/* Atributos ******************************************************/
	private String dni;
	private String nombre;
	
	/* Constructor ****************************************************/
	public Cliente() {
		dni="";
		nombre="";
	}
	
	/* Métodos getters and setters ************************************/
	public void setDNI(String dni) { this.dni=dni; }
	public String getDNI() { return dni; }
	public void setNombre(String nombre) { this.nombre=nombre; }
	public String getNombre() { return nombre; }
}
