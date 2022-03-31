import java.util.Scanner;
public class T04p03e01{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] num1 = new int[5];
		int pos=-1;
		
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
		System.out.print("Introduzca el numero a buscar: ");
		int buscar = sc.nextInt();
		
		
		for (int i = 0; i < num1.length; i++){
			if (num1[i]==buscar){
				pos=i;
			}
		}
		
		System.out.print(" Numero "+buscar+" en posicion "+pos);
		
	}
}
