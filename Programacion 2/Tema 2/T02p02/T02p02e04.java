import java.util.Scanner;

public class T02p02e04 {
	
	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		
		char letra;
		boolean continuar;
		String texto;
		 
	
		System.out.println("Intrdouce un caracter s o n: ");
		letra=sc.next().charAt(0);
	
		continuar=(letra== 's')?true:false; 
	
		texto=(continuar==true)?"Continuando...":"Finalizando...";
		
		System.out.println(texto);
	
	
	
			
	}
 
}
