import java.util.Scanner;
public class T04p01e01 {

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		int[] num = new int[5];
		
		for(int cont=0; cont<num.length; cont++){
			System.out.print("Introduzca un numero: ");
			num[cont] = sc.nextInt();
		}
       
       System.out.println("Los numeros en orden inverso son: ");
       
       for(int cont=num.length-1; cont>=0; cont--){
		   System.out.print(num[cont]+" ");
		} 
	}
}
