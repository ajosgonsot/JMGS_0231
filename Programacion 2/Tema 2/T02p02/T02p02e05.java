import java.util.Scanner;

public class T02p02e05 {
	
	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		
		byte num;
		final int LIMITE=100;
		String texto;
		
		System.out.println("Introduce un numero: ");
		num=sc.nextByte();
		
		texto=(num==LIMITE)?"Igual":(num>LIMITE)?"Mayor":"Menor";
		
		System.out.println(texto);

	}
}
