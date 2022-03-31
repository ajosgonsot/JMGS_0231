import java.util.Scanner;
public class T03p04e04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int suma=0;
		int contador=0;
		float media=0;
		
		System.out.print("Introduce un numero: ");
		num = sc.nextInt();
		
		if(num!=0){
		
			contador++;		
			while (num!=0){
				
				suma = suma + num;
				
				media = (float)suma / contador;
				
				System.out.print("Introduce un numero: ");
				num = sc.nextInt();
				contador++;
			
			
			}
			
			System.out.println();
			System.out.println("La suma es: "+suma);
			System.out.printf("La media es: %.2f",media);
		
		}else {
		
		}
			
	}
}
