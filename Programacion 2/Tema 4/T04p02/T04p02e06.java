import java.util.Scanner;
public class T04p02e06{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		int[][] array = new int[3][3];
		boolean simetrico=true;
		
		
			for (int i=0; i < array.length; i++){
				for (int j=0; j < array[i].length; j++){
					System.out.print("Introduzca un elemento ["+i+"]["+j+"]: ");
					array[i][j]=sc.nextInt();
				}
			}
			
			System.out.println();
			
			System.out.println("El Array introducido es: ");
			for (int i=0; i < array.length; i++){
				for (int j=0; j < array[i].length; j++){
					System.out.print(array[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			
			for (int i=0; i < array.length; i++){
				for (int j=0; j < array[i].length; j++){
					if (array[i][j]==array[j][i]){
						simetrico=true;
					}else{
						simetrico=false;
						break;
					}
				}
			}
			if (simetrico==true){
				System.out.println("SIMETRICO");
			}else{
				System.out.println("ASIMETRICO");
			}
	}
}
