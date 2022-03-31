
import java.util.Scanner;

public class T03p05e02 {
	
	private static void mostrar(int x, int y) {
		
		int mayor, menor;
		
		if (x>y) {
			mayor=x;
			menor=y;
		} else {
			mayor=y;
			menor=x;
		}
		
		for (int i=menor; i<=mayor; i++)
			System.out.print(i+" ");
			
		return;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b;
		
		System.out.print("Introduzca primer numero: ");
		a=sc.nextInt();
		System.out.print("Introduzca segundo numero: ");
		b=sc.nextInt();
		
		mostrar(a,b);

		System.out.println("");
	}
	
}
