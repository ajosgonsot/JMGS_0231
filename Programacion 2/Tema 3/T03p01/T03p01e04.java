import java.util.Scanner;
public class T03p01e04{

	public static void main (String[] args){
	Scanner sc=new Scanner (System.in);
	
		int dia;
		int mes;
		int ano;
		
		System.out.print("Introduce el dia: ");
		dia = sc.nextInt();
		
		System.out.print("Introduce el mes: ");
		mes = sc.nextInt();
	
		System.out.print("Introduce el año: ");
		ano = sc.nextInt();
	
		if (ano < 0) {
			System.out.print("Fecha incorrecta!!");
		} else if (mes<0 || mes>12) {
			System.out.print("Fecha incorrecta!!");
		} else if (dia > 31) {
			System.out.print("Fecha incorrecta!!");
		} else if (mes==2 && dia >28 ) {
			System.out.print("Fecha incorrecta!!");
		} else if (mes==4 && dia >30 || mes==6 && dia >30 || mes==9 && dia >30 || mes==11 && dia >30){
			System.out.print("Fecha incorrecta!!");
		} else if (mes==1 && dia >31 || mes==3 && dia >31 || mes==5 && dia >31 || mes==7 && dia >31 || mes==8 && dia >31 || mes==10 && dia >31 || mes==12 && dia >31){
			System.out.print("Fecha incorrecta!!");
		} else {
			System.out.print("Fecha correcta!!");
		}
	
	}
}
