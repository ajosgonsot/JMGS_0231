import java.util.Scanner;
public class t04p01e02{

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
       int contadorc=0;
       int contadorp=0;
       int contadorn=0;
       double mediap=0;
       double mediar=0;
       int sumap=0;
       int sumar=0; 
       int numero[]=new int[5];
       boolean negativo = false;
             
		   for (int i=0; i < numero.length; i++) {
			   System.out.print("Introduzca un numero: ");
			   numero[i]=sc.nextInt();
			
				if (numero[i]<0) {
					contadorn++;
					negativo = true;
					sumar=sumar+numero[i];
				}
				if (numero[i]>0) {
					contadorp++;
					sumap=sumap+numero[i];
				}
				if (numero[i]==0) {
					contadorc++;
				}
												
				mediap=(double)sumap/contadorp;
				mediar=(double)sumar/contadorn;		
			}
			
			System.out.println("");
			System.out.println("El array introducido es:");
			
			for (int i=0; i<numero.length; i++) {
				
				System.out.print(numero[i]);
			}
			
			System.out.println("");
			System.out.println("");
			

			System.out.printf("La media de los positivos: %.1f\n",mediap);
			
			if (negativo==true) {
				System.out.printf("La media de los negativos: %.1f\n",mediar);
			} else if (negativo==false){
				System.out.print("No se puede hacer la media de los numeros negativos:");
			}			
			System.out.println("");
			System.out.printf("La cantidad de ceros es: %d",contadorc);
        
			
    }
}
