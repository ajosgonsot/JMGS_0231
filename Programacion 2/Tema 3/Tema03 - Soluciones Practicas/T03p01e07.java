
import java.util.Scanner;

public class T03p01e07 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i,num;
		
		System.out.print("Introduce un numero: ");
		num=sc.nextInt();
		
		i=1;
		while (i<=num) {
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println("");
	}
	
}
