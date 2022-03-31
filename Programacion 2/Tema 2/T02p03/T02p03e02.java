import java.util.Scanner;
public class T02p03e02 {

	public static void main (String[] args) {
	Scanner sc=new Scanner (System.in);
	
	char letra;
	
	System.out.print("Introduce una letra en minuscula: ");
	letra = sc.next().charAt(0);
	System.out.println("Su correspondiente Mayuscula es: "+(char)(letra-32));
	
	
	}
	
}
