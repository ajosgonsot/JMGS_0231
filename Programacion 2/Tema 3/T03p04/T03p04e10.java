import java.util.Scanner;
public class T03p04e10{

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Introduce la base del triangulo: ");
		int base=sc.nextInt();
		
		System.out.println("");
		
		for (int i=0; i<=base; i++) {
			if (i%2!=0) {
				for(int k=0; k<=(base-i)/2; k++){
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			
			}
		}
	}
}
		
