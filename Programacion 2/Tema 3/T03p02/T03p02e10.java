import java.util.Scanner;
public class T03p02e10{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			final double PI =3.1415; 
			
			System.out.print("Introduce un valor para el radio: ");
			double radio =sc.nextDouble();
			
			
			
			double area = PI *Math.pow(radio,2);
			double longitud = 2* PI *radio;
			
			
			
			System.out.printf("La longitud de una circunferencia de radio %.2f es: %.2f\n",radio,longitud); 
			System.out.printf("El area de una circunferencia de radio %.2f es: %.2f\n",radio,area);

			
			
			
			
			
			
			
	}
}
