
public class Test08_recursividad {
	
	//	2³ = 2*2*2 = 8
	//	2³ = 2*2² = 2*2*2¹ = 2*2*2 = 8
	
	public static int potenciaR(int x, int y) {
		
		if (y==1) {						// Caso base
			return x;
		} else {						// Reducción de la complejidad
			return x*potenciaR(x,y-1);
		}
	}
	
	public static int potenciaI(int x, int y) {
		
		//~ int resultado=1;						// Implementación 1
		//~ for (int j=0; j<y; j++)
			//~ resultado=resultado*x;
		//~ return resultado;
		
		int resultado=1;							// Implementación 2
		while (y>0) {
			resultado=resultado*x;
			y--;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		
		System.out.println("");
			
		/* RECURSIVIDAD */
		
		/* Un método se llama recursivo cuando se llama a sí mismo.
		 * 
		 * ¿Cuándo utilizar la recursividad?
		 * - Cuando la resolución de un problema es más sencilla.
		 * - Cuando no es infinita, es decir, hay un caso resoluble más sencillo.
		 * 
		 * Cuando se va a resolver un problema recursivo en cada llamada 
		 * sucesiva al método recursivo nos debe ir acercando a la solución.
		 * 
		 * ¿Es eficiente la recursividad? NO
		 * Siempre hay un método equivalente iterativo (aunque sea más complicado).
		 * 
		 * Ejemplo: Potencia de un número.
		 * */

		System.out.println(potenciaR(2,3));
		System.out.println(potenciaI(2,3));


		System.out.println("");
	}
}
