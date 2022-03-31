
import java.util.Scanner;

public class T03p03e08 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int j,num,cont_pri=0;
		boolean primo;
		
		System.out.print("Introduce numero: ");
		num=sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			primo=true;
			j=2;
			while (j<=i-1 && primo==true) {
				if (i%j==0)	primo=false;
				j++;
			}
			if (primo) {
				cont_pri++;
				System.out.println(i+" es primo");
			}
		}
		
		System.out.println("En el rango 1.." + num + ", hay " + cont_pri + " numeros primos");
		
		System.out.println("");
	}
	
}
