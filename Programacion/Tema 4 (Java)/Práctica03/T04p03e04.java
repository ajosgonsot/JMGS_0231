import java.util.Scanner;

public class T04p03e04{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int[] num=new int[5];
		
		
		for(int i=0;i<num.length;i++){
			System.out.print("Introduzca un n\u00famero: ");
			num[i]=sc.nextInt();
		}
		
		System.out.println("");
		
		System.out.println("El array introducido es: ");
		
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		
		System.out.println("");
		System.out.println("");
		
		System.out.print("Introduzca la posici\u00f3n(0..4)del  n\u00famero a borrar: ");
		int pos=sc.nextInt();
		
		System.out.println("");
		
		for(int i=pos;i<num.length-1;i++){
			num[i]=num[i+1];
		}
		num[num.length-1]=0;
		
		System.out.println("");
		
		System.out.println("El array resultado es: ");
		
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
	}
}
