import java.util.Scanner;
public class t03p01e10{

		public static void main (String[] args){
	
		Scanner sc=new Scanner(System.in);

		int N;
		
		System.out.print("Lado del cuadrado: ");
		N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			for (int j=1; j<=N; j++) {
					System.out.print("*");
				}
			System.out.print("\n");
		}
	
	}

}
