
public class Test04_parametros {
	
	public static int incrementar1(int n) {
		return ++n;
	}
	
	public static int incrementar2(int[] n) {
		return ++n[0];
	}

	public static String cambiarNombre1(Alumno b) {
		b.setNombre("manolo");
		return b.getNombre();
	}
	
	public static String cambiarNombre2(Alumno b) {
		Alumno c=new Alumno();
		b=c;
		b.setNombre("manolo");
		return b.getNombre();
	}
	
	public static String cambiar1(String r) {
		r="manolo";
		return r;
	}
	
	public static Integer cambiar2(Integer o) {
		o=2;
		return o;
	}

	public static String cambiarNombre3(AlumnoInMutable b) {
		//b.setNombre("manolo");	// No existe Set, 
		return b.getNombre();		// esta es la razón por la que es inmutable!!
	}
	
	
	public static void main(String[] args) {
		
		/* PASO DE PARAMETROS POR VALOR Y POR REFERENCIA */
		
		/* Paso de parámetros por valor:
		 * Las variables se copian en los parámetros del método.
		 * Las variables pasadas como parámetro no se modifican.
		 * 
		 * Paso de parámetros por referencia:
		 * Las variables pasadas como parámetro se modifican puesto
		 * que el método trabaja con las direcciones de memoria de
		 * los parámetros.
		 * */
		 
		/* Java utiliza siempre paso por valor (o copia), pero en el
		 * caso de parámetros que son objetos (todos menos los datos
		 * primitivos), lo que se copia es una referencia, por eso
		 * funciona como si fuera paso por referencia */

		
		System.out.println("");
		
		int x=1;
		
		System.out.println(incrementar1(x));	// Paso de parámetro por valor
		System.out.println(x);
		
		System.out.println("");

		int[] y={1};							// Equivale a int[] y=new int[1]; y[0]=1;
		
		System.out.println(incrementar2(y));	// Paso de parámetros por referencia
		System.out.println(y[0]);				// ¿ Qué pasa si hago System.out.println(y); ?
		
		
		// ¿ Qué sucede si en vez de tipos primitivos utilizamos objetos ?
		
		System.out.println("");

		Alumno a=new Alumno();
		a.setNombre("pepe");
		System.out.println(cambiarNombre1(a));
		System.out.println(a.getNombre());
		
		System.out.println("");
		
		Alumno aa=new Alumno();
		aa.setNombre("pepe");
		System.out.println(cambiarNombre2(aa));
		System.out.println(aa.getNombre());
		

		// Casos especiales
		// La clase String y los Wrappers (Integer, Long, Double,...) son inmutables,
		// es decir, no cambian su valor una vez creados (entre otras razones porque no disponen de métodos Set).
		// String (inmutable) vs StringBuffer o StringBuilder (mutables)
		
		System.out.println("");

		String s="pepe";					// Similar a String s=new String("pepe");
		System.out.println(cambiar1(s));
		System.out.println(s);

		System.out.println("");
		
		Integer i=1;
		System.out.println(cambiar2(i));
		System.out.println(i);

		
		System.out.println("");
		
		AlumnoInMutable aim=new AlumnoInMutable("pepe");
		System.out.println(cambiarNombre3(aim));
		System.out.println(aim.getNombre());
		
		System.out.println("");
	}
	
}

class Alumno {
	
	private String nombre;
		
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre=nombre; }
}

class AlumnoInMutable {
	
	// No tiene métodos Set, la asignación se hace a través del constructor.
	private String nombre;
	
	public AlumnoInMutable(String nombre) {
		this.nombre=nombre;
	}
		
	public String getNombre() { return nombre; }
	// public void setNombre(String nombre) { this.nombre=nombre; }
}
