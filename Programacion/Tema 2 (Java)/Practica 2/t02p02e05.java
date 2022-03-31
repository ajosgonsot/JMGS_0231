import java.util.Scanner;

public class t02p02e05 {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	final int limite =100;
	byte num =0;
	
	String texto;
	
	System.out.println("Introduce un numero: ");
	num=sc.nextByte();
	
	texto=(num>100)?"Mayor" : (num<100)?"Menor" :"igual";
	System.out.println(texto);

		

	
	
	}




}
