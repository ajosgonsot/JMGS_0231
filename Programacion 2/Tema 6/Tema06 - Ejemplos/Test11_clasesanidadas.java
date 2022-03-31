
public class Test11_clasesanidadas {
	
	public static void main(String[] args) {
		
		System.out.println("");
			
		/* CLASES ANIDADAS */
		
		/* Una clase anidada es una clase que es miembro de otra clase.
		 * 
		 * 	class externa {
		 * 		...
		 * 		class anidada {
		 * 			...
		 * 		}
		 * 		...
		 * 	}
		 * 
		 * Dado que la clases anidada es un miembro de la clase externa,
		 * tendrá acceso a todos sus métodos y atributos (incluso privados).
		 * Además la clase anidada podrá ser private, public o protected.
		 * 
		 * Existen dos tipos:
		 * 
		 * - Estáticas. También llamadas clases estáticas anidadas.
		 * - No estáticas. También llamadas clases internas.
		 * 
		 * 	class externa {
		 * 		...
		 * 		static class estaticaanidada {
		 * 			...
		 * 		}
		 * 		class interna {
		 * 			...
		 * 		}
		 * 		...
		 * 	}
		 * 
		 * Para instanciar una clase interna se seguirá el siguiente formato:
		 * 
		 * 	externa.interna objetointerno = objetoexterno.new interna();
		 * 
		 * De esta manera, hay que instanciar primero la clase externa para luego
		 * instanciar la clase interna dentro del objeto externo.
		 * 
		 * ¿Cuándo utilizar clases anidadas?
		 * 
		 * Cuando la clase solo se va a utilizar en un único lugar, en ese caso,
		 * al definir la clase como anidada puede hacer que el código sea más 
		 * legible y su mantenimiento sea más sencillo. También se incrementa la
		 * encapsulación dado que la clase anidada solo se necesita en la clase
		 * externa y de esta manera se mantienen juntas.
		 * 
		 * */
		
		
		Alumno a=new Alumno();
		a.dir=a.new Direccion();
		a.dir.calle="";
		
		System.out.println("");
	}
}

/*public*/ class Alumno {
	
	public String dni;
	public String nombre;
	public Direccion dir;
	
	public Alumno() {
		dni="";
		nombre="";
		//dir=new Direccion();	// Esta es otra opción de instaciación de este atributo!
	}
	
	public class Direccion {
		public String calle;
		public String ciudad;
	}
	
	/* Está todo público por simplificar el ejemplo */
}
