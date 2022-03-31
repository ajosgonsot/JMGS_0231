
import java.util.Scanner;

public class T03p01e08 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		long factorial;
		int num;
		
		System.out.print("Introduce un numero: ");
		num=sc.nextInt();

		factorial=1;
		
		for (int i=num; i>0; i--) {
			factorial=factorial*i;
		}
		
		System.out.println("El factorial de " + num + " es: " + factorial);
		
		System.out.println("");
	}
	
}
