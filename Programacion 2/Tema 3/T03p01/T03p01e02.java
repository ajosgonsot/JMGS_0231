import java.util.Scanner;
import java.lang.Math;

public class T03p01e02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		int y;
		
		System.out.print("Introduce un numero: ");
		x=sc.nextInt();
		System.out.print("Introduce otro numero: ");
		y=sc.nextInt();

		if(x==y){
			
			System.out.println(" Los numeros son iguales ");

		} else {
			
			System.out.println(" No son iguales ");

		}
	
	}
}
