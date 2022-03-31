import java.util.Scanner;
public class T04p05e02{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int[] num=new int[5];
		boolean repetido=false;
		
		System.out.println("Leyendo datos...");
		
		for(int i=0;i<num.length;i++){
			System.out.print("Introduzca un numero: ");
			num[i]=sc.nextInt();
		}
		
		for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[i]==num[j]){
					repetido=true;
				}
			}
		}
		
		System.out.println("");
		
		if(repetido==true){
			System.out.println("Hay numeros repetidos.");
		}else{
			System.out.println("No hay numeros repetidos.");
		}
		
	}
}
