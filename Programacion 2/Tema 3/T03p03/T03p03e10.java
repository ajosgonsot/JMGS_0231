import java.util.Scanner;
public class T03p03e10 {

	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		
		
			int num1;
			int num2;
			
			
			System.out.print("Introduce un numero: ");
			num1 = sc.nextInt();
			System.out.print("Introduce otro numero: ");
			num2 = sc.nextInt();
			
			if (num1%num2==0 || num2%num1==0){
				System.out.print("Son multiplos ");
			} else {
				System.out.print("No son multiplos ");
				
			}
	}
}
