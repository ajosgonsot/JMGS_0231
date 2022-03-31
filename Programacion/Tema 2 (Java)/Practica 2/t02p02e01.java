import java.util.Scanner;
public class t02p02e01 {
	
	public static void main (String[] args) {
		
	int num1=0;
	short num2=0;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("introduce un numero");
	
	num1 = teclado.nextInt();
	
	num2 = (short)num1;
	
	System.out.println("El valor de num1 es; "+num1);
	System.out.println("El valor de num2 es; "+num2);	
	
	
	}
}
