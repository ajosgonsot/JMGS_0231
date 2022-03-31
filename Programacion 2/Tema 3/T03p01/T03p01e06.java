import java.util.Scanner;
public class T03p01e06{

	public static void main (String[] args){
	Scanner sc=new Scanner (System.in);

		
		int num;

			
			System.out.print("Introduce un numero: ");
			num = sc.nextInt();
			
			while(num!=0){
		
				if(num>0){
					System.out.println("Es positivo");
				
				}else {
					System.out.println("Es Negativo");
				}
			System.out.print("Introduzca otro numero: ");
			num = sc.nextInt();

		}
	}
}
