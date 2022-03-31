import java.util.Scanner;

public class t02p02e03 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		float num1=0.7F;
		double num2=0.3;
		float temp;
		
		temp=num1;
		num1=(float)num2;
		num2=temp;
		
		System.out.println("Mostrar los valores :" + num1);
		System.out.println("Mostrar los valores :" + num2);
		

	}

	






}
