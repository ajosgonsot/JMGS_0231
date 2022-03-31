import java.util.Scanner;

public class T03p02e10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		float pi=3.1415F;
		float radio=1.25F;
		float resultado1=0;
		float resultado2=0;
		        
        
        resultado1=(float)2*pi*radio;
        resultado2=(float)pi*(radio*radio);
        System.out.print("Introduce el radio de una circuferencia: "+radio+"\n");   
		System.out.printf("La longitud de una circuferencia de radio 1,25 es : %.2f \n",resultado1);
		System.out.printf("La area de una circuferencia de radio 1,25 es : %.2f ",resultado2);       
       

	}
}
