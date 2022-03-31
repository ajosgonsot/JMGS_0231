
public class Test07_constructor {
	
	public static void main(String[] args) {
		
		System.out.println("");
			
		/* CONSTRUCTOR DE UNA CLASE */
		
		/* Java, al igual que hace con las variables, cuando va a crear un
		 * objeto, lo que hace es reservar espacio de memoria para dicho objeto.
		 * En esta fase de construcción, Java crea un constructor público
		 * por defecto del objeto. Este constructor se puede modificar.
		 * Los constructures se llaman de forma automática al crear el objeto.
		 * 
		 * Tipos:
		 * 
		 * Constructor por defecto:
		 * Cuando no se especifica en el código.
		 * Se ejecuta siempre de manera automática e inicializa el objeto
		 * con los valores especificados o predeterminados del sistema
		 * (numéricos con 0, alfanuméricos con null, String con "" y 
		 * referencias a objetos con null).
		 * 
		 * Constructor definido:
		 * Puede ser más de uno. Tiene el mismo nombre de la clase.
		 * Nunca devuelve un valor y no puede ser declarado como 
		 * static, final, native, abstract o synchronized.
		 * Por regla general se declara como públicos (public).
		 * 
		 * Cuando existe más de un constructor se dice que está "sobrecargado".
		 * Java elige el constructor más adecuado según los parámetos utilizados.
		 * */
		
		
		Alumno a1=new Alumno();				// Constructor básico
		Alumno a2=new Alumno("pepe");		// Constructor sobrecargado
		
		
		/* OJO CON LOS OBJETOS (REFERENCIAS) */
		
		a1=a2;
		a1.setNombre("manolo");
		System.out.println(a2.getNombre()); // ¿ Qué nombre muestra por pantalla ?
		
		
		/* CONSTRUCTOR DE COPIA */
		
		/* Inicializa un objeto asignándole los valores de otro objeto
		 * diferente de la misma clase.
		 * */
		
		Alumno a3=new Alumno("pepe");		// Constructor sobrecargado
		Alumno a4=new Alumno(a3);			// Constructor de copia
		a3.setNombre("manolo");
		
		System.out.println(a3.getNombre());
		System.out.println(a4.getNombre()); // ¿ Qué nombres muestra por pantalla ?
		
		
		/* DESTRUCTOR DE UNA CLASE */
		
		/* NO EXISTEN EN JAVA.
		 * 
		 * Es el propio sistema el que se encarga de eliminar definitivamente
		 * los objetos de memoria cuando le asignamos el valor null a la referencia,
		 * le asignamos un objeto diferente o bien, termina el bloque de código
		 * donde está definida la referencia (ámbito).
		 *
		 * 
		 * Cuando se va a liberar automáticamente la memoria de objetos inservibles,
		 * el sistema ejecuta el finalizador de los objetos.
		 * 
		 * protected void finalize();
		 * 
		 * Podemos sobreescribir este método para realizar otras acciones 
		 * adicionales (liberar memoria, cerrar ficheros, conexiones, etc.).
		 * Pero no se sabe cuando se va a ejecutar por lo que las operaciones
		 * para liberar otros recursos mejor realizarlas de forma explícita. 
		 * 
		 * 
		 * Existe una forma de forzar la ejecución del recolector de basura:
		 * 
		 * System.runFinalization();
		 * System.gc();
		 * 
		 *  */
		
		
		System.out.println("");
	}
}

/*public*/ class Alumno {
	
	private String nombre;
	
	public Alumno() {				// Constructor 1
		nombre="";
	}
	
	public Alumno(String nombre) {	// Constructor 2 (existe sobrecarga)
		this.nombre=nombre;
	}
	
	public Alumno(Alumno a) {		// Constructor de copia
		nombre=a.getNombre();
	}
	
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre=nombre; }
}
