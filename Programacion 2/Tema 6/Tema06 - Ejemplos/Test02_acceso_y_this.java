import dam.java.*;

public class Test02_acceso_y_this {
	
	public static void main(String[] args) {
		
		System.out.println("");
			
		/* CONCEPTO DE CLASE */
		
		/* En programación orientada a objetos, las clases permiten a los
		 * programadores abstraer el problema a resolver ocultando los datos
		 * y la manera en la que estos se manejan para llegar a la solución.
		 * En POO es impensable que desde el mismo programa se acceda
		 * directamente a las variables internas de una clase si no es a
		 * través de métodos getters y setters. */
		  
		 /* En Java hay varios niveles de acceso a los miembros de una clase:
		 * 
		 * public (acceso público)
		 * private (acceso privado)
		 * protected (acceso protegido)
		 * "no especificado" (acceso en su paquete) */
		  
		 /* Acceso público: Un miembro público puede ser accedido desde cualquier
		 * otra clase o subclase que necesite utilizarlo.
		 * Acceso privado: Un miembro privado puede ser accedido solamente desde
		 * los métodos internos de su propia clase.
		 * Acceso protegido: Similar al acceso privado, pero para las subclases o
		 * clases del mismo paquete a la que pertenece la clase, se considerarán
		 * estos miembros como públicos.
		 * Acceso no especificado: Los miembros no etiquetados podrán ser accedidos
		 * por cualquier clases perteneciente al mismo paquete. */
		 
		 /* A las clases también se le puede definir un nivel de acceso.
		  * 
		  * Una clase puede ser pública o NO definida como pública:
		  * public class ejemplo {}
		  * class ejemplo {}
		  * 
		  * Una clase definida como pública puede ser utilizada por las clases de
		  * su paquete y otros paquetes mientras que una clase no definida como
		  * pública solamente podrá ser utilizada por las clases de su propio paquete. */
		 
		 Clase1 c1=new Clase1(); // Compila! Clase1 es una clase pública del paquete dam.java
		 //Clase2 c2=new Clase2(); // No compila! Clase2 es una clase no pública del paquete dam.java
		 
		 
		/* OBJETO THIS */ 
		 
		/* Java proporciona una referencia al objeto con el que se está trabajando.
		 * Es decir, el objeto que está ejecutando el método.
		 * No siempre es necesario, aunque a veces resuelve ambiguedades. */ 
		
		c1.setNombre("pepe"); // Mirar implementación de este método como ejemplo.
		
		
		System.out.println("");
	}
	
}
