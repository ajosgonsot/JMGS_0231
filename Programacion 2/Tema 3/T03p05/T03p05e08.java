import java.util.Scanner;
public class T03p05e08 {
	
	public static String binario(int numero){
		
		String resultado;
		
		resultado = Integer.toBinaryString(numero);
		
		return resultado;

	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int numero;
		String resultado;

		System.out.print("Introduzca un numero (0..255): ");
		numero = sc.nextInt();
		
		resultado=binario(numero);
		
		System.out.print("El numero "+numero+" en binario es: "+resultado);
	}

}
