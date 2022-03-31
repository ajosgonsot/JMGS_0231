import java.util.Scanner;

public class T04p01e04 {
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean repetidos=false;
		int [] num=new int [5];
		System.out.println("Leyendo numeros: ");
		
		for (int i=0; i<num.length; i++) {
			System.out.print("numero: ");
			num[i]=sc.nextInt();

		}
		for (int i=0; i<num.length; i++) {
			for (int j=i+1; j<num.length; j++) {
				if (num[i]==num[j]) {
					repetidos=true;
				}
			}
		}
		System.out.println(" ");
		if (repetidos==true) {
			System.out.println("Hay numeros repetidos");
		}
	}
}
