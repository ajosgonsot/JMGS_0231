import java.util.Scanner;
public class t03p01e09{

		public static void main (String[] args){
	
				
		Scanner sc=new Scanner(System.in);
		
		int num1;
		int contador=0;
		int cero=0;
		int NumeroPositivos=0;
		int suma=0;
		float resultado=0F;

		do {
			System.out.printf("Introduce un numero: ");
			num1 = sc.nextInt();
			
			contador++;
			
			if (num1>0) {
				NumeroPositivos++;
			}

			if (num1==0) {
				cero++;
			}
				
			suma = suma+num1;
		
		} while (contador<5);
		
		System.out.println("El numero de ceros introducido son:  "+cero);
		
		resultado = (float) suma/NumeroPositivos;
		
		if(resultado<0){
			System.out.println("No se puede hacer la media de los negativos!!");
		} else {
			System.out.printf("La media de los positivos son :  %f\n",resultado);
			
			
		}	
	}	
}
