import java.util.Scanner;

public class T04p01e05 {
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num[] = new int[5];
		boolean creciente=false, decreciente=false;
		
		System.out.println("Leyendo numeros: ");
		for(int i=0;i<5;i++){
			System.out.print("Introduzca un numero: ");
			num[i] = entrada.nextInt();
		
		}
		
		for(int i=0;i<4;i++) {
			if (num[i] < num[i+1]) {
				creciente = true;
			}
			if(num[i] > num[i+1]) {
				decreciente = true;	
			}	
		}
		
		if(creciente==true && decreciente==false) {
			System.out.println("\nSerie creciente");
		}	
		else if(creciente==false && decreciente==true) {
			System.out.println("\nSerie decreciente");
		}
		else if(creciente== true && decreciente== true) {
			System.out.println("\nSerie desordenada");
		}
		else if(creciente==false && decreciente== false) {
			System.out.println("\nTodos los numeros son iguales");
	
	   }
	}
}
		
