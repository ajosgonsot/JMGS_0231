import dam.java.*;

public class Test01_paquetes_y_jar {
	
	public static void main(String[] args) {
		
		System.out.println("");
			
		/* PAQUETES */
		
		/* Conjunto de clases relacionadas entre sí, ordenadas de forma arbitraria.
		 * Un paquete puede contener otros paquetes.
		 * Evitan conflictos: llamar a dos clases con el mismo nombre. */
		
		
		/* SENTENCIA IMPORT */
		
		/* Permite utilizar una clase contenida en un paquete.
		 * 
		 * Importación individual frente a colectiva:
		 * 
		 * import java.lang.System;
		 * import java.lang.*;
		 * 
		 * También se puede utilizar una clase de un paquete sin importarla. */

		java.util.Scanner sc=new java.util.Scanner(System.in);


		/* EJEMPLOS LIBRERIAS JAVA */
		
		/* java.io
		 * java.lang
		 * java.util
		 * java.applet
		 * java.awt
		 * java.swing
		 * java.net
		 * java.math
		 * java.sql
		 * java.security
		 * java.rmi
		 * java.beans
		 * ... */
		 
		 
		 /* LOCALIZACION DE LIBRERIAS */
		 
		 /* Para encontrar una clase u otro recurso, Java necesita dos cosas:
		  * 1.- El nombre del paquete.
		  * 2.- Las rutas donde están situados los paquetes y las clases (CLASSPATH)
		  * 
		  * CLASSPATH sirve para localizar clases creadas por el usuario o terceras
		  * personas que no son parte de la plataforma Java. Establecer el valor de
		  * esta variable es necesario cuando se va a utilizar una clase que no está
		  * en el mismo directorio (o subdirectorios) de la clase donde se está trabajando.
		  * 
		  * Una alternativa a establecer el valor de la variable de entorno
		  * CLASSPATH es utilizar las opciones -cp o -classpath al ejecutar Java.
		  * 
		  * C:\ java -cp \java\MisClases ejemplo
		  * */

		 
		//dam.java.Alumno a=new dam.java.Alumno(); // no es necesario "import"
		Alumno a=new Alumno(); // sí es necesario import
		a.setNombre("pepe");
		System.out.println(a.getNombre());
		
		
		/* FICHEROS JAR */
		
		/* Las aplicaciones profesionales suelen contener múltiples ficheros
		 * de datos, para distribuirlas se suele utilizar un fichero JAR.
		 * Este formato permite empaquetar múltiples ficheros
		 * (clases, datos, sonido, imágenes, etc.) en un solo archivo.
		 * Permite mecanismos de seguridad y mejora la portabilidad.
		 * 
		 * Crear un fichero JAR:
		 * C:\> jar cf ejemplo.jar ejemplo.class
		 * 
		 * Ver el contenido del JAR:
		 * C:\> jar tf ejemplo.jar
		 * 
		 * Extraer los ficheros del JAR:
		 * C:\> jar xf ejemplo.jar
		 * 
		 * Ejecutar la aplicación contenida en un JAR:
		 * C:\> java -cp ejemplo.jar ejemplo
		 */
			
		
		System.out.println("");
	}
	
}
