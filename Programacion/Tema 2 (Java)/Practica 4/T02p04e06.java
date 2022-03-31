import java.util.Scanner;
public class T02p04e06 {
	
	public static void main(String[] args) {
		
	int euros=0;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Introduce una cantidad en euros: ");
	
	euros = sc.nextInt();
	
		int Quinientos=euros/500; 
		euros=euros-500*Quinientos; 
	
		int Doscientos=euros/200; 
		euros=euros-200*Doscientos;
	
		int Cien=euros/100; 
		euros=euros-100*Cien;
	
		int Cincuenta=euros/50; 
		euros=euros-50*Cincuenta;
	
		int Veinte=euros/20; 
		Veinte=euros-20*Veinte;
	
		int Diez=euros/10; 
		euros=euros-10*Diez;
	
		int Cinco=euros/5; 
		euros=euros-5*Cinco;
		
		
	System.out.println("Billetes de 500e: "+Quinientos);
	System.out.println("Billetes de 200e: "+Doscientos);
	System.out.println("Billetes de 100e: "+Cien);
	System.out.println("Billetes de 50e: "+Cincuenta);
	System.out.println("Billetes de 20e: "+Veinte);
	System.out.println("Billetes de 10e: "+Diez);
	System.out.println("Billetes de 5e: "+Cinco);
	System.out.println("Me sobran: " + euros + "e");
	
		}
	
	}
