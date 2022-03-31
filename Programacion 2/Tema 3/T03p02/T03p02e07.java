import java.util.Scanner;
public class T03p02e07{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

			int num = 1;
			
			System.out.print("Numeros impares: ");
			for(int i=1; i<21; i = i+2){
				System.out.print(" "+i);

				num = num*i;
			}
			
			System.out.printf("\nEl producto de los 10 primeros numeros positivos impares: "+num);
	
	}
}
