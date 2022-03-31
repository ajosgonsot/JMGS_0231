import java.util.Scanner;
public class T04p02e05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[][] numero = new int[3][3];
				
		for (int i = 0; i < numero.length; i++){
			for (int j = 0; j < numero[i].length; j++){
				System.out.print("Introduzca elemento ["+i+"]["+j+"]: ");
				numero[i][j] = sc.nextInt();
			}			
		}
		
		System.out.println();
		System.out.println("El array introducido es: ");
		
		for (int i = 0; i < numero.length; i++){
			for (int j = 0; j < numero[i].length; j++){
				System.out.print(numero[i][j]+" ");	
			}			
			System.out.println();
		}
		
		int suma1=0, suma2=0, suma3=0;
		
		for (int i = 0; i < numero.length; i++){
			for (int j = 0; j < numero[i].length; j++){
				if (i==0) {
					suma1 = suma1 + numero[i][j];
				}else if (i==1) {
					suma2 = suma2 + numero[i][j];
				}else if (i==2) {
					suma3 = suma3 + numero[i][j];
				}
			}			
		}
		
		int mult1=1, mult2=1, mult3=1;
		
		for (int i = 0; i < numero.length; i++){
			for (int j = 0; j < numero[i].length; j++){
				if (j==0) {
					mult1 = mult1 * numero[i][j];
				}else if (j==1) {
					mult2 = mult2 * numero[i][j];
				}else if (j==2) {
					mult3 = mult3 * numero[i][j];
				}
			}			
		}
		
		System.out.println();
		System.out.println("Suma Fila 0 es: "+suma1);
		System.out.println("Suma Fila 1 es: "+suma2);
		System.out.println("Suma Fila 2 es: "+suma3);
		System.out.println();
		System.out.println("Producto Columna 0 es: "+mult1);
		System.out.println("Producto Columna 1 es: "+mult2);
		System.out.println("Producto Columna 2 es: "+mult3);
	}
}
