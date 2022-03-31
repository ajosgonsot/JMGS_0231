
import java.util.Scanner;

public class T03p01e10 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		int fila, col;
		
		System.out.print("Lado del cuadrado: ");
		n=sc.nextInt();
		
		System.out.println("");

		for (fila=1; fila<=n; fila++) {
			for (col=1; col<=n; col++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		System.out.println("");
	}
	
}
