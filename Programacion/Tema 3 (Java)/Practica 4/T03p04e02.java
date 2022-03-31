import java.util.Scanner;

public class T03p04e02 {

public static void main (String[] args) {
				
	Scanner sc=new Scanner(System.in);
	
	int lado;
	
		System.out.print("Lado del cuadrado: ");
	
	lado=sc.nextInt();
	
		for(int i=1; i<=lado; i++){
			
		for(int j=1; j<=lado; j++){
				
				
		if( j==1 || j==lado || i==1 || i==lado){
					
			System.out.print("* ");
				
		}else{
			
			System.out.print("  ");
			
			
				}	
		
			}
			System.out.println("");

		}
	}
}
