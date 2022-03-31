import java.util.Scanner;
public class T03p01e07{

	public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
			
		int num;
		
		System.out.print("Introduce un numero: ");
		num = sc.nextInt();
		
		for (int i=1; i<=num; i++){
			System.out.printf("%d",i);
		}

	}
 
}
