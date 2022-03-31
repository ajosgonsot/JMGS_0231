import java.util.*;

public class Test09_wrappers {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
	
		/* WRAPPERS */
		/* La diferencia entre un tipo primitivo de datos y
		 * un wrappers es que éste último es una clase.
		 * El problema de pasar una variable a un método como parámetro
		 * es que si esta es un tipo primitivo se le pasa como valor
		 * si es un wrapper (objeto) se le pasa como referencia */
		 
		/* Tipos primitivos y Wrappers asociados
		 * 
		 * byte			Byte
		 * short		Short
		 * int			Integer
		 * long			Long
		 * float		Float
		 * double		Double
		 * char			Character
		 * boolean		Boolean						*/
		
		/* Clase Wrapper Integer */
		
		/* Métodos:
		 * 
		 * Contructores
		 * 
		 * Integer(int)
		 * Integer(String)
		 * 
		 * Funciones de conversión con datos primitivos
		 * 
		 * byteValue()
		 * shortValue()
		 * intValue()
		 * longValue()
		 * floatValue()
		 * doubleValue()
		 * 
		 * Conversión a String
		 * 
		 * Integer decode(String)
		 * Integer parseInt(String)
		 * Integer parseInt(String,int)
		 * Integer valueOf(String)
		 * String toString()
		 * 
		 * Conversión a otros sistemas de numeración
		 * 
		 * String toBinaryString(int)
		 * String toHexString(int)
		 * String toOctalString(int)
		 * 
		 * Constantes
		 * 
		 * MAX_VALUE
		 * MIN_VALUE
		 * TYPE												*/
		
		
		/* Ejemplos */
		//~ Integer i1 = new Integer(5);
		//~ Integer i2 = new Integer("7");
		//~ String s1 = i1.toString();
		//~ System.out.println(s1); //muestra 5 por pantalla
		//~ int i3 = Integer.parseInt("10",10);
		//~ int i4 = Integer.parseInt("10",8);
		//~ int i5 = Integer.parseInt("BABA",16);
		//~ System.out.println(i3); //muestra 10 por pantalla
		//~ System.out.println(i4); //muestra 8 por pantalla
		//~ System.out.println(i5); //muestra 47.802 por pantalla
		//~ System.out.println(Integer.toOctalString(i4)); //muestra 10 por pantalla
		//~ System.out.println(Integer.toHexString(i5)); //muestra baba por pantalla
		//~ int i6 = Integer.valueOf("22").intValue();
		//~ System.out.println(i6); //muestra 22 por pantalla
		
		
		/* OJO con el paso de parámetros!! */
		
		Integer x=new Integer(10);		// El wrapper nos permite hacer lo mismo así Integer x=10;
		modificar(x);
		System.out.println(x);
		
		
		/* PARA INVESTIGAR MAS SOBRE METODOS DE WRAPPERS MIRAR API JAVA */

		
		System.out.println("");
	}
	
	private static void modificar(Integer y) {
		
		y=20;	// Esto lo que hace realmente es y=new Integer(20);
				// por lo que no funciona el paso por referencia,
				// ya que crea una referencia nueva.
		// Para que funcione debería existir un método tal que así:
		// y.setValue(20);
		// pero tal método no existe en los wrappers.
	}
	
}
