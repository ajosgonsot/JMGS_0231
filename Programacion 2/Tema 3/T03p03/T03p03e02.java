import java.util.Scanner;
public class T03p03e02{

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int numero;
		
		System.out.print("Introduce un numero: ");
		numero = sc.nextInt();
		
		if(numero/1000!=0){
			System.out.print("Tiene 4 cifras");
		} else if(numero/100!=0) {
			System.out.print("Tiene 3 cifras");
		} else if(numero/10!=0) {
			System.out.print("Tiene 2 cifras");
		} else if(numero/1!=0) {
			System.out.print("Tiene 1 cifras");
		}
		
	}
}
