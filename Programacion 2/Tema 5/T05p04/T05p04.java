import java.util.*;
import java.lang.*;
public class T05p04{
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	
		System.out.println ("Clase java.lang.Boolean");
		System.out.println ();
		
	//Transforma un boolean a boolean
		Boolean a = new Boolean(true); 
		boolean num1= a.booleanValue();
		System.out.println("Ejercicio1: "+num1);
	
	//Comparar dos boolean
	
		int num2;
		boolean b=true, c=false;
		String texto;
		num2 = Boolean.compare(b,c);
		texto = (num2==0)?"IGUALES":"DISTINTOS";
		System.out.println("Ejercicio2: "+texto); 
		
	//Transforma un String con valor "true" a boolean
		String texto1 = "true";
		boolean num3; 
		num3 = Boolean.parseBoolean(texto1);
		System.out.println("Ejercicio3: "+num3);
	
	//Transforma un boolean a Boolean
		boolean num4=true;
		Boolean d = Boolean.valueOf(num4);
		
		if (num4==d){
			System.out.println("Ejercicio4: son iguales");
		} else {
			System.out.println("Ejercicio4: no son iguales");
		}
		
	//Transforma un String con valor "true" a Boolean.
		String texto2 = "true";
		Boolean num5 = Boolean.valueOf(texto2);
		System.out.println("Ejercicio5: "+num5);
		
	System.out.println();
	System.out.println("Clase java.lang.Character:");
	System.out.println();
		
	//Transforma un CHARACTER a char
		Character z = 'a';
		char char0 = z.charValue();
		System.out.println("Ejercicio 1 de char: "+char0);
		
	//Compara 2 char
		char x='b', y='b';
		int char1 = Character.compare(x,y);
		if (char1==0){
			System.out.println("Ejercicio 2 de char: IGUALES");
		} else {
			System.out.println("Ejercicio 2 de char: DISTINTOS");
		}
		
	//Devuelve si un char es un dígito.
		
		char char2 = '1';
		boolean resultado1;
		resultado1 = Character.isDigit(char2);
		System.out.println("Ejercicio 3 de char: "+resultado1);
		
	//Devuelve si un char es una letra.
		
		char char3 = '1';
		boolean resultado2;
		resultado2 = Character.isLetter(char3);
		System.out.println("Ejercicio 4 de char: "+resultado2);
		
	// Devuelve si un char está en minúscula.
		
		char char4 = 'a';
		boolean resultado3;
		resultado3 = Character.isLowerCase(char4);
		System.out.println("Ejercicio 5 de char: "+resultado3);
		
	// Devuelve si un char está en mayúscula.
		
		char char5= 'A';
		boolean resultado4;
		resultado4 = Character.isUpperCase(char5);
		System.out.println("Ejercicio 6 de char: "+resultado4);
		
	// Transforma un char mayúscula a minúscula.
		
		char char6 = 'A';
		char resultado5;
		resultado5 = Character.toLowerCase(char6);
		System.out.println("Ejercicio 7 de char: "+resultado5);
		
	// Transforma un char a Character.
		
		char char7 = 'A';
		Character f = Character.valueOf(char7);
		System.out.println("Ejercicio 8 de char: "+f);
		
	System.out.println();
	System.out.println("Clase java.lang.Double:");
	System.out.println();
		
	// Compara dos double
		double u=5.2, i=5.3;
		int double1 = Double.compare(u,i);
		if (double1==0){
			System.out.println("Ejercicio 1 de double: IGUALES");
		} else {
			System.out.println("Ejercicio 1 de double: DISTINTOS");
		}
		
	//  Transforma un Double a double.
		Double resultado6 = 5.3;
		double double2 = Double.valueOf(resultado6);
		System.out.println("Ejercicio 2 de double: "+double2);
		
	// Transforma un Double a float.
		Double resultado7 = 6.6;
		float double3 = resultado7.floatValue();
		System.out.println("Ejercicio 3 de double: "+double3);
		
	// Transforma un Double a int.
		
		Double resultado8 = 8.5;
		int double4 = resultado8.intValue();
		System.out.println("Ejercicio 4 de double: "+double4);
		
	// Transforma un double a Double.
		double double5 = 4.2;
		Double resultado9 = Double.valueOf(double5);
		System.out.println("Ejercicio 5 de double: "+resultado9);
		
	// Transforma un String a Double.
		String double6 = "8.6";
		Double resultado10 = Double.valueOf(double6);
		System.out.println("Ejercicio 6 de double: "+resultado10);
		
	System.out.println();
	System.out.println("Clase java.lang.Integer:");
	System.out.println();
		
	// Transforma un Integer a byte.
		Integer int0 = 4;
		byte resultado11 = int0.byteValue();
		System.out.println("Ejercicio 1 de Integer: "+resultado11);
		
	// Compara dos int.
		int int1=4, int2=4;
		int resultado12 = Integer.compare(int1,int2);
		if (resultado12==0){
			System.out.println("Ejercicio 2 de Integer: IGUALES");
		} else {
			System.out.println("Ejercicio de Integer: DISTINTOS");
		}
		
	// Transforma un Integer a double.
		Integer int3 = 2;
		double resultado13 = int3.doubleValue();
		System.out.println("Ejercicio 3 de Integer: "+resultado13);
		
	// Transforma un Integer a int.
		Integer int4 = 2;
		int resultado14 = int4.intValue();
		System.out.println("Ejercicio 4 de Integer: "+resultado14);
		
	// Transforma un String a int.
		String int5 = "5";
		int resultado15 = Integer.parseInt(int5);
		System.out.println("Ejercicio 5 de Integer: "+resultado15);
		
	// Transforma un int a Integer.
		int int6 = 7;
		Integer resultado16 = Integer.valueOf(int6);
		System.out.println("Ejercicio 6 de Integer: "+resultado16);
		
	// Transforma un String a Integer.
		String int7 = "9";
		Integer resultado17 = Integer.valueOf(int7);
		System.out.println("Ejercicio 7 de Integer: "+resultado17);
		
	System.out.println();
	System.out.println("Clase java.lang.String:");
	System.out.println();
		
	// Devuelve el char de la posicion 0 de un String.
		String st1 = "Juan";
		char resultado18 = st1.charAt(0);
		System.out.println("Ejercicio 1 de String: "+resultado18);
		
	// Concatena dos String.
		String st2 = "Juan";
		st2 = st2.concat(" Ramon");
		System.out.println("Ejercicio 2 de String: "+st2);
		
	// Devuelve un String formateado a 3 dígitos numéricos.
		String st3 = "6543210";
		String resultado19 = st3.substring(0,3);
		System.out.println("Ejercicio 3 de String: "+resultado19);
		
	// Devuelve la primera ocurrencia de un carácter en un String.
		String st4 = "Juan";
		int resultado20 = st4.indexOf('n');
		System.out.println("Ejercicio 4 de String: Posicion: "+resultado20);
		
	// Devuelve si un String esta vacío.
		String st5 = " ";
		boolean resultado21 = st5.isEmpty();
		System.out.println("Ejercicio 5 de String: "+resultado21);
		
	// Reemplaza un char por otro en un String.
		String resultado22 = "juan".replace('j','J');
		System.out.println("Ejercicio 6 de String: "+resultado22);
		
	// Devuelve un String con los dos primeros caracteres de un String de 3 caracteres.
		String resultado23 = "juan".substring(0,2);
		System.out.println("Ejercicio 7 de String: "+resultado23);
		
	// Devuelve un String con los dos últimos caracteres de un String de tamaño indefinido.
		String resultado24 = "juan";
		String re8 = resultado24.substring(resultado24.length()-2,resultado24.length());
		System.out.println("Ejercicio 8 de String: "+re8);
		
	// Transforma un String a minúsculas.
		String resultado25 = "JUAN".toLowerCase();
		System.out.println("Ejercicio 9 de String: "+resultado25);
		
	// Transforma un String a mayúsculas.
		String resultado26 = "juan".toUpperCase();
		System.out.println("Ejercicio 10 de String: "+resultado26);
		
	// Devuelve un String sin espacios al principio y al final.
		String resultado27 = " juan ".trim();
		System.out.println("Ejercicio 11 de String: "+resultado27);
		
	// Transforma un int a String.
		int resultado29 = 4;
		String resultado28 = String.valueOf(resultado29);
		System.out.println("Ejercicio 12 de String: "+resultado28);
		
	System.out.println();
	System.out.println("Clase java.util.Arrays:");
	System.out.println();
		
	// Realiza una búsqueda binaria en un array de int.
		int[] numero = {1,2,3,4,5};
		int numberToSearch = 3;
		int resultado = Arrays.binarySearch(numero,numberToSearch);
		System.out.println("Ejercicio 1 de ARRAY: "+resultado);	
		
	// Compara si dos arrays de int tienen los mismo valores.
		int[] numero1 = {1,2,3,4,5};
		int[] numero2 = {1,2,6,4,5};
		boolean compara = Arrays.equals(numero1,numero2);
		System.out.println("Ejercicio 2 de ARRAY: "+compara);	
		
	// Ordena un array de int.
		int[] numero3 = {1,6,3,5,4};
		Arrays.sort(numero3);
		
		System.out.print("Ejercicio 3 de ARRAY: ");	
		for (int j = 0; j < numero3.length; j++){
			System.out.print(numero3[j]+" ");
		}
	System.out.println();	
	System.out.println();
	System.out.println("Clase java.util.Calendar:");
	System.out.println();
		
	// Buscar en la API y probar las funciones más interesantes.
		Calendar sameDate = new GregorianCalendar(2020, Calendar.NOVEMBER, 27);
				System.out.println("La fecha es: " + sameDate.getTime());	
	
	System.out.println();
	System.out.println ("De la clase LocalTime y LocalDate no me funcionaba los ejemplos de la api");
	
	}
}
