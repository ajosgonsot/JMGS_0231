import java.util.Scanner;
import java.lang.Math;

public class t03p01e01 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	double radio;
	double area; 
	
	System.out.printf("Introduce el radio de un circulo:");
	radio=sc.nextDouble();
	area=Math.PI*Math.pow(radio,2);
	System.out.printf("El area de una circuferencia de radio %.2f es : %.2f",radio,area);
	
	
	}
}
