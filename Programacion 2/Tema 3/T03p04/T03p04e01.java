import java.util.Scanner;
public class T03p04e01{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

			int num1;
			int num2;
			int num3;
			int mayor;
			int menor;
			int medio;
			
			System.out.print("Introduce un numero: ");
			num1=sc.nextInt();
				
			System.out.print("Introduce otro numero: ");
			num2=sc.nextInt();
			
			System.out.print("Introduce otro numero: ");
			num3=sc.nextInt();
			
			mayor = (num1>num2 && num1>num3)?num1:(num2>num1 && num2>num3)? num2:num3;	
			
			menor = (num1<num2 && num1<num3)?num1:(num2<num1 && num2<num3)? num2:num3;
			
			medio =(num1+num2+num3)-(mayor + menor);
			
			System.out.print(+mayor+" , "+medio+" , "+menor);
		}
	}

