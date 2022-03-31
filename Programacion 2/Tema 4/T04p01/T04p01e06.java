import java.util.Scanner;
public class T04p01e06{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[] notas1 = new int [3];	
		int[] notas2 = new int [3];
		int[] notas3 = new int [3];
		double media = 0.0;
		double media2 = 0.0;
		double media3 = 0.0;
		double media4 = 0.0;
		double media5 = 0.0;
		double media6= 0.0;
		int suma1=0;
		int suma2=0;
		int suma3=0;
		
		System.out.println("Leyendo notas 1er examen... ");
		
		int j=1;
		for(int i=0; i < notas1.length; i++){
			System.out.print("Alumno ("+j+"): ");
			notas1[i] = sc.nextInt();
			j=j+1;
		}
		System.out.println(" ");
		System.out.println("Leyendo notas 2er examen... ");
		
		j=1;
		for(int i=0; i < notas2.length; i++){
			System.out.print("Alumno ("+j+"): ");
			notas2[i] = sc.nextInt();
			j=j+1;
		}
		System.out.println(" ");
		System.out.println("Leyendo notas 3er examen... ");
		
		j=1;
		for(int i=0; i < notas3.length; i++){
			System.out.print("Alumno ("+j+"): ");
			notas3[i] = sc.nextInt();
			j=j+1;
		}
		
		System.out.println(" ");
		for (int i=0; i < notas1.length; i++) {
			media = media + notas1[i];
		}
			media = media / notas1.length;
			System.out.printf("Media primer examen: %.2f \n",media);
		
		for (int i=0; i < notas2.length; i++) {
			media2 = media2 + notas2[i];
		}
			media2 = media2 / notas2.length;
			System.out.printf("Media segundo examen: %.2f \n",media2);
			
		for (int i=0; i < notas3.length; i++) {
			media3 = media3 + notas3[i];
		}
			media3 = media3 / notas3.length;
			System.out.printf("Media tercer examen: %.2f \n",media3);
			
		System.out.println(" ");
	
		suma1 = notas1[0]+notas2[0]+notas3[0];
		suma2 = notas1[1]+notas2[1]+notas3[1];
		suma3 = notas1[2]+notas2[2]+notas3[2];
		media4 = (double)suma1 / 3;
		media5 = (double)suma2 / 3;
		media6 = (double)suma3 / 3;
		
		System.out.println();
		System.out.printf("Media del alumno 1 es: %.2f\n",media4);
		System.out.printf("Media del alumno 2 es: %.2f\n",media5);
		System.out.printf("Media del alumno 3 es: %.2f\n",media6);
	}
}
