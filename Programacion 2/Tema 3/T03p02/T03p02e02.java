import java.util.Scanner;
public class T03p02e02{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			System.out.print("Introduce un numero: ");
			int num1=sc.nextInt();
			
			System.out.print("Introduce otro numero: ");
			int num2=sc.nextInt();
			
			if(num1 > num2){
				System.out.printf("%d es mayor que %d ",num1,num2);
			}else if(num2 > num1){
				System.out.printf("%d es mayor que %d ",num2,num1);
			}else{
				System.out.printf("%d es igual que %d ",num1,num2);
			}	
	}
}
