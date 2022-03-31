import java.util.Scanner;

public class t04p01e06{

public static void main (String [] args){
	
	Scanner sc= new Scanner (System.in);
	
	int[] numero = new int[5];
	int num;
	int posicion;
	
	
	System.out.println("Leyendo datos: ");
		
	for (int i=0; i<numero.length-1; i++){
		System.out.print("Introduca numero: ");
		numero[i]=sc.nextInt();	
	}	
	
	System.out.print("Nuevo elemento: ");
	num=sc.nextInt();
	
	System.out.print("Posicion donde insertar (de 0 a 4): ");
	posicion=sc.nextInt();
	
	for (int i=1; i<numero.length; i++) {
			
		int aux=numero[i];
		int j=i-1;
		
		while (j>=0 && aux<numero[j]) {
		
			numero[j+1]=numero[j];
			j--;
		
		}
		numero[j+1]=aux;
	
	System.out.print(numero[i]);
	
	}
	
	
	
	
	
	}		
}
   
