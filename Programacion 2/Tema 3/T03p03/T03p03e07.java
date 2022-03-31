import java.util.Scanner;
public class T03p03e07{

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);

			int numero;
        
			System.out.print("Introduce un número (de 1 a 10): ");                                                         
			numero = sc.nextInt();
        
			System.out.println("Tabla del " + numero);
        
			for(int i = 1; i<=10; i++){
             System.out.println(numero + " * " + i + " = " + numero*i);                                                     
        }
    }
}

