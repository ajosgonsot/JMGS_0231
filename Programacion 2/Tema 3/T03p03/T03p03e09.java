import java.util.Scanner;
public class T03p03e09 {

	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		
		int numero;
		int invertido=0;
		int resto;
		
		
		System.out.print("Introduce un numero entre 1000 y 9999: ");
		numero = sc.nextInt();
		
		while (numero > 0) {
			resto = numero % 10;
			invertido = invertido * 10 + resto;
			numero /= 10;
			}
			
			System.out.println("El numero invertido es "+invertido);
			
		}
	}
	
