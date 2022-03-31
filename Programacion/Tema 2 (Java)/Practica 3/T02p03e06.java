import java.util.Scanner;
public class T02p03e06 {
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		int edad=0;
		int estudios=0;
		int ingresos=0;
		boolean jasp;
		
		System.out.println("Introduce la edad: ");
		edad=sc.nextInt();
		System.out.println("Introduce tus estudios: ");
		estudios=sc.nextInt();
		System.out.println("Introduce tus ingresos: ");
		ingresos=sc.nextInt();
		
		jasp=((edad>=28 && estudios>3) || (edad<30 && ingresos>28000))? true : false;
		
		System.out.println(jasp);
		
		
		
	}		
		
}		
	
