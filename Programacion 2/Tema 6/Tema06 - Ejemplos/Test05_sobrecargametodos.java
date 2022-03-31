
public class Test05_sobrecargametodos {
	
	public static void main(String[] args) {
		
		System.out.println("");
			
		/* SOBRECARGA DE MÉTODOS */
		
		/* La sobrecarga es la implementación varias veces del mismo método con
		 * ligeras diferencias adaptadas a las distintas necesidades de dicho método.
		 * La sobrecarga implica una implementación repetida del mismo método.
		 * Son métodos con el mismo nombre pero con distinta lista de parámetros.
		 * Puede variar el número de parámetros, los tipos de los parámetros o
		 * el orden de los parámetros, pero NO el tipo devuelto por el método.
		 * */


		Alumno a=new Alumno();
		
		a.setNombre("pepe");
		a.setNombre("pepe","martinez");
		a.setNombre("pepe","martinez","sanchez");
		System.out.println(a.getNombre());
		
		a.setEdad(20);
		a.setEdad(20.5);
		System.out.println(a.getEdad());

		System.out.println("");
	}
}

/*public*/ class Alumno {
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private double edad;

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public void setNombre(String nombre, String apellido1) {
		this.nombre=nombre;
		this.apellido1=apellido1;
	}

	public void setNombre(String nombre, String apellido1, String apellido2) {
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
	}
	
	public String getNombre() { return nombre+" "+apellido1+" "+apellido2; }
	
	public void setEdad(int edad) {
		this.edad=edad; //cast implícito
	}
	
	public void setEdad(double edad) {
		this.edad=edad;
	}
	
	public double getEdad() { return edad; }
	
	//public int getEdad() { return (int)edad; }	//Provoca error de compilación!!
}
