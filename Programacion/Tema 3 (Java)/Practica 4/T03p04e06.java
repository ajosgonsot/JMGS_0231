import java.util.Scanner;

public class T03p04e06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int contador=0;
		int sueldopositivo=0;
		int cantidad=0;
		double sueldo=0;
		double resultado=0;
		double suma=0;
		
		System.out.print("Cuantos sueldos hay? : ");
		cantidad=sc.nextInt();
		
		do {
			System.out.print("Introduce un sueldo: ");
			sueldo=sc.nextDouble();
			contador++;;
			
			if (sueldo>1000) {
				sueldopositivo++;
			}
			suma=suma+sueldo;
		} while (contador<cantidad);
		
		resultado=suma/contador;
		
		System.out.print("Mayores de 1000 hay: "+sueldopositivo);	
		System.out.printf("\n La media es de: %.2f",resultado);
	}




}
