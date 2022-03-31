import java.util.Scanner;
public class T04p02e04{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[][] array = new int[6][4];

		for(int i=0; i< array.length; i++){
			for(int j=0; j< array[i].length; j++){
				if(i==0 || j==0 || i==array.length-1 || j==array[i].length-1){
					array[i][j]=1;
				}
			}	
		}
		System.out.println();
			
		System.out.println("El Array resultado es: ");
		for (int i=0; i < array.length; i++){
			for (int j=0; j < array[i].length; j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
