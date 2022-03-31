
import java.util.Scanner;

public class T03p05e07 {
	
	private static int a_elevadoN(int a,int n) {
		
		int res=1;
		
		if (n==0) {
			res=1;
		} else {
			for (int i=1; i<=n; i++) {
				res=res*a;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num,exp,res;
		
		System.out.print("Introduzca la base: ");
		num=sc.nextInt();
		System.out.print("Introduzca su exponente: ");
		exp=sc.nextInt();
		
		res=a_elevadoN(num,exp);
		
		System.out.println(num + " elevado a " + exp +" = " +res);
		
		System.out.println("");
	}
	
}
