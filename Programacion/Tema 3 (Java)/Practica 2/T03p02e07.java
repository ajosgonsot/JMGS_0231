import java.util.Scanner;

public class T03p02e07 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		long producto=1;
		
		for (int i=1; i<20; i+=2) {
			   producto=producto*i;
			         System.out.printf(" %d ",i);   
		}        
		 System.out.println("\n El producto de los 10 primeros numeros positivos impares es: " + producto);
		
		
	}
		
}
