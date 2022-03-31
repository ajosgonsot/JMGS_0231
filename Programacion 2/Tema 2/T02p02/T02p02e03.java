import java.util.Scanner;

public class T02p02e03 {
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
		
	float num1=1.2F;
	double num2=5.3;
	double temporal;
	
	System.out.println("El valor de num1 es: "+num1);
	System.out.println("El valor de num2 es: "+num2);
	
	temporal = (double)num1; //Guardamos el valor de num1 en temporal
	num1 = (float)num2;      //Guardamos el valor de num2 en num1
	num2 = (double)temporal; //Guardamos el valor de temporal en num2	
	
	System.out.println("El valor de num1 ahora es: "+num1);
	System.out.println("El valor de num2 ahora es: "+num2);
			
	}
 
}
