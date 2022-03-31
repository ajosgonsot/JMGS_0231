
import java.util.Scanner;

public class T03p03e09 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		int um, c, d, u;
		
		System.out.print("Introduzca un numero entre 1000 y 9999: ");
		num=sc.nextInt();
		
		u = num % 10;
		num = num / 10;
		d = num % 10;
		num = num / 10;
		c = num % 10;
		num = num / 10;
		um = num % 10;

		System.out.println(u+""+d+""+c+""+um);
		
		System.out.println("");
	}

}
