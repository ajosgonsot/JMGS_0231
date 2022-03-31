import java.util.Scanner;
public class T02p04e01 {

	public static void main (String[] args) {
	Scanner sc=new Scanner (System.in);
	
		char nota;
		float nota1=0;
		float nota2=0;
		float notafinal;

		System.out.println("Notas de programacion");
		
		System.out.println("Nota del primer parcial: ");
		nota1 = sc.nextFloat();
		
		System.out.println("Nota del segundo parcial: ");
		nota2 = sc.nextFloat();
		
		notafinal = (nota1 + nota2) / 2;
		
		System.out.printf("Resultado final: %f",notafinal);
	}

}
