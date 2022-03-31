import java.util.Scanner;

public class T03p04e07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for (int i=0; i<=9; i++) {
			
		for (int j=0; j<=9; j++) {
				
		for (int k=0; k<=9; k++) {
					
			if(i==3) {                               
				System.out.print("E");                            
			} else {                               
				System.out.print(i);
			}                            
			if(j==3) {                               
				System.out.print("E");                            
			} else {                               
				System.out.print(j);
			}                           
			if(k==3) {                               
				System.out.print("E");                            
			} else {                               
				System.out.print(k);
			}  
				System.out.println(" ");       
				}
			}
		}
	}
}
