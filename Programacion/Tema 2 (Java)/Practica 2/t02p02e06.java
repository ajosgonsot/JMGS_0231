import java.util.Scanner;

public class t02p02e06 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		char letraini='a';
		char letrafin='j';
		char letra;
		String texto;

		System.out.println("Introduce una letra: ");
		letra=sc.next().charAt(0);
		
		texto = (letra>=letraini && letra<=letrafin) ? "Dentro" : "Fuera";

		System.out.println(texto);

	
	}




}
