import java.util.Scanner;
public class t03p01e06{

	public static void main (String[] args){
	
			
		int numero;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Introduzca un numero (0:fin): ");
		numero = sc.nextInt();
		
		while (numero!=0) {
			
				
			if (numero>0) {
				System.out.print("Positivo \n");
			} else {
				System.out.print("Negativo \n");
			}
			
		
		System.out.print("Introduzca otro numero (0:fin): ");
		numero = sc.nextInt();
		
		
		}
	
	
	
	}


}
