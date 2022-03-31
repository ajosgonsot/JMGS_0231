
import java.util.Scanner;

public class T03p03e06 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num,suma_total;
		
		suma_total=0;
		
		for (int i=1; i<=5; i++) {
			System.out.print("Introduzca un numero: ");
			num=sc.nextInt();
			suma_total=suma_total+num;
		}
		
		System.out.printf("La suma total es: %d\n",suma_total);
		System.out.printf("La media aritmetica de: %.2f\n",suma_total/(double)5);
		
		System.out.println("");
	}
	
}
