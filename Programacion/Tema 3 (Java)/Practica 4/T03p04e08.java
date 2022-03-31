import java.util.Scanner;

public class T03p04e08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int dia1,mes1,ano1;        
		int dia2,mes2,ano2;        
		int diasdiferen;
		
		        
			System.out.println ("Fecha 1:");        
			System.out.print("Introduzca dia: ");        
				dia1=sc.nextInt();        
			System.out.print("Introduzca mes: ");        
				mes1=sc.nextInt();        
			System.out.print("Introduzca año: ");        
				ano1=sc.nextInt();        
			System.out.println ("Fecha 2:");        
			System.out.print("Introduzca dia: ");        
				dia2=sc.nextInt();        
			System.out.print("Introduzca mes: ");        
				mes2=sc.nextInt();        
			System.out.print("Introduzca año: ");        
				ano2=sc.nextInt();        
			
		diasdiferen = dia2-dia1 + 30*(mes2-mes1)+365*(ano2-ano1);        
		System.out.println("Días de diferencia: " + diasdiferen);
	
	
	
	}




}
