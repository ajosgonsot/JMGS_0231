
import java.util.Scanner;

public class T03p05e03 {
	
	private static int suma_n_impares(int n) {
		
		int suma=0;
		
		for (int i=1; i<=n; i++) {
			suma=suma+(2*i-1);
		}
		
		return suma;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.print("Introduzca un numero: ");
		num=sc.nextInt();
		System.out.printf("La suma de los %d primeros numeros impares es %d\n",num,suma_n_impares(num));

		System.out.println("");
	}
	
}
