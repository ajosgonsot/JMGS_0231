import java.util.Scanner;

public class T03p04e01 {

	public static void main (String[] args) {
				
	Scanner sc=new Scanner(System.in);
	
	int num1;
	int num2;
	int num3;
	 
	System.out.print("Introduce un numero: ");
	num1=sc.nextInt();
	System.out.print("Introduce otro nunmero:  ");
	num2=sc.nextInt();
	System.out.print("Introduce otro numero:  ");
	num3=sc.nextInt();
	
		if(num1>num2&&num2>num3)
			System.out.println(num1+"-"+num2+"-"+num3);
			
		if(num2>num3&&num3>num1)
			System.out.println(num2+"-"+num3+"-"+num1);
			
		if(num3>num1&&num1>num2)
			System.out.println(num3+"-"+num1+"-"+num2);
			
		if(num1>num3&&num3>num2)
			System.out.println(num1+"-"+num3+"-"+num2);
			
		if(num2>num1&&num1>num3)
			System.out.println(num2+"-"+num1+"-"+num3);
			
		if(num3>num2&&num2>num1)
			System.out.println(num3+"-"+num2+"-"+num1);
 				
	}

}
