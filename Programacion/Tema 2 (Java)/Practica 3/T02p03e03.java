import java.util.Scanner;
public class T02p03e03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n;
		int c;
	
		System.out.printf("Introduce un valor: ");
		n=sc.nextInt();

		n++;
		System.out.printf("El valor de n es: %d\n",n);
		
		String pn = "";
		pn=(n>0)? "Positivo" : "Negativo";
		System.out.println(pn);

		c=n*n;
		System.out.printf("Valor cuadrado: %d\n",c);
		










	}
}
