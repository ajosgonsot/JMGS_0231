import java.util.Scanner;
public class T02p03e03 {

	public static void main (String[] args) {
	Scanner sc=new Scanner (System.in);
	
		int num;
		String texto;
		
		System.out.print("Introduce un numero: ");
		num = sc.nextInt();
		
		num = num + 1;
		System.out.println("El numero valor es: "+num);
		
		texto = (num>0)?"Positivo":"Negativo";
		System.out.println(texto);
		
	}
	
}
		
