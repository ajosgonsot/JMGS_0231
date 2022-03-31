
import java.util.Scanner;

public class T03p05e05 {
	
	private static boolean esPrimo(int num) {
		
		boolean primo=true;
		int i=2;
		
		while (i<num && primo) {
			if (num%i==0) {
				primo=false;
				break;
			}
			i++;
		}
		return primo;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.print("Introduzca un numero: ");
		num=sc.nextInt();
		System.out.printf("El numero %d es primo? %s\n",num,esPrimo(num));
		
		System.out.println("");
	}
	
}
