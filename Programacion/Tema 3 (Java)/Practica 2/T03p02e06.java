import java.util.Scanner;
import java.lang.Math;

public class T03p02e06 {	
	
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
    
		int num1;
        int num2;
        int contador=0;
        int suma=0;
        float media=0F;
    
        System.out.print("Ingresa un numero: ");
		num1= sc.nextInt();
		
		do{
			System.out.print("\n Introdruzca otro numero : ");
			num2 = sc.nextInt();
			contador++;
    
			suma=suma+num1;
     
		}while (num2 > 0);  
    
		if (contador==0 && num1==0){
			System.out.println("No se puede hacer la media");//Mensaje que aparecera cuando no se pueda hacer la media
		
		}else{
				
			media= (float)suma/contador;
			System.out.println("La media es: "+media);//Calculo de la media de los numeros anteriores
	
		}
    
	}
}
