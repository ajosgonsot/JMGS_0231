import java.util.Scanner;

public class T03p03e05 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int num1;
	int num2;		
		
			System.out.println("Introduce un numero:");
			num1=sc.nextInt();
		
			do{
			
			System.out.println("Introduce otro numero:");
			num2=sc.nextInt();
		
			
			if(num1>num2){	
				System.out.println("Fallaste, es mayor");	
			}
			else if (num1<num2){	
				System.out.println("Fallaste,es menor");	
			}
			else if (num1==num2){
				System.out.println("enhorabuena, acertaste");
					}
				
			}while(num1>0);
	
	}
}
