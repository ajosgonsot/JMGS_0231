import java.util.Scanner;
import java.lang.Math;

public class T03p02e02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero1;
		int numero2;
		int maximo=0;
		int minimo=999;
	
		System.out.println("Introduce un numero: ");
		numero1=sc.nextInt();
		System.out.println("Introduce otro numero: ");
		numero2=sc.nextInt();
	
		if (numero1>numero2) {
		
			maximo=numero1;
			minimo=numero2;

		} else if (numero1<numero2) {
			
			maximo=numero2;
			minimo=numero1;

		} else {
			
			System.out.println("Los numeros son iguales");
		} 
	
			System.out.printf("De mayor a menor: %d y %d",maximo,minimo);

	
	}
}
