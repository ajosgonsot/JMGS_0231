import java.util.Scanner;
public class T03p03e03{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			int num=0;
			
			System.out.print("Introduce una nota numerica entre 0 y 10: " );
			num= sc.nextInt();
			
			
			switch(num){
			case 0:System.out.print("Cero");
			break;
			case 1:System.out.print("Uno");
			break;
			case 2:System.out.print("Dos");
			break;
			case 3:System.out.print("Tres");
			break;
			case 4:System.out.print("Cuatro");
			break;
			case 5:System.out.print("Cinco");
			break;
			case 6:System.out.print("Seis");
			break;
			case 7:System.out.print("Siete");
			break;
			case 8:System.out.print("Ocho");
			break;
			case 9:System.out.print("Nueve");
			break;
			case 10:System.out.print("Diez");
			break;
			
			}	
	}
}
