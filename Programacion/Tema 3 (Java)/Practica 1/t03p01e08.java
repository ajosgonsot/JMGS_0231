import java.util.Scanner;

public class t03p01e08 {
		public static void main(String[] args) {

	
	
	Scanner sc=new Scanner(System.in);

		int factorial= 1;
		int n;
	
		System.out.print("Introduce un numero ");
		n = sc.nextInt();
	
	
		for (int i=1; i<=n;  i++){
		factorial=factorial*i;	
		System.out.println(" El factorial del "+ n +" es : " +factorial);

		}
	}
}
