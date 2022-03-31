import java.util.Scanner;

public class T04p03e03{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int[] num=new int[5];
		int pos=-1;
		
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
		
		do{
			pos++;
		}while(pos<num.length && num[pos]!=0 && num[pos]<key);
		
		if (pos<num.length) {
			for (int i=num.length-1; i>pos; i--) {
				num[i]=num[i-1];
			}
			num[pos]=key;
		}
		
		System.out.println("");
		
		System.out.println("El array resultado es: ");
		
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		
		
		
	}
}
