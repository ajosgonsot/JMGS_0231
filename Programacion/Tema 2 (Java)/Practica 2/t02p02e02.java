import java.util.Scanner;

public class t02p02e02 {
	
	public static void main (String[] args){
		
		char letra;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un caracter: ");	
		letra = sc.next().charAt(0);


		System.out.println("El caracter introducido es: "+letra);
	
		}
	
	}
