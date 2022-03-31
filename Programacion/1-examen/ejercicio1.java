import java.util.Scanner;
public class ejercicio1{
	
	public static void main(String []args){
	//Introducir cualquier tipo letra y si introduces cero el programa se sale, Cuenta letras validad y no validad y saca los porcentajes de las letras.

	Scanner sc=new Scanner(System.in);
	

	char opt;
	int contletras=0;
	int conta=0;
	int contb=0;
	int contc=0;
	int letrasInvalidas=0;
	int letrasValidas=0;
	double resultado;
	double resultado1;
	double resultado2;
	double resultado3;
	double resultado4;


	
	

		do{
			System.out.print("Introduce una letra (a,b,c): ");
			opt=sc.next().charAt(0);
			contletras++;
			
				if(opt=='a'){
				conta++;	
				}
				if(opt=='b'){
				contb++;	
				}
				if(opt=='c'){
				contc++;	
				}
				
				if(opt!='a' && opt!='b' && opt!='c'){
					
					letrasInvalidas++;
					
				} 

		}while(opt!='0');	
		contletras--;
		letrasInvalidas--;
		letrasValidas=conta+contb+contc;
		
		
		resultado=(double)(conta*100)/letrasValidas;
		resultado1=(double)(contb*100)/letrasValidas;
		resultado2=(double)(contc*100)/letrasValidas;
		resultado3=(double)(letrasValidas*100)/contletras;
		resultado4=(double)(letrasInvalidas*100)/contletras;

		
		System.out.printf("\nLa cantidad de letras de a: %d y el porcentaje es %.2f%%",conta,resultado);
		System.out.printf("\nLa cantidad de letras de b: %d y el porcentaje es %.2f%%",contb,resultado1);
		System.out.printf("\nLa cantidad de letras de c: %d y el porcentaje es %.2f%%",contc,resultado2);
		
		System.out.printf("\nEl porcentaje de letra valida es %.2f%% y no validas  es %.2f%%",resultado3,resultado4);

		
		
	}
}
	
	
