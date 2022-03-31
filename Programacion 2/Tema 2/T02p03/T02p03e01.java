import java.util.Scanner;
public class T02p03e01 {

	public static void main (String[] args) {
	Scanner sc=new Scanner (System.in);
	
		int num1=1, num2=2, num3=3;
		int mayor, menor;
		
		mayor = (num1>num2 && num1>num3)?num1:(num2>num1 && num2>num3)? num2:num3;
		
		menor = (num1<num2 && num1<num3)?num1:(num2<num1 && num2<num3)? num2:num3;
		
		System.out.printf("El valor mas alto es: %d \n",mayor);
		System.out.printf("El valor mas bajo es: %d \n",menor);



	}
}
