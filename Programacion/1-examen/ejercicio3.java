import java.util.Scanner;
public class ejercicio3{
	
	public static  int MostarMenu (){
		//Hacer un menu y redondear logaritmos, Hacer una funcion y que calcule la base del esponente por el numero 
		Scanner sc=new Scanner(System.in);
		
		int opcion;
	
		System.out.println("");
		System.out.println("MENU");
		System.out.println("-----");
		System.out.println("1.- Redondear");
		System.out.println("2.- Logaritmo");
		System.out.println("3.- Sin la funcion math");
		System.out.println("4.- Con la funciona math");
		System.out.println("0.- Salir");
		
		
		System.out.println();
		System.out.print("Opcion?: ");
		opcion = sc.nextInt();
		System.out.println("");
		
		return opcion;
	}
	public static int math (int base  ,int n ){
		
		
		int resultado5 = (int) Math.pow(base, n);
		
		return resultado5;
	}
	
	public static void main ( String []args){
		
		Scanner sc= new Scanner(System.in);
	
		int op;
		
		do {
			
			op = MostarMenu();
			
			switch (op) {
			
				case 1://Redondear
					
					double  numero;
					System.out.print("Introduce un numero double y lo vamos a redondear con la funcion floor: ");
					numero=sc.nextDouble();
					int resultado;
					resultado=(int)Math.floor(numero);
					System.out.print("El resultado del numero es: "+resultado);
						
				
				break;
				case 2://logaritmo
					double numero1;
					System.out.print("Introduce un numero que se va a pasar log e: ");
					numero1=sc.nextDouble();
					int resultado1;
					resultado1=(int)Math.log(numero1);
					System.out.print("El resultado del numero es: "+resultado1);

				
				break;
				case 3://sin la funcion math
				
					int num1;
					int num2;
					int contador=0;
					System.out.print("Introduce el primer numero: ");
					num1=sc.nextInt();
					System.out.print("Introduce  el segundo numero: ");
					num2=sc.nextInt();
					int resultado2=1;
						while(contador<num2){
							contador++;
							resultado2=resultado2*num1;
							
						}	
						
				System.out.print("El resultado del numero es: "+resultado2);

				break;
				case 4://con la funcion math
				
					int n, base;
					System.out.println("Ingrese la base: ");
					base = sc.nextInt();
					System.out.println("Ingrese el exponente");
					n = sc.nextInt();
					System.out.printf("El resultado es: %d",math(base,n));
				break;
			}
			
		}while(op!=0);
	
	}
}
