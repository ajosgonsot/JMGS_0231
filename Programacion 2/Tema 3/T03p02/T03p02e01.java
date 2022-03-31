import java.util.Scanner;
import java.lang.Math;
public class T03p02e01{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el primer coeficiente(a): ");
		int a=sc.nextInt();
		
		System.out.print("Introduzca el primer coeficiente(b): ");
		int b=sc.nextInt();
		
		System.out.print("Introduzca el primer coeficiente(c): ");
		int c=sc.nextInt();
		
		double ecu2GrPos = ((-b) + (Math.sqrt((Math.pow(b,2) -4 *a *c)))) / (2 *a);
		double ecu2GrNeg = ((-b) - (Math.sqrt((Math.pow(b,2) -4 *a *c)))) / (2 *a);
		
		System.out.printf("%.2f y %.2f",ecu2GrPos,ecu2GrNeg);
	
	}
}
