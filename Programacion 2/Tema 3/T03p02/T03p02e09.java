import java.util.Scanner;
public class T03p02e09{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			int x = 1;
			
			System.out.print("Tabla del: ");
			int n= sc.nextInt();
			
			for(int i = 1; i<=10;i++){
				x = n * i;
				System.out.printf("\n%d x %d = %d",n,i,x);
				x = n;
			}	
	}
}
