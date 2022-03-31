import java.util.Scanner;

public class T04p03e06{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int[] num=new int[5];
		int[] orden=new int[5];
		int pos=-1;
		int temporal=0;
		
		for(int i=0;i<5;i++){
			System.out.print("Introduzca un n\u00famero : ");
			num[i]=sc.nextInt();
		}
		
		System.out.println("");
		
		System.out.println("El array introducido es:");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		
		System.out.println("");
		for (int i=0; i<num.length-1; i++) {
			for (int j=num.length-1; j>i; j--) {
				if (num[j-1]>num[j] && num[j-1]!=0) {
					temporal=num[j-1];
					num[j-1]=num[j];
					num[j]=temporal;
				}
			}
		}
		
		for(int i=0;i<orden.length;i++){
			orden[i]=num[i];
		}
		System.out.println("El array resultado es:");
		for(int i=0;i<num.length;i++){
			System.out.print(orden[i]+" ");
		}
		
		
	}
}
