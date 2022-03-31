import java.util.Scanner;

public class T04p03e01{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int[] num=new int[5];
		
		System.out.print("Leyendo datos...");
		
		System.out.println("");
		
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
		
		System.out.print("Introduzca el n\u00famero a buscar: ");
		int key=sc.nextInt();
		int pos=-1;
		
		for (int i=0; i<num.length; i++) {
			if (num[i]==key) {
				pos=i;
				break;
			}
		}	
		
		
		
		if (pos!=-1) {
			System.out.printf("N\u00famero %d en posici\u00f3n %d",key,pos);
		} else {
			System.out.printf("N\u00famero %d no existe!!",key);
		}
	}
}
