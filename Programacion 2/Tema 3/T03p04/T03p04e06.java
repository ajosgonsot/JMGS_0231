import java.util.Scanner;
public class T03p04e06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N;
		int sueldo;
		int contadorSueldos=0;
		int contador=0;
		int suma=0;
		float media;
		
		System.out.print("Cuantos sueldo: ");
		N = sc.nextInt();
		
		
		do{
			System.out.print("Escribe un sueldo: ");
			sueldo = sc.nextInt();
			contador ++;
			
		if (sueldo > 1000 ){
			contadorSueldos++;
			
			}
			suma = suma + sueldo;
			media=(float)suma/contador;
			
			
			
		} while (contador <N );
		
		
		System.out.println("Mayores de 1000 hay: "+contadorSueldos);
		System.out.printf("La media es de: %.2f",media);
	
	}
}
		
