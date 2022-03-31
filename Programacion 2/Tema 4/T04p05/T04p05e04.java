import java.util.Scanner;
public class T04p05e04{


	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int[] a=new int[5];
		int[] b=new int[5];
		int[] c=new int[10];
		int[] guardar=new int[5];
		int cont=0;

		System.out.println("Leyendo datos ordenados primer array...");
		for(int i=0;i<a.length;i++){
			System.out.print("Introduzca un numero: ");
			a[i]=sc.nextInt();
		}
		
		System.out.println("");
		
		System.out.println("Leyendo datos ordenados segundo array...");
		for(int i=0;i<b.length;i++){
			System.out.print("Introduzca un numero: ");
			b[i]=sc.nextInt();
		}
		System.out.println("");
		System.out.print("El primer array introducido es: ");
		for (int i=0; i < 5; i++){
			System.out.print(a[i]+ " ");
		}
		System.out.println("");
		System.out.print("El segundo array introducido es: ");
		for (int i=0; i < 5; i++){
			System.out.print(b[i]+ " ");
		}
		
		for(int i=0;i<c.length;i=i+2){
			c[i]=a[cont];
			c[i+1]=b[cont];
			cont++;
		}
		
		for(int i=0;i<c.length-1;i++){
			for(int j=c.length-1;j>i;j--){
				if(c[j-1]>c[j]){
					int aux=c[j-1];
					c[j-1]=c[j];
					c[j]=aux;
				}
			}
		}
		
		System.out.println(" ");
		System.out.println("El array resultado es: ");
		
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");		
		}
	}
}
