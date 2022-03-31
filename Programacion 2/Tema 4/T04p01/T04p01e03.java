import java.util.Scanner;
public class T04p01e03{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int [5];
		int contadorPares=0;
		
		
		for(int i=0; i < array.length; i++){
			System.out.print("Introduce un numero: ");
			array[i] = sc.nextInt();
		}
		for(int i=0; i< array.length; i++){
			if(array[i]%2==0){
				contadorPares++;		
			}
		}
		System.out.print("La cantidad de numeros pares introducidos es: "+contadorPares);
		
	}
}
