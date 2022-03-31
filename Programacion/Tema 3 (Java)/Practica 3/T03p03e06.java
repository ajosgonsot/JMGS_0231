import java.util.Scanner;

public class T03p03e06 {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int num1;
	int cont=0;
	double suma=0;
	double result=0;
		
	
		do{
	
			System.out.print("Introduzca un  numero: ");
			num1=sc.nextInt();
			cont++;
			suma=suma+num1;
			result= suma/5;
	
		}while(cont<5);
				
		System.out.printf("La suma total es : %.0f \n",suma);
		System.out.printf("La suma total es : %.2f ",result);
	
	}
}
