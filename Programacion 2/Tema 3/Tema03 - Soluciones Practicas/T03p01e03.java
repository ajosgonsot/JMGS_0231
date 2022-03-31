
import java.util.Scanner;

public class T03p01e03 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		
		System.out.print("Introduce un numero: ");
		n1=sc.nextInt();
		System.out.print("Introduce otro numero: ");
		n2=sc.nextInt();
		
		if (n1>n2) {
			System.out.println("De mayor a menor: " + n1 + " y " + n2);
		} else {
			System.out.println("De mayor a menor: " + n2 + " y " + n1);
		}
		
		System.out.println("");
	}
	
}
