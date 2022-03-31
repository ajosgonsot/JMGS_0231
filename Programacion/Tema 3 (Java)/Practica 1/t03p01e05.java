import java.util.Scanner;
public class t03p01e05{

	public static void main (String[] args){
	
			
			int calificacion;
	
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Introduzca una nota: ");
			
			calificacion = sc.nextInt();
			
			switch (calificacion) {
				case 5:	System.out.print("Suficiente"); break;
				case 6: System.out.print("Bien"); break;
				case 7:
				case 8: System.out.print("Notable"); break;
				case 9:
				case 10: System.out.print("Sobresaliente"); break;
				default: System.out.print("Insuficiente"); break;
			}
	
	}


}
