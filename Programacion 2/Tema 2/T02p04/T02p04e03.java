import java.util.Scanner;
public class T02p04e03 {

	public static void main (String[] args) {
	Scanner sc=new Scanner (System.in);
	
	
		System.out.println("Dinero ingresado: 2.000e");
	
		System.out.println("Interes anual: 2,75%");
		
		System.out.println("Intereses a los 6 meses: "+(2000*2.75)/100/2);
		
		System.out.println("Retenciones realizadas: "+((((2000*2.75)/100)/2-(((2000*2.75)/100)/2*18/100))));
	}

}

