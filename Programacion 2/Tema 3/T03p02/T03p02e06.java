import java.util.Scanner;
public class T03p02e06{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			double media = 0;
			int cont = 0;
			
			System.out.print("Introduce un numero: ");
			int num1 = sc.nextInt();
			
			while(num1 >= 0){
				
				System.out.print("Introduce otro numero: ");
				num1 = sc.nextInt();
				
				media = media +num1;
				cont++;
				
		
			}
			cont--;
			
			media = media / cont;
			System.out.printf("La media es: %.2f",media);
		
	}
}
