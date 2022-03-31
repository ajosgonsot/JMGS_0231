import java.util.Scanner;
public class T03p05e03 {
	
	private static int impares(int n){
		int contador=1;
		int impares=0;
		int suma=0;
		
		while(impares<n){
			
			if(contador%2!=0){
				suma=suma+contador;
				impares++;
			}
			contador++;
		}
		return suma;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 int n;
		 int suma=0;
		
		System.out.print("Introduzca un numero: ");
		n = sc.nextInt();
		suma=impares(n);
		System.out.print("La suma de los "+n+" primeros numeros impares es: "+suma);
		
	}

}
