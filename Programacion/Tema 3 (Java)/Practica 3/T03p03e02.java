import java.util.Scanner;

public class T03p03e02 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
		int num;
		
		System.out.print("Introduzca un numero entre 0 y 9.999 : ");       
		num=sc.nextInt();
		if(num<10){
			System.out.println("tine 1 cifra");   
		   }
		else if(num<100){
			System.out.println("tiene 2 cifras"); 
			}
		else if(num<1000){
			System.out.println("tiene 3 cifras"); 
			}
		else if (num<9999){
			System.out.println("tiene 4 cifras"); 
           }	
	
	}
}
