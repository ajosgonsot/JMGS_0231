
public class Test03_static {
	
	public static void main(String[] args) {
		
		System.out.println("");
			
		/* MIEMBROS DE CLASE vs MIEMBROS DE INSTANCIA */
		
		/* En Java no existen variables globales.
		 * Solución: variables estáticas (static)
		 * Permiten que todos los objetos de una clase puedan
		 * utilizar una variable única.
		 * */

		Alumno a1=new Alumno();
		Alumno a2=new Alumno();
		Alumno a3=new Alumno();

		System.out.println(a1.getNumAlumnos());		// Muestra un 3
		System.out.println(a3.getNumAlumnos());		// Muestra un 3


		/* MÉTODOS DE CLASE vs MÉTODOS DE INSTANCIA */
		
		/* Métodos de instancia:
		 * Son aquellos utilizados por la instancia (objeto).
		 * Son independientes del mismo método de otro objeto de la misma clase.
		 * Pueden acceder a los miembros de instancia y miembros de clase.
		 * 
		 * Métodos de clase:
		 * Son aquellos comunes para una clase (un método por clase, no por objeto).
		 * Son dependientes del mismo método de otro objeto de la misma clase.
		 * Solamente pueden acceder a los miembros de clase (static).
		 * No tienen referencia this.
		 * */
		
		/* La forma correcta de utilizar un miembro o método estático es
		 * anteponiendo el nombre de la clase:
		 * */
		 
		//Alumno.numAlumnos=0;		// En este caso falla porque es privado.
		Alumno.metodoEstatico();	// Uso correcto de un método estático,
									// Anteponiendo el nombre de la clase.

		/* Ejemplos de métodos estáticos muy utilizados son los de la
		 * clase Math:
		 * 
		 * Math.abs(...)
		 * Math.max(...)
		 * Math.min(...)
		 * Math.pow(...)
		 * Math.round(...)
		 * Math.random()
		 * */
		

		System.out.println("");
	}
	
}

class Alumno {
	
	private String nombre;					// Miembro de instancia
	private static int numAlumnos=0;		// Miembro de clase
	
	public Alumno() {
		nombre="";
		numAlumnos++;
	}
		
	public String getNombre() { return nombre; }
	public int getNumAlumnos() { return numAlumnos; }
	public void setNombre(String nombre) { this.nombre=nombre; }
	// NO TIENE SENTIDO HACER UN MÉTODO SET DE UN STATIC
	// public void setNumAlumnos(int numAlumnos) { this.numAlumnos=numAlumnos; }
	
	public static void metodoEstatico() {
		//nombre="";				// Fallo de compilación
		//this.numAlumnos=0;		// Fallo de compilación
		numAlumnos=0;
		//String s=getNombre();	// Fallo de compilación
	}
	
}
