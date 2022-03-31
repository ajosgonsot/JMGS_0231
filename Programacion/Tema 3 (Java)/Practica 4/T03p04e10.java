import java.util.Scanner;

public class T03p04e10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.print("Base del triangulo (impar): ");
        int numfilas = sc.nextInt();
       
 
        System.out.println();
        for(int altura = 1; altura<=numfilas; altura++){
           
            for(int blancos = 1; blancos<=numfilas-altura; blancos++){
                System.out.print(" ");
            }
            
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();	
	
		}
	}
}
