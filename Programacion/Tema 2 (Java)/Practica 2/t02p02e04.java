import java.util.Scanner;

public class t02p02e04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		boolean continuar;
		
		System.out.println("Introduce (s)i o (n)o: ");
		
		char letra=sc.next().charAt(0);
		
		continuar=(letra=='s')?true:false;
		
		String texto;
		
		texto=(letra=='s')?"Continuando..." : "Finalizado";
		
		System.out.println(texto);
	
	}
	
	
}
