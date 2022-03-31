import java.util.Scanner;

public class T03p04e04 {

public static void main (String[] args) {
				
Scanner sc=new Scanner(System.in);

	
	int num1;
	int suma=0;
	int cont=0;
	float media=0;
	float positivo=0;

	
	do{
		System.out.print("Introduce un numero: ");
		num1=sc.nextInt();
		cont++;
		suma=suma+num1;
			
			if (num1>0){
				positivo++;	
				
		
			media=suma/positivo;
			}
		
	}while(num1>0);
	
	
	System.out.println("La suma de todo los numeros es :  "+suma);
	System.out.println("La media de todo los numeros es :  "+media);



	}
}
