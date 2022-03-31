import java.util.Scanner;
public class T03p05e05 {

	private static boolean esPrimo(int num){
		 
		 int j;
		 int contador;
		 int divisores;
		 boolean result;
		 
		 
		j=2;
		divisores=0;
		while(j<=num-1){
			if(num%j==0){
				divisores++;
			}
			j++;
		}
		if(divisores==0){
			result=true;
		}else{
			result=false;
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			
		 int num;
		 boolean result;
		
		System.out.print("Introduzca un numero: ");
		num = sc.nextInt();
		result=esPrimo(num);
		
		System.out.print("El numero "+num+" es primo? "+result);
		
	}

}
