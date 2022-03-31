import java.util.Scanner;

public class T03p03e10 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

		int num1;
		int num2;
		
         System.out.printf("Introduce un numero entero: ");
         num1 = sc.nextInt();
         System.out.printf("Introduce otro numero entero: ");
         num2 = sc.nextInt();
         
         if (num1 % num2 == 0) {
              System.out.println("Si son multiplos");
         }
         
         else {
              System.out.println("No son multiplos");
         }
     }

}
