
import java.util.Scanner;

public class T03p01e05 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int nota;
		
		System.out.print("Introduzca una nota: ");
		nota=sc.nextInt();
		
		switch(nota) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("INSUFICIENTE");
				break;
			case 5:
				System.out.println("SUFICIENTE");
				break;
			case 6:
				System.out.println("BIEN");
				break;
			case 7:
			case 8:
				System.out.println("NOTABLE");
				break;
			case 9:
			case 10:
				System.out.println("SOBRESALIENTE");
				break;
			default:
				System.out.println("ERROR");
				break;
		}
		
		System.out.println("");
	}
	
}
