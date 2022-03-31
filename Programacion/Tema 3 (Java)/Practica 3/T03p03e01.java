import java.util.Scanner;

public class T03p03e01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int num1;
		int num2=0;
		int max=0;
		
		System.out.print("Introduzca un numero : ");       
		num1=sc.nextInt();
		
		do{	
			
			System.out.print("Introduzca otro numero : ");       
			num1=sc.nextInt();
			
			if(num1>max){
				max=num1;
			}
			num2++;
			
		}while (num2<2);
		
		System.out.printf("%d Es el mayor  ",max); 
		
		
		}
}
