import java.util.Scanner;
public class T03p05e07 {
	
	private static int potencia(int base, int exponente){
		
		int resultado;
		
		resultado = (int)Math.pow(base,exponente);
		
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		 
		int base;
		int exponente;
		int resultado;

		
		System.out.print("Introduzca la base: ");
		base = sc.nextInt();
		System.out.print("Introduzca el exponente: ");
		exponente = sc.nextInt();
		
		resultado=potencia(base,exponente);
		
		System.out.print(+base+" elevado a "+exponente+" = "+resultado);
		
	}

}
