package dam.java;

public class Clase1 {
	
	private String nombre;
	
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre=nombre; }

	public void test() {
	
		System.out.println("Clase1");
		
		Clase2 c2=new Clase2(); // Clase2 no es pública pero está en el mismo paquete
		
		/* !! OJO para que compile debemos modificar las opciones de Geany
		 * javac -cp "..\.." Clase1.java
		 * Añadiendo la anterior ruta relativa o la ruta absoluta correspondiente */
		
	}
	
}
