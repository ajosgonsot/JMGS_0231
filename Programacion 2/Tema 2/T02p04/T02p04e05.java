import java.util.Scanner;
public class T02p04e05 {

	public static void main (String[] args) {
	Scanner sc=new Scanner (System.in);
	
		int t=5000;
		int seg;
		int min;
		int horas;
		
		
		horas = t/3600;
		t = t - (horas*3600);
		min = t/60;
		t = t - (min*60);
		seg = t/1;
		t = t - (seg*1);
		
		
		System.out.println("Horas: "+horas+" Minutos: "+min+ " Segundos: "+seg);
		

	
	
	}
}
