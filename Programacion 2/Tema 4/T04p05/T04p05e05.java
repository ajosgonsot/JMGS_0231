import java.util.Scanner;
public class T04p05e05{
	
	enum DIAS {LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO}
	enum LETRAS {L,M,X,J,V,S,D}
	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<DIAS.values().length;i++){
			System.out.printf("El d\u00eda %s ocupa la posici\u00f3n %d en el enumerado.\n",DIAS.values()[i],DIAS.values()[i].ordinal());
		}
		
		System.out.println("");
		
		for(int i=0;i<DIAS.values().length && i<LETRAS.values().length;i++){
			System.out.printf("El d\u00eda %s corresponde a la letra %s\n",DIAS.values()[i],LETRAS.values()[i]);
		}
		
		System.out.println("");
		
		System.out.print("Introduce un numero: ");
		int key=sc.nextInt();
		
		System.out.printf("D\u00eda %s (%s)",DIAS.values()[key-1],LETRAS.values()[key-1]);
		
	}
}
