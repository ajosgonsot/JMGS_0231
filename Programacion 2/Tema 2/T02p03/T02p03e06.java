import java.util.Scanner;
public class T02p03e06 {

	public static void main (String[] args) {
	Scanner sc=new Scanner (System.in);
	
		int edad=20,nivel_de_estudios=0,ingresos=10000;
		boolean jasp;
	
		jasp = (edad<=28 && nivel_de_estudios>3 || edad<30 && ingresos>28000)?true:false;
	
		System.out.print(jasp);
	}
}	
