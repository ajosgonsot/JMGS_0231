import java.util.Scanner;

public class T04p01e02 {
public static void main (String[] args) {
	
	Scanner sc = new Scanner(System.in);
		int suma=0;
		int[] numero = new int[5];
		for (int i=0; i<numero.length; i++) {
			System.out.print("Introducir un numero: "); 
			numero[i] = sc.nextInt();
			suma = suma+numero[i];
		}
		
		System.out.print("La suma acumulada de todos los numeros es: "+suma);
	
	}
	
}
