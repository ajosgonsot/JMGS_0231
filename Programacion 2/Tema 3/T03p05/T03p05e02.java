import java.util.Scanner;
public class T03p05e02 {
	
	private static int bucle(int mayor, int menor){
		
		while(menor<=mayor){
			System.out.print(menor+" ");
			menor++;
		}
		 
		return menor;
	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		int num1, num2;
		
		System.out.print("Introduzca el primer numero: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca el segundo numero: ");
		num2 = sc.nextInt();
		
		int mayor=(num1>num2)?num1:num2;
		int menor=(num1<num2)?num1:num2;
		
		bucle(mayor,menor);
		
	}

}
