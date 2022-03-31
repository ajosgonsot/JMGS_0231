import java.util.Scanner;
public class ejercicio2{
	
	public static void main(String []args){
	//Acertar un numero y tienes 3 intentos, y saber si es mayor o menos al indicado

	Scanner sc=new Scanner(System.in);
	
	
	int contador=0;
	
	int numero;
	
	int azar=(int)(Math.random()*10+1);
	do{
		
		System.out.print("Introduce un numero: ");
		
		numero=sc.nextInt();	
		contador++;

			if (contador<3){
				
				System.out.println("Tiene hasta 3 intentos: "+contador+"");
				
			}  
			
			if(azar>numero){
				
				System.out.println("Mayor");
				
			} else if (azar<numero) {
				
				System.out.println("Menor");

			} else {
			 
			System.out.println("Has acertado");
			break;
			}
		
	}while(contador<3);
		
	
		
		
		
		
	}
}
	
	
