import java.util.Scanner;
public class T02p04e01{
	
	public static void main (String[] args) {
		
	Scanner sc=new Scanner (System.in);
	
	float primeranota;
	float segundanota;
	float notafinal;
	
		System.out.printf("Notas de programacion.\n ");
		System.out.printf("Nota del primer parcial: ");
		
		primeranota = sc.nextInt();
		
		System.out.printf("Nota del segundo parcial: ");
		
		segundanota = sc.nextInt();
		
		notafinal = (primeranota + segundanota) / 2;
		
		System.out.printf("Resultado final: %f",notafinal);
		
		
	}
	
}
