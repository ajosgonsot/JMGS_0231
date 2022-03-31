import java.util.Scanner;
public class T02p04e07 {
	
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	
		int importe=0;
		double interes;
	
		System.out.printf("Marque un importe: ");
	
		importe = sc.nextInt();
	
		System.out.printf("Calculo de intereses.\n");
		System.out.printf("Dinero ingresado: %d\n",importe);
		System.out.printf("Interes anual: 2.75 \n");
	
		interes=(float)(importe*2.75/100)*6/12;
	
		System.out.printf("Interes a los 6 meses: %f\n",interes);
		System.out.printf("Retencion realizada: %f\n",interes*18/100);
		System.out.printf("Intereses cobrados: %f\n",interes*82/100);
	
		
		}

	}
