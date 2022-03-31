
public class Test04_argumentoslineacomandos {
	
	public static void main(String[] args) {
		
		/* USO DE ARGUMENTOS EN LINEA DE COMANDOS */
		
		/* En muchos sistemas, es posible pasar argumentos desde la línea de comandos
		 * a una aplicación, para lo cual se incluye un parámetro de tipo String[] en 
		 * la lista de parámetros de la función "main".
		 * Por convención, este parámetro se llama "args".
		 * Cuando se ejecuta una aplicación con el comando "java", se pasan los
		 * argumentos de línea de comandos que aparecen detrás del nombre de la
		 * aplicación, al método "main" en forma de objetos String en el array "args".
		 * El número de argumentos pasados se obtiene del tamaño del array.
		 * */

		System.out.println("");
			
		for (int i=0; i<args.length; i++ )
			System.out.println(args[i]);		
		
		System.out.println("");
	}
}
