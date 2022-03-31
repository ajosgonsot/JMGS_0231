import java.util.Scanner;
public class t03p01e04{

	public static void main (String[] args){
	
	
		int dia;
		int mes;
		int ano;
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Introduzca dia: ");

		dia = sc.nextInt();
		
		System.out.print("Introduzca mes: ");

		mes = sc.nextInt();
		
		System.out.print("Introduzca ano: ");

		ano = sc.nextInt();
	
		if (ano < 0) {
			System.out.print("Fecha incorrecta!!");
		} else if (mes<0 && mes>31) {
			System.out.print("Fecha incorrecta!!");
		} else if (dia > 31) {
			System.out.print("Fecha incorrecta!!");
		}else if (dia > 28 && mes==2) {
			System.out.print("Fecha incorrecta!!");
		} else if (dia > 30 && mes==4 || dia > 30 && mes==6 || dia > 30 && mes==9 || dia > 30 && mes==11) {
			System.out.print("Fecha incorrecta!!");
		} else {
			System.out.print("Fecha correcta!!");
		}
		 	
	
	}

}
