import java.util.Scanner;

public class T04p03e02{
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
		
		System.out.print("Introduzca el n\u00famero a insertar: ");
		int key=sc.nextInt();
		
		System.out.println("");
		
		System.out.println("Introduzca la posici\u00f3n(0..4) donde insertar: ");
		int pos=sc.nextInt();
		
		for (int i=num.length-1; i>pos; i--) {
			num[i]=num[i-1];
		}
		
		num[pos]=key;
		
		System.out.println("");
		
		System.out.println("El array resultado es: ");
		
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		
		
		
	}
}
