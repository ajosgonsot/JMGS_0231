import java.util.Scanner;
public class T03p03e08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, contador=1, divisores, j, contadorPrimos=0;
		
		System.out.print("Introduce N numeros: ");
		n = sc.nextInt();
		
		while (contador<=n) {
			divisores=0;
			j=2;
			
			while(j<=contador -1) {
				
				if(contador%j==0){
					divisores++;
				}
				
				j++;
			}
		
			if(divisores==0){
				contadorPrimos++;
				System.out.println(+contador+" es Primo");
			}
			
			contador++;
		}
		
		contador=1;
		System.out.println();
		System.out.println("En el rango "+contador+"..."+n+" hay: "+contadorPrimos+" numeros Primos");
		
	}
}
