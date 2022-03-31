import java.util.Scanner;
public class ejercicio4{
	
	private static boolean esPrimo(int num) {
		//Introducir rangos validos del 1 al 10
		boolean primo=true;
		int i=2;
		
		while (i<num && primo) {
			if (num%i==0) {
				primo=false;
				break;
			}
			i++;
		}
		return primo;
	}
	
	public static void main (String []args){	

	
		Scanner sc= new Scanner(System.in);
	
		int rango1;
		int rango2;
		int contador=0;
		int noprimos=0;
	
			do{
			
				
				System.out.print("Introduce el primer rango(1): " );
				rango1=sc.nextInt();
				
				System.out.print("Introduce el segundo rango(10): " );
				rango2=sc.nextInt();
				
			
				
				
			} while(rango1!=1 || rango2!=10);
			
			for(int i=rango1; i<=rango2; i++){
				if(esPrimo(i)){
					
					contador++;
					System.out.println(""+i);
				}else{
					noprimos++;	
					//System.out.println(""+i);
				}
				
			}
		
	
		System.out.printf("Los numeros primos  del principio del rango es: %d y al final del rango es : %d son los siguientes si primos: %d  y no primos %d  ",rango1,rango2,contador,noprimos);
	
	}
}
