import java.util.Scanner;

public class T02p02e06 {
	
	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);

		char letraIni='a', letraFin='f';
		char letra;
		String texto;
		
		System.out.println("Introduce un caracter: ");
		letra=sc.next().charAt(0);
		
		texto=(letra>=letraIni && letra<=letraFin)?"Dentro":"Fuera";
		
		System.out.println(texto);
		
		
		
		
	}

}
