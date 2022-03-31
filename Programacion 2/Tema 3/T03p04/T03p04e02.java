import java.util.Scanner;
public class T03p04e02{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int lado;
		
		
		System.out.print("Introduce una base: ");
		lado = sc.nextInt();
		
		for(int l=1;l<=lado;l++){
		
		for(int k=1;k<=lado;k++){
			if(l==1 || k==1 || l==lado || k==lado){
				System.out.print("* ");
			}else{
				System.out.print("  ");
			}
		}
	
		System.out.println("");
	}
	
}
}
