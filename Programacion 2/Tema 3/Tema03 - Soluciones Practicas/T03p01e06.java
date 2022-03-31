
import java.util.Scanner;

public class T03p01e06 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.print("Introduzca un numero (0:fin): ");
		num=sc.nextInt();
		
		while (num!=0) {
			if (num>0) {
				System.out.println("Positivo");
			} else {
				System.out.println("Negativo");
			}
			System.out.print("Introduzca otro numero (0:fin): ");
			num=sc.nextInt();
		}
		
		System.out.println("");
	}

}
