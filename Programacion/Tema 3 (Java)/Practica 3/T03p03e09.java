import java.util.Scanner;

public class T03p03e09 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	int numero;
	int  unidadmillar, centenas, decenas, unidades;


	System.out.print("Introduzca un numero entre 0 y 9.999: ");
	numero=sc.nextInt();

		unidades = numero % 10;
		numero = numero / 10;

		decenas = numero % 10;
		numero = numero / 10;

		centenas = numero % 10;
		numero = numero / 10;

		unidadmillar = numero % 10;
		numero = numero / 10;

		numero = 1000*unidades + 100*decenas + 10*centenas + 1*unidadmillar ;
		System.out.println (numero);
	
	}
	
}
