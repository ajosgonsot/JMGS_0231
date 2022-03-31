import java.util.Scanner;
public class T03p02e03{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			System.out.print("Introduzca la hora: ");
			int hora = sc.nextInt();
			
			System.out.print("Introduzca los minutos: ");
			int min = sc.nextInt();
			
			System.out.print("Introduzca los segundos: ");
			int seg = sc.nextInt();
			
			if(seg==59){
				min = min +1;
				seg = 0;
			}if(min == 60){
				hora = hora +1;
				min = 0;
			}if(hora == 23 && min == 59 && seg == 59){
				hora = 0;
				min = 0;
				seg = 0;
			}
			System.out.printf("%d:%d:%d",hora,min,seg);		
	}
}
