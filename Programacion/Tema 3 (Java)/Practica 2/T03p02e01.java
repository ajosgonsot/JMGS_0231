import java.util.Scanner;
import java.lang.Math;

public class T03p02e01 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		double cuadrado,x1,x2,a,b,c;
		
		do{	
			System.out.print("Introduce el valor de a: ");
			a= sc.nextDouble();	
			if(a==0){
			System.out.println("A no puede ser cero");
			}
			
		
		}while(a==0);
				
		System.out.print("Introduce el valor de b: ");
		 b= sc.nextDouble();
			
		System.out.print("Introduce el valor de c: ");
		 c= sc.nextDouble();
		
		cuadrado=((b*b)-4*a*c);
		
		
		
		if (cuadrado<0){
			System.out.println("No existe soluciones realaes");
		}	else{
				x1=(-b+Math.sqrt(cuadrado))/(2*a);
				x2=(-b-Math.sqrt(cuadrado))/(2*a);
				
				System.out.printf("El valor x1 es de: %.2f ",x1);
				System.out.printf("El valor x2 es de: %.2f ",x2);
			}
		
		}
}
