import java.util.Scanner;
public class T04p03e05{

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
		System.out.print("Introduzca el numero a borrar: ");
		int borrar = sc.nextInt();
		int pos=-1;
		
		do{
			pos++;
			
		} while (pos!=num1.length && num1[pos]!=borrar);
	
		if (pos<num1.length)
		{
			for (int i = 0; i < num1.length; i++){
				if (num1[i]>pos && i<num1.length-1){
					num1[i] = num1[i+1];
				}
			}
			num1[num1.length-1] =  0;
			
		}

		System.out.println();
		System.out.println("El array resultado es: ");
		for (int i=0; i < num1.length; i++){
			System.out.print(num1[i]+ " ");
		}
	}
}
