import java.util.Scanner;
public class T03p03e04{

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int numero;
		int contador=0;
	
		System.out.print("Introduce un numero: ");
		numero = sc.nextInt();
		
		
		while (numero>0) {
			contador++;
			System.out.print("Introduce otro numero: ");
			numero = sc.nextInt();
			
			}
	
		System.out.print("Se han introducido: "+contador);
	
		
		
	}
}
