
import java.util.Scanner;

public class T03p03e01 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.print("Introduce un numero: ");
		n1=sc.nextInt();
		System.out.print("Introduce otro numero: ");
		n2=sc.nextInt();
		System.out.print("Introduce otro numero: ");
		n3=sc.nextInt();

		if (n1>=n2 && n1>=n3) {
			System.out.println(n1 + " es el mayor.");
		} else if (n2>=n1 && n2>=n3) {
			System.out.println(n2 + " es el mayor.");
		} else if (n3>=n1 && n3>=n2) {
			System.out.println(n3 + " es el mayor.");
		}
		
		System.out.println("");
	}
	
}
