
import java.util.Scanner;

public class T03p03e05 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n, num;
		
		System.out.print("Introduce N (numero a acertar): ");
		n=sc.nextInt();
		
		System.out.println("");
		
		System.out.print("Introduce un numero: ");
		num=sc.nextInt();
		
		while (num!=n) {
			if (num>n) {
				System.out.println("fallaste, es menor!!");
			} else {
				System.out.println("fallaste, es mayor!!");
			}
			System.out.print("Introduce otro numero: ");
			num=sc.nextInt();
		}
		System.out.println("enhorabuena, acertaste!!");
		
		System.out.println("");
	}
	
}
