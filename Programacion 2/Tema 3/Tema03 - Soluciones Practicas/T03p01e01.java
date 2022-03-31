
import java.util.Scanner;

public class T03p01e01 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double area,radio;
		
		System.out.print("Introduce el radio de un circulo: ");
		radio=sc.nextDouble();
		
		area=Math.PI*Math.pow(radio,2);
		
		System.out.printf("El area de una circunferencia de radio %.2f es: %.2f\n",radio,area);
		
		System.out.println("");
	}
	
}
