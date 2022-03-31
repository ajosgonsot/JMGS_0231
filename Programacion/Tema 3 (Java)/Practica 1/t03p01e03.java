import java.util.Scanner;
import java.lang.Math;

public class t03p01e03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		int maximo=1;
		int minimo=99999;
	
		System.out.println("Introduce un numero: ");
		num1=sc.nextInt();
		System.out.println("Introduce otro numero: ");
		num2=sc.nextInt();
	
		if (num1>num2) {
		
			maximo=num1;
			minimo=num2;
		} else if (num1<num2) {
			
			maximo=num2;
			minimo=num1;
		} 
	
		System.out.printf("De mayor a menor: %d y %d",maximo,minimo);

	
	}
}	
