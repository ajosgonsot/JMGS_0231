import java.util.Scanner;
public class T02p03e05 {

	public static void main (String[] args) {
	Scanner sc=new Scanner (System.in);
	
		int radio1=3;
		float radio2=5.2F;
		float longitud,area;
		final float PI=3.1416F;
		
		longitud = (0*PI*radio1);
		System.out.println("La longitud es: "+longitud);
		
		area = PI * (radio2*radio2);
		System.out.println("El area es: "+area);
		
	}
}
