import java.util.Scanner;
public class T03p05e04 {
	
	private static void angulos(double angulo){
		double seno;
		double coseno;
		double tangente;
		double radianes;
		final double PI=3.14159265358979323846;
		
		radianes = (angulo*PI) / 180;
		seno = Math.sin(radianes);
		coseno = Math.cos(radianes);
		tangente = Math.tan(radianes);
		
		System.out.printf("Seno: %.2f\n",seno);		
		System.out.printf("Coseno: %.2f\n",coseno);		
		System.out.printf("Tangente: %.2f\n",tangente);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		double angulo;
		double seno;
		double coseno;
		double tangente;
		double radianes;
		final double PI=3.14159265358979323846;
		
		System.out.print("Introduzca un angulo (0..360): ");
		angulo = sc.nextDouble();
		angulos(angulo);
		
		
		
		
	}

}
