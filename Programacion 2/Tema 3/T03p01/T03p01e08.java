import java.util.Scanner;
public class T03p01e08{

	public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
	
		int num;
		int contador=1;
		int factorial=1;
		
		System.out.print("Introduce un numero: ");
		num=sc.nextInt();
		
		do { 
			factorial = factorial*contador;
			
			contador++;
		}while(contador<=num);
		
		System.out.print("El factorial de "+num+ " es: "+factorial);
	
	}
}
