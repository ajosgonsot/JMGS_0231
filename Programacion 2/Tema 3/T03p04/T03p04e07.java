import java.util.Scanner;
public class T03p04e07 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		for (int i=0; i<=9; i++){
			for (int j=0; j<=9; j++){
				for (int k=0; k<=9; k++){
					System.out.println("");
					System.out.print((i==3)?"E":i);
					System.out.print((j==3)?"E":j);
					System.out.print((k==3)?"E":k);
				}		
			}
		}
		
	}
}
