
import java.util.Scanner;

public class T03p03e04 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num, contador;
		
		System.out.print("Introduzca un numero: ");
		num=sc.nextInt();

		contador=0;
		
		while (num>0) {
			contador=contador+1;
			System.out.print("Introduzca otro numero: ");
			num=sc.nextInt();
		}

		System.out.println("Se han introducido: " + contador + " numeros.");
		
		System.out.println("");
	}
	
}
