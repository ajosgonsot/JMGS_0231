import java.util.Scanner;
public class T03p03e06{

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);


		int num1;
		int suma=0;
		int contador=0;
		float media;
		
		do{
			System.out.print("Introduce un numero: ");
			num1 = sc.nextInt();
			contador++;
			suma = suma + num1;
			media = (float)suma/contador;
		} while (contador<5);
		
			System.out.println("La suma total es: "+suma);
			System.out.printf("La media aritmetica de: %.2f",media);
		
	}
}
