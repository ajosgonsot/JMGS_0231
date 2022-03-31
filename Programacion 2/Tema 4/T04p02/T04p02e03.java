import java.util.Scanner;
public class T04p02e03{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		int[][] array = new int[5][5];
		
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){
				if (i==j){
					array[i][j]=1;
				}	
			}
		}
		System.out.println();
		
		System.out.println("El array resultado es: ");
		
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){	
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
