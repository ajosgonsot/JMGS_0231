import java.util.Scanner;
public class T03p05e01{
		
		private static int doble(int num){
		
		int result=num*2;
		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num;
		int result; 
		
		System.out.print("Introduzca un numero: ");
		num = sc.nextInt();
		result=doble(num);
		System.out.print("El doble de "+num+" es "+result);
		
		
	}

}
		
		
		
		
		
