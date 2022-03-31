import java.util.Scanner;

public class T03p03e07 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
		int num1;
		
		do{
			
			System.out.println("Introduce numero (de 1 a 10):");
			num1=sc.nextInt();
		
		
				if (num1!=0 & num1!=10){
		
				System.out.println("Tabla del "+num1);	

					for (int i = 1; i <= 10; i++) {
				
						System.out.println(num1 + " x " + i + " = " + num1*i);
	
					}
				}	
			
			}while(num1!=0 & num1!=10);
					
				
		}
}
