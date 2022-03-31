import java.util.Scanner;
public class T03p04e03{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Introduzca un numero: ");
		numero = sc.nextInt();
			
		do {
      
			if(numero%2==0){
				System.out.println("Par");
				
			}else{
				System.out.println("Impar");
			}
			
			
			System.out.print("Introduzca otro numero: ");
			numero = sc.nextInt();	
      
      
      }while ( numero != 0 );
		
	}
}
