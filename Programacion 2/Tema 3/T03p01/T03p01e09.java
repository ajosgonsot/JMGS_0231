import java.util.Scanner;
public class T03p01e09{

	public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
	
		int num;
		int contador=0;
		int contadorceros=0;
		int contadorpositivos=0;
		int sumapositivos=0;
		float mediapostivos=0;
		
		
		do {
			
			System.out.print("Introduce un numero: ");
			num = sc.nextInt();
			
			if(num<0){
				System.out.println("No se puede hacer la media de los numeros negativos!!");
			}else{
				if(num==0){
					contadorceros++;
					contadorpositivos++;
				}
				sumapositivos = sumapositivos + num;
				mediapostivos = (float) sumapositivos / contadorpositivos;
				contadorpositivos++;
			}
			
			contador++;
		}while(contador<5);
		
		System.out.printf("La media es: %.2f\n",mediapostivos);
		System.out.printf("Hay tantos ceros: %d\n",contadorceros);
		
		
	}
}
