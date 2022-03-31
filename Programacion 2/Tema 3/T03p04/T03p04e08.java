import java.util.Scanner;
public class T03p04e08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dia1, dia2;
		int mes1, mes2;
		int ano1, ano2;
		int diferencia;
		
		System.out.println("Fecha 1: ");
		System.out.print("Introduzca dia: ");
		dia1=sc.nextInt();
		System.out.print("Introduzca mes: ");
		mes1=sc.nextInt();
		System.out.print("Introduzca año: ");
		ano1=sc.nextInt();
		System.out.println("Fecha 2: ");
		System.out.print("Introduzca dia: ");
		dia2=sc.nextInt();
		System.out.print("Introduzca mes: ");
		mes2=sc.nextInt();
		System.out.print("Introduzca año: ");
		ano2=sc.nextInt();
		
		diferencia = (dia2 - dia1)+(mes2 - mes1)*30+(ano2 - ano1)*365;
		
		System.out.print("Dias de diferencia: "+diferencia);
	}
}

