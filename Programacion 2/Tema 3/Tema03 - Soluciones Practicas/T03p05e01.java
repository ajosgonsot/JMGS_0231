
import java.util.Scanner;

public class T03p05e01 {
		
	private static void doble(int x) {
		
		System.out.printf("El doble de %d es %d\n",x,2*x);
		return;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a;
		
		System.out.print("Introduzca un numero: ");
		a=sc.nextInt();
		
		doble(a);
		
		System.out.println("");
	}
	
}
