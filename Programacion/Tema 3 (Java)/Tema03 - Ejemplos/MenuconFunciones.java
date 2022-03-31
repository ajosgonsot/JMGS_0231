
import java.util.*;

public class MenuconFunciones {
	
	private static void opcion(int op) {
		System.out.println("Has seleccionado la opcion "+op);
		return;
	}
	
	private static int mostrarMenu() {
		int op;
		do {
			System.out.println("Seleccionar una opcion:");
			System.out.println("-----------------------");
			System.out.println();
			System.out.println("1.- Opcion primera.");
			System.out.println("2.- Opcion segunda.");
			System.out.println("3.- Opcion tercera.");
			System.out.println();
			System.out.print("Opcion? ");
			Scanner sc=new Scanner(System.in);
			op=sc.nextInt();
			System.out.println();
		} while (op<0 || op>3);
		return op;
	}
	
	public static void main(String[] args) {
		int opt=mostrarMenu();
		switch (opt) {
			case 1: /*Aquí puede haber más código*/ break;
			case 2: /*Aquí puede haber más código*/ break;
			case 3: /*Aquí puede haber más código*/ break;
		}
		opcion(opt); 
		System.out.println("");
	}
	
}
