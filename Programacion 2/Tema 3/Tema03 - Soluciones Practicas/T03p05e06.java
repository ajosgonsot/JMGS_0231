
import java.util.Scanner;

public class T03p05e06 {
	
	private static int maximo(int a, int b, int c) {
		
		int max;
		
		if (a>b && a>c) {
			max=a;
		} else {
			if (b>a && b>c) {
				max=b;
			} else {
				max=c;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		int max;
		
		System.out.print("Introduzca un numero: ");
		a=sc.nextInt();
		System.out.print("Introduzca otro numero: ");
		b=sc.nextInt();
		System.out.print("Introduzca el ultimo: ");
		c=sc.nextInt();
		
		max=maximo(a,b,c);
		
		System.out.println("El numero mayor es: " +max);

		System.out.println("");
	}
	
}
