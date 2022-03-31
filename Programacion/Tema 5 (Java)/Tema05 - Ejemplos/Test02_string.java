import java.util.*;

public class Test02_string {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("");

	
		/* Cadenas de caracteres (difíciles de manejar) */
		//~ char msg1[]={'h','o','l','a'};
		//~ char msg2[]={104,111,108,97};
		//~ char msg3[]=new char[4];
		//~ System.out.println(msg1);
		//~ System.out.println(msg2);
		//~ System.out.println(msg3);
		//~ //if (msg3=="") System.out.println("si");  // Error

		/* Las cadenas de caracteres en Java se tratan como String */
		//~ System.out.println("hola".length());

		/* Clase String (java.lang.String) */
		/* Métodos */
		
		/* Constructor */
		//~ String msg1="hola";
		//~ String msg2=new String("hola");
		//~ String msg3=new String(msg2);
		
		/* Longitud de un String */
		//~ String msg="hola";
		//~ System.out.println(msg.length());
		
		/* Concatenación de un String */
		//~ String msg="hola";
		//~ msg=msg.concat(" que pasa!!");
		//~ System.out.println(msg);
		
		/* Devolver el propio String */
		//~ String msg="hola";
		//~ System.out.println(msg.toString());

		/* Comparación de Strings */
		//~ String msg1="hola";
		//~ String msg2="Hola";
		//~ System.out.println(msg1.compareTo("hola"));
		//~ System.out.println(msg1.compareTo("holo"));
		//~ System.out.println(msg1.compareTo(msg2));  // Devuelve un número

		/* Comparación de Strings */
		//~ String msg1="hola";
		//~ String msg2="hola";
		//~ if (msg1.equals(msg2)) System.out.println("Iguales"); // Compara el contenido
		//~ else System.out.println("Diferentes");
		//~ if (msg1==msg2) System.out.println("Iguales");			 // Compara la referencia
		//~ else System.out.println("Diferentes");

		/* Comparación de Strings */
		//~ String msg1="hola";
		//~ String msg2=new String("hola");
		//~ if (msg1.equals(msg2)) System.out.println("Iguales");		// Compara el contenido
		//~ else System.out.println("Diferentes");
		//~ if (msg1==msg2) System.out.println("Iguales");				// Compara la referencia
		//~ else System.out.println("Diferentes");

		/* Eliminación de espacios en blanco de un String */
		//~ String msg1="   hola ";
		//~ String msg2=msg1.trim();
		//~ System.out.println(msg1);
		//~ System.out.println(msg2);
		
		/* Convertir letras a mayúsculas y minúsculas de un String */
		//~ String msg="Hola";
		//~ System.out.println(msg.toUpperCase());
		//~ System.out.println(msg.toLowerCase());
		
		/* Reemplazar caracteres de un String */
		//~ String msg1="hola";
		//~ String msg2=msg1.replace('a','o');
		//~ System.out.println(msg1);
		//~ System.out.println(msg2);
		
		/* Subcadenas de un String */
		//~ String msg="hola";
		//~ System.out.println(msg.substring(2,4));
		//~ System.out.println(msg.substring(2));

		/* Comparación de inicio y fin de un String */
		//~ String msg="hola";
		//~ System.out.println(msg.startsWith("h"));
		//~ System.out.println(msg.startsWith("j"));
		//~ System.out.println(msg.endsWith("a"));
		//~ System.out.println(msg.endsWith("la"));

		/* Devolver un carácter de una posición de un String */
		//~ String msg="hola";
		//~ System.out.println(msg.charAt(0));
		//~ System.out.println(msg.charAt(msg.length()-1));

		/* Devolver una posición de una cadena de un String */
		//~ String msg="hola";
		//~ System.out.println(msg.indexOf(0));
		//~ System.out.println(msg.indexOf("h"));

		/* Devolver un array de caracteres de un String */
		//~ String msg1="hola";
		//~ char msg2[]=msg1.toCharArray();
		//~ System.out.println(msg1);
		//~ System.out.println(msg2);

		/* Convertir un número a un String */
		//~ int n1=1;
		//~ long n2=2;
		//~ float n3=3.5f; // equivale a (float)3.5
		//~ double n4=4.7;
		//~ System.out.println(String.valueOf(n1));
		//~ System.out.println(String.valueOf(n2));
		//~ System.out.println(String.valueOf(n3));
		//~ System.out.println(String.valueOf(n4));
		
		/* Convertir un String a un número */
		//~ String msg1="1";
		//~ int num1=Integer.parseInt(msg1);
		//~ System.out.println(String.valueOf(num1)); // Aquí no hace falta el valueOf

		//~ String msg2=" 2 ";
		//~ //int num2=Integer.parseInt(msg2); // Compila pero falla
		//~ int num2=Integer.parseInt(msg2.trim());

		//~ String msg3=" 6.5 "; // ¿Debería fallar?
		//~ double num3=Double.valueOf(msg3).doubleValue();
		//~ System.out.println(num3);
		
		/* PARA INVESTIGAR MAS SOBRE METODOS DE STRING MIRAR API JAVA */
		
		/* Clase StringBuffer */
		/* Los objetos de la clase String NO son modificables
		 * sino que los métodos que actúan sobre los objetos
		 * devuelven un objeto nuevo con las modificaciones
		 * realizadas. En cambio, los objetos de StringBuffer
		 * SI son modificables */
		/* Esta clase dispone de muchos métodos, mirar API JAVA */
		 
		//~ StringBuffer msg1=new StringBuffer("hola");
		//~ String msg2=" que pasa!!";
		//~ msg1.insert(msg1.length(),msg2);
		//~ System.out.println(msg1);


		System.out.println("");
	}
}
