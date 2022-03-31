import java.util.Scanner;
public class T04p01e02{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int [5];
		int numero=0;
		
		for(int i=0; i < array.length; i++){
			System.out.print("Introduce un numero: ");
			numero = sc.nextInt();
			array[i] = numero;
		}
		
		int suma=0;
		for(int j= array.length-1; j>=0; j--){
			suma= suma + array[j];
		}
		
		System.out.println("La suma acumulada de todos los numeros es: "+suma);
	}
}
