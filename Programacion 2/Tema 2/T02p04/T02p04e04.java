import java.util.Scanner;
public class T02p04e04 {

	public static void main (String[] args) {
	Scanner sc=new Scanner (System.in);

		final float PI=3.14159265358979323846f;
		float R=7.75f;  //Division del diametro entre 2
		float A=42.4f;
		float area;
		float cuadrado;
		float volumen;
		
		cuadrado= R*R;
		area = ((2*PI*cuadrado)+(2*PI*R*A));
		
		System.out.println("Para un cilindro de radio 7,75 y altura 42,40");
		
		System.out.printf("El area es: %.2f \n",area);
		
		System.out.printf("El cilindro es: %.2f \n",PI*cuadrado*A);
		

	}
}
