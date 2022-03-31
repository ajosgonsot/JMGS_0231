import java.util.Scanner;
public class T03p02e05{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			int num1;
			int num2;
			
			System.out.print("Introduzca un numero: ");
			num1 = sc.nextInt();
				
			while(num1 >= 0){
				
				num2 = num1*num1;
				System.out.printf("%d al cuadrado es igual a %d\n",num1,num2);
				
				System.out.print("Introduzca otro numero: ");
				num1 = sc.nextInt();
			}
			
	}
}
