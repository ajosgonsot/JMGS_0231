import java.util.Scanner;

public class Holamundo_io {
	
	public static void main(String[] args) {
		
		int num1=0;	
		System.out.println("El numero es: "+num1);
		
		Scanner sc=new Scanner(System.in);
		int num2;
		System.out.print("Introduce un numero: ");
		num2=sc.nextInt();
		System.out.println("El numero introducido es: "+num2);
		
		int num3=0;
		double num4=0.0;
		char c1='a';
		boolean b=true;
		
		System.out.printf("num3 vale: %d , num4 vale: %f , c1 vale: %c , b vale: %b \n",num3,num4,c1,b);
		
		/* printf format:
		 * %d	byte, short, int, long
		 * %f	float, double
		 * %c	char
		 * %s	string
		 * %b	boolean
		 */
		 
		// Muestra un mensaje por pantalla
		System.out.println("Hola mundo!");
	 }
	 
}
