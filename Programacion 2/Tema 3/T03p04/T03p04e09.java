import java.util.Scanner;
public class T03p04e09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	
		int num;
		int primero, segundo, tercero, cuatro;
		
		System.out.print("Introduce un numero: ");
		num = sc.nextInt();
		
		primero = num/1000;
		num = num%1000;
		segundo = num/100;
		num = num%100;
		tercero = num/10;
		num = num%10;
		cuatro = num/1;
		
		System.out.println(+primero+" "+segundo+" "+tercero+" "+cuatro);
		
		if(primero==cuatro && segundo==tercero){
			System.out.print("Es capicua");
		}else {
			System.out.print("No se capicua");
		}	
	}
}
