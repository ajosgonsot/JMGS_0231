import java.util.Scanner;
public class T03p02e04{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			double n;
			double m;
			
			double a;
			double b;
			
			do{
				System.out.print("Introduce un numero entre 0 y 99: ");
				n=sc.nextDouble();
				if(n > 99 || n < 0){
					System.out.println("Por favor introduzca un numero entre los margenes establecidos.");
				}
			}while(n > 99 || n < 0);		

			m = n /10;
		
			a = m % 1;
			b = m - a;
			
			b = b*10;
			a = a*10;
			
			
			int x = (int)b;
			int y = (int)a;
			
			
			
			
			switch(x){
			case 10:System.out.print("Diez");break;
			case 20:System.out.print("Veinte");break;
			case 30:System.out.print("Treinta");break;
			case 40:System.out.print("Cuarenta");break;
			case 50:System.out.print("Cincuenta");break;
			case 60:System.out.print("Sesenta");break;
			case 70:System.out.print("Setenta");break;
			case 80:System.out.print("Ochenta");break;
			case 90:System.out.print("Noventa");break;
			default:System.out.print("");	
			}
			
			switch(y){
			case 1:System.out.print(" y Uno");break;
			case 2:System.out.print(" y Dos");break;
			case 3:System.out.print(" y Tres");break;
			case 4:System.out.print(" y Cuatro");break;
			case 5:System.out.print(" y Cinco");break;
			case 6:System.out.print(" y Seis");break;
			case 7:System.out.print(" y Siete");break;
			case 8:System.out.print(" y Ocho");break;
			case 9:System.out.print(" y Nueve");break;
			default:System.out.print("");	
			}	
	}
}
