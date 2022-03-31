import java.util.Scanner;

public class T03p04e03 {

public static void main (String[] args) {
				
	Scanner sc=new Scanner(System.in);
	
	int num;
	int cont=0;

	
	do{
		System.out.print("Introduce un numero: ");
		num=sc.nextInt();
		cont++;
		
		if ( num %2 ==0){
		
			System.out.println("Par ");

		} else{
		
			System.out.println("Impar ");

		}
	
	}while(num>0);
	
	
	
	
	}
}
