import java.util.Scanner;
public class T03p05e06 {
	
	private static int calculo(int num1, int num2, int num3){
		
		int mayor;
		
		mayor = (num1>num2 && num1>num3)?num1:(num2>num1 && num2>num3)?num2:num3;
		
		return mayor;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int num1,num2,num3,mayor; 
		
		System.out.print("Introduzca un numero: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca otro numero: ");
		num2 = sc.nextInt();
		System.out.print("Introduzca el ultimo: ");
		num3 = sc.nextInt();
		mayor=calculo(num1,num2,num3);
		
		System.out.println();
		System.out.print("El numero mayor es: "+mayor);
	}

}
