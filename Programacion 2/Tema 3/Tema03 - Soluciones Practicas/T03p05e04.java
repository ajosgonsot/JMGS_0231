
import java.util.Scanner;

public class T03p05e04 {
	
	private static void informacionAngulo(double n) {
		
		// como las funciones que calculan el seno, coseno y tangente trabajan en
		// radianes, hemos de pasar n de grados a radianes
		n=Math.PI/180*n; // otra forma sería n = Math.toRadians(n);
		System.out.printf("Seno: %.2f\n",Math.sin(n));
		System.out.printf("Coseno: %.2f\n",Math.cos(n));
		System.out.printf("Tangente: %.2f\n",Math.tan(n));
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double angulo;
		
		System.out.print("Introduzca un angulo (0..360): ");
		angulo=sc.nextDouble();
		
		informacionAngulo(angulo);
		
		System.out.println("");
	}
	
}
