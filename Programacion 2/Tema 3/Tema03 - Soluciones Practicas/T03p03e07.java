
import java.util.Scanner;

public class T03p03e07 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		
		do {
			System.out.print("Introduce numero (de 1 a 10): ");
			num=sc.nextInt();
		} while (!(num>=1 && num<=10));
		
		System.out.println("\nTabla del " + num);
		for (int i=1; i<=10; i++) {
			System.out.printf("%d x %2d = %2d\n",num,i,num*i);
		}
		
		System.out.println("");
	}
	
}
