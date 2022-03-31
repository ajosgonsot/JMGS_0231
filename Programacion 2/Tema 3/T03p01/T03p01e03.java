import java.util.Scanner;
public class T03p01e03{

	public static void main (String[] args){
	Scanner sc=new Scanner (System.in);
	
		
		int num1;
		int num2;
		
		System.out.print("Introduce un numero: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduce otro numero: ");
		num2 = sc.nextInt();
		
		System.out.println("");
		
		if (num1 > num2) {
			
			System.out.println(+num1+" Es mayor que "+num2);
			
		} else if (num2 > num1) {
			
			System.out.println(+num2+" Es mayor que "+num1);
		
	
		}
	}
}
