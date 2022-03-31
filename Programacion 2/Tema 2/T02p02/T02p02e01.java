import java.util.Scanner;

public class T02p02e01 {
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
		
	int num1;
	short num2;
	
	System.out.print("Introduce un numero mayor de (32767): "); //PIDE UN NUMERO Y LO GUARDA EN LA VARIABLE NUM1
	num1 = sc.nextInt();
	num2 = (short)num1;
	
	System.out.println("El resultado de num1 es: "+num1);
	System.out.println("El resultado de num2 es: "+num2);
	
	}
 
}
