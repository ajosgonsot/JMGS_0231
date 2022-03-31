import java.util.Scanner;
public class T04p03e04{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] num1 = new int[5];
		
		System.out.println("Leyendo datos...");
		
		for (int i = 0; i < num1.length; i++){
			System.out.print("Introduce un numero: ");
			num1[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("El array introducido es: ");
		for (int i=0; i < 5; i++){
			System.out.print(num1[i]+ " ");
		}
		
		System.out.println();
		System.out.print("Introduzca la posicion (0..4) del numero a borrar: ");
		int pos = sc.nextInt();
		
		for (int i=0; i < num1.length; i++){
			if(i>=pos && i<num1.length-1){
				num1[i] = num1[i+1];
				}
			}
		
			num1[num1.length-1] = 0;
			
		System.out.println();
		System.out.println("El array resultado es: ");
		for (int i=0; i < num1.length; i++){
			System.out.print(num1[i]+ " ");
		}
	}
}
