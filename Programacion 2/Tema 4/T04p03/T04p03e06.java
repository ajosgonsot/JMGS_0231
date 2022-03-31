import java.util.Scanner;
public class T04p03e06{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] num1 = new int[5];
		int[] guardar = new int[5];
		
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
		System.out.println();

		int menor=10000, pos=-1;
		
		for (int i = 0; i < guardar.length; i++){
			menor=10000;
			for (int j = 0; j < num1.length; j++){
				if (num1[j]<menor && num1[j]!=0){
					menor = num1[j];
					pos = j;
				}		
			}
			guardar[i] = menor;
			num1[pos] = 0;
		}
		
		menor=10000;
		for (int i = 0; i < guardar.length; i++){
			if (guardar[i]==menor){
				guardar[i]=0;
			}
		}
		
		System.out.println();
		System.out.println("El array resultado es: ");
		for (int i=0; i < guardar.length; i++){
			System.out.print(guardar[i]+ " ");
		}
	}
}
