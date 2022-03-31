import java.util.Scanner;
public class T03p03e05{

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);

		int numeroAceptar;
        int numeroComprobar;
        int intentos=0;

        System.out.print("Introduce N (numero a aceptar): ");
        numeroAceptar = sc.nextInt();

        System.out.print("Introduce un numero: ");
        numeroComprobar = sc.nextInt();

        if(numeroComprobar>numeroAceptar){
                System.out.println("fallaste, es menor!!");
            }else if(numeroComprobar<numeroAceptar){
                System.out.println("fallaste, es mayor!!");
            }else if (numeroComprobar==numeroAceptar) {
                System.out.println("Enhorabuena, acertaste!!");
            } 

        while(numeroComprobar!=numeroAceptar){

            System.out.print("Introduce otro numero: ");
            numeroComprobar = sc.nextInt();

           if(numeroComprobar>numeroAceptar){
                System.out.println("fallaste, es menor!!");
            }else if(numeroComprobar<numeroAceptar){
                System.out.println("fallaste, es mayor!!");
            }else if (numeroComprobar==numeroAceptar) {
                System.out.println("Enhorabuena, acertaste!!");
            } 

		}
	}
}
