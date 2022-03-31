import java.util.*;

public class Test01_arrays {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		/* Quiero leer 10 notas ¿problema? */
		/* Solución: utilizar 10 variables o utilizar arrays */

		//~ int nota;
		//~ int a,b,c,d,e,f,g,h,j,k;
		//~ for (int i=1; i<10; i++) nota=sc.nextInt(); // Sobreescribe los datos!!
		
		/* Declaración de un array */
		
		//~ int[] notas; // Opción 1
		//~ //int notas[]; // Opción 2
		//~ notas=new int[5];
		//~ notas[0]=1;
		//~ notas[1]=2;
		//~ notas[2]=3;
		//~ notas[3]=4;
		//~ notas[4]=5;
		
		/* Inicialiazación de datos */
		
		//~ int[] notas={1,2,3,4,5}; // Opción 1
		//~ int[] notas2=new int[]{1,2,3,4,5}; // Opción 2
		//~ String[] notas3={"APROBADO", "SUSPENSO"}; // Ejemplo array de String
		
		/* Ejemplo de utilización de un array */
		
		//~ for (int i=0; i<10; i++) notas[i]=0;

		/* Asignación de un array a otro ¿puntero C? */
		
		//~ int[] notas1={1,2,3,4,5};
		//~ int[] notas2;
		//~ notas2=notas1; // Asigna la referecia (no copia los valores) 
		//~ System.out.println(notas2[0]);

		/* Comparación de arrays */
		
		//~ System.out.println("Notas1 es igual a Notas2 ? ");
		//~ System.out.println(notas1==notas2); // Son iguales (compara la referencia)
		//~ int[] notas3={1,2,3,4,5};
		//~ System.out.println("Notas1 es igual a Notas3 ? ");;
		//~ System.out.println(notas1==notas3); // Son diferentes (compara la referencia, NO los valores)

		/* Array multidimensionales */
		
		//~ int[][] notas;
		//~ notas=new int[5][10];
		//~ notas[0][0]=10;
		
		/* Ejemplo de utilización de un array multidimensional */
		
		//~ for (int i=0; i<5; i++)
			//~ for (int j=0; j<10; j++) notas[i][j]=0;

		/* Array multidimensionales "flexibilidad" */
		
		//~ int[][] notas;
		//~ notas=new int[5][];
		//~ notas[0]=new int[10];
		//~ notas[1]=new int[20];
		//~ notas[2]=new int[30];
		//~ notas[3]=new int[40];
		//~ notas[4]=new int[50];
		
		/* Funciones de arrays */
		
		//~ int notas[]=new int[10];
		//~ System.out.println(notas.length);
		//~ for (int i=0; i<notas.length; i++) notas[i]=i;
		
		/* Clase Arrays y métodos (mirar la API) */
		
		//~ int notas[]=new int[10];
		//~ Arrays.fill(notas,10);
		//~ Arrays.fill(notas,3,5,10);
		
		//~ Arrays.equals();
		//~ Arrays.sort();
		//~ Arrays.copyOf();
		//~ Arrays.clone();
		
		//~ for (int i=0; i<notas.length; i++) System.out.println(notas[i]);

		System.out.println("");
	}
}
