import java.util.Scanner;
public class t04p01e01{

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int num[] = new int[5];
        
        for (int i = 0; i < num.length; i++) {
            System.out.print("Introduce un numero: ");
            num[i]=sc.nextInt();            
        }
        
        System.out.println("");
        System.out.println("Los numeros en orden inverso son:");
        
        for (int i = num.length - 1; i >= 0 ; i--) {
            System.out.print(num[i]);
        }
    }
}
