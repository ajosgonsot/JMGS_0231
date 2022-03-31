import java.util.Scanner;
public class T02p03e04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n;
	
		System.out.print("Introduce un numero: ");
		n=sc.nextInt();
		
		n--;
		System.out.printf("Numero n -1 es : %d\n",n);
		
		String parim = "";
		parim=(n%2==0)? "par" : "impar";
		System.out.printf("El numero introducido es: %s\n",parim); 


	}

}
