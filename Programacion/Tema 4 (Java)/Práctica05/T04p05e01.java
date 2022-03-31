import java.util.Scanner;

public class T04p05e01{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int[] num=new int[5];
		double suma=0;
		double contpos=0;
		double sumaneg=0;
		double contneg=0;
		int cero=0;
		
		System.out.print("Leyendo datos...\n");
		
		for(int i=0;i<num.length;i++){
			System.out.print("Introduzca un n\u00famero: ");
			num[i]=sc.nextInt();
		}
		
		System.out.println("");
		
		System.out.print("El array introducido es: ");
		
		System.out.println("");
		
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
	
		for(int i=0;i<num.length;i++){
			if(num[i]>0){
				suma=suma+num[i];
				contpos++;
			}else if(num[i]<0){
				sumaneg=sumaneg+num[i];
				contneg++;
			}else{
				cero++;
			}
		}
	
		System.out.println("");
		
		System.out.println("");
		
		if(contpos!=0){
			double mediapos=suma/contpos;
			System.out.printf("\nLa media de los positivos: %.1f",mediapos);
		}else{
			System.out.println("No se puede realizar la media de n\u00fameros positivos!!");
		}
		if(contneg!=0){
			double medianeg=sumaneg/contneg;
			System.out.printf("\nLa media de los negativos: %.1f",medianeg);
		}else{
			System.out.println("No se puede realizar la media de n\u00fameros negativos!!");
		}
		
		System.out.printf("\nLa cantidad de ceros es de: %d",cero);
		
	}
}
