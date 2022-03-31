import java.util.Scanner;
public class T04p01e05{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] array1 = new int [3];	
		int[] array2 = new int [3];
		int[] array3 = new int [6];
		
		
		System.out.println("Leyendo Array 1... ");
		
		for(int i=0; i < array1.length; i++){
			System.out.print("Introduce un numero: ");
			array1[i] = sc.nextInt();
		}
		
		System.out.println("Leyendo Array 2... ");
		
		for(int i=0; i < array2.length; i++){
			System.out.print("Introduce un numero: ");
			array2[i] = sc.nextInt();
		}
		System.out.println(" ");
		System.out.print(" El array1 es:  ");
		for(int i=0; i < array1.length; i++){
			System.out.print(array1[i]+" ");
		}
		System.out.println(" ");
		System.out.print(" El array2 es:  ");
		for(int i=0; i < array2.length; i++){
			System.out.print(array2[i]+" ");
		}
		int j=0;
		for (int i=0; i<array1.length; i++){
			array3[j]=array1[i];
			j=j+2;
		}
		j=1;
		for (int i=0; i<array2.length; i++){
			array3[j]=array2[i];
			j=j+2;
		}
		System.out.println(" ");
		System.out.print(" El array3 es:  ");
		for(int i=0; i < array3.length; i++){
			System.out.print(array3[i]+" ");
		}
	}
}
