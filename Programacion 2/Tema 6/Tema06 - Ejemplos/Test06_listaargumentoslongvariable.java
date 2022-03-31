
public class Test06_listaargumentoslongvariable {
	
	public static void main(String[] args) {
		
		System.out.println("");
			
		/* LISTA DE ARGUMENTOS DE LONGITUD VARIABLE */
		
		/* Con las listas de argumentos de longitud variable podemos crear
		 * métodos que reciben un número arbitrario de argumentos.
		 * Un tipo de argumento precedido de una "elipsis" (...) indica que 
		 * el método recibe un número variable de argumentos de ese tipo.
		 * El uso de la "elipsis" solo puede ocurrir una vez en la lista de parámetros.
		 * La "elipsis" con su tipo debe colocarse al final de la lista.
		 * Java trata a la lista de argumentos de longitud variable como un array.
		 * */
		
		
		System.out.printf("%.2f\n",promedio(1));
		System.out.printf("%.2f\n",promedio(1,2,5));
		System.out.printf("%.2f\n",promedio(1,2,3,4,7));
		
		System.out.println("");
	}

	private static double promedio(double... numeros) {
		double total=0.0;
		for (int i=0; i<numeros.length; i++)
			total=total+numeros[i];
		return total/numeros.length;
	}
	
}
