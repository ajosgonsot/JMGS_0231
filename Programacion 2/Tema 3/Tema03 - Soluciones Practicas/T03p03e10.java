
import java.util.Scanner;

public class T03p03e10 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		
		System.out.print("Introduce un numero: ");
		n1=sc.nextInt();
		System.out.print("Introduce otro numero: ");
		n2=sc.nextInt();
		
		if (n1%n2==0) {
			System.out.println("Son multiplos.");
		} else {
			System.out.println("No son multiplos.");
		}
		
		System.out.println("");
	}
	
}
