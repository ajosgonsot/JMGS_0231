
import java.util.Scanner;

public class T03p05e08 {
	
	private static String binario(int num) {
		
		String s="",bin="";
		
		if (num<0 || 255<num) {
			System.out.println("Numero fuera de rango (0..255)");
		} else {
			if (num==0) {
				s=s+num;
			}
			while (num!=0) {
				s=s+(num%2);
				num=num/2;
			}
		}
		for (int i=0; i<s.length(); i++) {
			bin=bin+s.charAt(s.length()-i-1);
		}
		return bin;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.print("Introduzca un numero (0..255): ");
		num=sc.nextInt();
		
		System.out.printf("El numero %d en binario es: %s\n",num,binario(num));
		
		System.out.println("");
	}
	
}
