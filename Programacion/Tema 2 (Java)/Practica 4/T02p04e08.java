import java.util.Scanner;
public class T02p04e08 {
	
	public static void main (String[] args) {
		
	int lado;
	float area;
	float perimetro;
	float raiz;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.printf("Introduce el valor del lado: ");
	
	lado = sc.nextInt();

	raiz = (float)Math.sqrt(3);
	
	area = (lado*lado*(raiz*lado/2)/2);
	
	perimetro = 3*lado;
	
	
	System.out.printf("El area del triangulo de lado %d es: %f\n",lado,area);
	System.out.printf("El perimetro del triangulo de lado %d es: %f\n",lado,perimetro);


		}

	}
