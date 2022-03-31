import java.util.Scanner;
public class T04p01e04{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int [5];	
		boolean resultado=true;
		
		for(int i=0; i < array.length; i++){
			System.out.print("Introduce un numero: ");
			array[i] = sc.nextInt();
		}
		for(int i=0; i < array.length; i++){
			if(array[0]<array[1]){
				resultado = true;
			} else{
				resultado = false;
			}
		}
		if(resultado==true){
			System.out.print("Es ascendente ");
		} else {
			System.out.print("Es descendente ");	
		}
	}
}
