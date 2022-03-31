import java.util.Scanner;
public class T03p01e10{

	public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
	
	int lado;
	
	
	System.out.print("Introduce una base: ");
	lado = sc.nextInt();
	
	
	for(int i=1;i<=lado;i++){
		System.out.print("* ");
		
		for(int j=2;j<=lado;j++){
			System.out.print("* ");
		}
	
		System.out.println("");
	}

  }	
	
}
