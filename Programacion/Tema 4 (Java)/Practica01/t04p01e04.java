import java.util.Scanner;
public class t04p01e04{

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        int [] numero1=new int [5];
        boolean repetidos = false;
        
        	System.out.println("Leyendo numeros: ");
			        
        for (int i=0; i<numero1.length; i++) {
			
			System.out.print("Numero: ");
			numero1[i]=sc.nextInt();
		
		}
		
		for (int i=0; i<numero1.length; i++) {
			
			for (int j=i+1; j<numero1.length; j++) {
				
				if (numero1[i]==numero1[j]) {
					
					repetidos=true;
				
				}
			
			}
		
		}
		
			System.out.println("");
			System.out.println("El array introducido es:");
			for (int i=0; i<numero1.length; i++){
				
				System.out.print(numero1[i]);
			}
			
			System.out.println("");
			
			if (repetidos==true) {
				
				System.out.print("Hay numeros repetidos");
				
			}
			
	
		
	}
        
         
}


