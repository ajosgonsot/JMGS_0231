import java.util.Scanner;

public class T03p03e08 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
     int contprim=0;
     boolean primo;
     int x=0;
     int y;
     int correcto=0;
    
		System.out.print("Introduce el numero:");
		y=sc.nextInt();
		
			for(int i=1; i<=y; i++){
				primo=true;
				x=2;
				correcto++;
				
				while( x<=i -1 && primo == true ){
					
					if (i % x ==0){
				
					primo=false;
						
				}
				
				x++;
			
				}
				if(primo){
				
				contprim++;
				System.out.println( +correcto+  " es primo   " );
				
				}

			}	

			System.out.println (" En el rango 1 hasta " +y+ " hay " +contprim+ " numeros primos ");
	}
}
