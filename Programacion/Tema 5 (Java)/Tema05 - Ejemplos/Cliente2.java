
public class Cliente2 {
	
	/* Atributos ******************************************************/
	private String dni;
	private String nombre;
	private static int numClientes=0;
	
	/* Constructor ****************************************************/
	public Cliente2() {
		dni="";
		nombre="";
	}
	
	/* Métodos getters and setters ************************************/
	public void setDNI(String dni) { this.dni=dni; }
	public String getDNI() { return dni; }
	public void setNombre(String nombre) { this.nombre=nombre; }
	public String getNombre() { return nombre; }
	public int getNumClientes() { return numClientes; }
	public void setNumClientes(int numClientes) { this.numClientes=numClientes; }
	
	/* Método Principal ***********************************************/
	public static void main(String[] args) {
		
		Cliente2 c=new Cliente2();
		c.setNumClientes(1);
		
		// Uso más adecuado pero necesitaría que el atributo fuera public
		// En este caso funciona porque estoy en la misma clase!!
		Cliente2.numClientes=1; 	
	}
}
