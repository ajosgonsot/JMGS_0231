import java.util.Scanner;
import java.lang.Math;

public class T03p02e05 {	
	
  public static void main(String[] args) {
		 
    Scanner sc=new Scanner(System.in);
    
    int numero;
    int cuadrado;
    
    do{
      System.out.print("Ingresa un numero: ");
      numero = sc.nextInt();
     
      if(numero == 0){
		 }
           
      cuadrado = (int)Math.pow(numero,2);
      System.out.println(numero + " al cuadrado es " + cuadrado); //Sirve para mostrar el cuadrado de un numero
     
    }while (numero > 0);  
    
    
    System.out.println("Termina el proceso con un cero"); //Cuando el numero es 0 que el proceso se finalize
    }
 }
