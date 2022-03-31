import java.util.Scanner;

public class T03p03e04 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int num1;
	int num2;
	int contador=0;
	int numpositivos=0;
		
		System.out.print("Introduce un numero: ");
		num1=sc.nextInt();
		do{
			
			System.out.print("Introduce otro numero: ");
			num2=sc.nextInt();
			contador++;
				
				if(num1>0){
					numpositivos++;
					}
							
			}while(num2>0);
		
		System.out.printf("Se han introducido: %d numeros ",numpositivos);
	
	}
}
