import java.util.Scanner;

public class t04p01e05{

public static void main (String [] args){
	
	Scanner sc= new Scanner (System.in);
	
	
	int[] numero = new int[5];
	int creciente=0;
	int decreciente=0;
	int j=0;

	
	System.out.println("Leyendo numeros: ");
		
	for (int i=0; i<numero.length; i++){
		System.out.print("Introduce un numero: ");
		numero[i]=sc.nextInt();	
	}	
		
	for ( int i=0; i<numero.length-1; i++){
			
		j++;
			
		if (numero[i]<numero[j]) {
			creciente++;
		} else if (numero[i]>numero[j]) {
			decreciente++;
		}
				
	}
	
	System.out.println("");
	System.out.println("El array introducido es:");
	for (int i=0; i<numero.length; i++){
		System.out.print(numero[i]);
			
	}
	System.out.println("");
		
	if (creciente==numero.length-1) {
		System.out.print("Serie creciente");
		
	} else if (decreciente==numero.length-1) {
		System.out.print("Serie decreciente");
		
	} else if (creciente==0 && decreciente==0) {
		System.out.print(" Serie igual");
	} else {
		System.out.print("Serie desordenada");
	}	
	
	}		
}
       


