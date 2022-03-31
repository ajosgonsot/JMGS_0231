import java.util.Scanner;
public class T04p02e02{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		int[][] array = new int[3][3];
		
			for (int i=0; i < array.length; i++){
				for (int j=0; j < array[i].length; j++){
					System.out.print("Introduzca un elemento ["+i+"]["+j+"]: ");
					array[i][j]=sc.nextInt();
				}
			}
			
			System.out.println();
			
			System.out.println("Array original");
			for (int i=0; i < array.length; i++){
				for (int j=0; j < array[i].length; j++){
					System.out.print(array[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.println("Array transpuesto");
			for (int i=0; i < array.length; i++){
				for (int j=0; j < array[i].length; j++){
					System.out.print(array[j][i]+" ");
				}
				System.out.println();
			}
	}
}

//Son dos for anidados y depende de como lo saques funciona
