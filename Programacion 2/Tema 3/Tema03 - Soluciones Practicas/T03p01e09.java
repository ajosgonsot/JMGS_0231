
import java.util.Scanner;

public class T03p01e09 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		int cont_ceros=0;
		int cont_pos=0;
		int cont_neg=0;
		int suma_pos=0,suma_neg=0;
		float media_pos,media_neg;
		
		for (int i=1; i<=5; i++)	{
			System.out.print("Introduce numero: ");
			num=sc.nextInt();
			if (num==0) {
				cont_ceros++;
			} else {
				if (num>0) {
					cont_pos++;
					suma_pos+=num;
				} else {
					cont_neg++;
					suma_neg+=num;
				}
			}
		}
		
		System.out.println("");
		
		System.out.println("El numero de ceros introducidos es de: "+cont_ceros);

		if (cont_pos==0) {
			System.out.println("No se puede hacer la media de los positivos!!");
		} else {
			media_pos=suma_pos/(float)cont_pos;
			System.out.printf("Media de los positivos es: %.2f\n",media_pos);
		}

		if (cont_neg==0) {
			System.out.println("No se puede hacer la media de los negativos!!");
		} else {
			media_neg=suma_neg/(float)cont_neg;
			System.out.printf("Media de los negativos es: %.2f\n",media_neg);
		}
		
		System.out.println("");
	}

}
