import java.util.Scanner;
public class T04p05e03{


	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int[] num=new int[5];
		int cont_creciente=0;
		int cont_decreciente=0;
		
		System.out.println("");
		
		System.out.println("Leyendo datos...");
		
		for(int i=0;i<num.length;i++){
			System.out.print("Introduzca un numero: ");
			num[i]=sc.nextInt();
		}
		for(int i=0;i<num.length-1;i++){
			int j=i+1;
			if(num[i]<num[j]){
				cont_creciente++;
			}else if(num[i]>num[j]){
				cont_decreciente++;
			}
		}
		
		System.out.println("");
		
		if(cont_creciente==num.length-1){
			System.out.println("\nSerie creciente.");
		}else if(cont_decreciente==num.length-1){
			System.out.println("\nSerie decreciente.");
		}else if(cont_creciente==0 && cont_decreciente ==0){
			System.out.println("\nSerie igual.");
		}else{
			System.out.println("\nSerie desordenada.");
		}
	}
}
