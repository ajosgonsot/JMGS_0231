import java.util.Scanner;
public class T02p01{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		float nota1=4.5f;
		float nota2=7.5f;
		int resultado;
		
		resultado = (int)((nota1+nota2)/2);
		
		System.out.println("Notas de programacion");
		System.out.println("Nota del primer parcial: "+nota1);
		System.out.println("Nota del segundo parcial: "+ nota2);
		System.out.println("Nota final: "+resultado);
		
		
	}
}
