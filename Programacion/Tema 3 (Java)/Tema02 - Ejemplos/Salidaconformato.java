import java.util.Calendar;

public class Salidaconformato {
	
	public static void main(String[] args) {
		
		System.out.println("");
			
		/* PRINTF */
		
		/* Java utiliza el método System.out.printf para mostrar datos con formato (similar a C).
		 * El primer argumento del método es una "cadena de formato" que puede
		 * consistir de texto fijo y especificadores de formato.
		 * Printf imprime el texto fijo al igual que print o println.
		 * Cada especificador de formato recibe un valor y especifica el tipo a imprimir.
		 * Los especificadores de formato empiezan por el signo % y van seguidos de
		 * un caracter que representa el tipo de datos.
		 * Cada especificador de formato recibe un valor de los siguientes argumentos del
		 * método printf.
		 * */

		System.out.printf("Mensaje: %s\n%s\n","Bienvenido a","la programacion en Java!");


		/* Tipos de especificadores de formato
		 * 'd'			Muestra un entero decimal (base10)
		 * 'o'			Muestra un entero octal (base8)
		 * 'x' o 'X'	Muestra un entero hexadecimal (base16)
		 * 'e'			Muestra un valor de punto flotante en notación exponencial
		 * 'f'			Muestra un valor de punto flotante en formato decimal
		 * 'c' o 'C'	Muestra un caracter individual
		 * 's' o 'S'	Muestra una cadena de caracteres
		 * 'tc','tF','tD','tr',... Muestra distintos formatos de fecha
		 * 'b'			Muestra el valor 'true' o 'false' de un booleano
		 * '\n'			Retorno de línea
		 * '\t'			Tabulador
		 * */

		System.out.printf("%d\n", -26);
		System.out.printf("%o\n", 26);
		System.out.printf("%x\n", 26);
		System.out.printf("%e\n", 12345678.9);
		System.out.printf("%f\n", 12345678.9);
		System.out.printf("%c\n", 'a');
		System.out.printf("%s\n", "Esta es una cadena");

		Calendar fechaHora=Calendar.getInstance();
		System.out.printf("%tc\n", fechaHora);
		System.out.printf("%tF\n", fechaHora);
		System.out.printf("%tD\n", fechaHora);
		System.out.printf("%tr\n", fechaHora);
		System.out.printf("%tT\n", fechaHora);
		boolean prueba=true;
		System.out.printf("%B\n", prueba);


		/* Printf permite:
		 * - Redondear valores de punto flotante a un número indicado de decimales.
		 * - Alinear una columna de números con puntos decimales.
		 * - Justificar a la derecha o izquierda.
		 * - Inserción de caracteres literales en posiciones precisas.
		 * - Visualizar de tipos de datos con anchuras de campo de tamaño fijo.
		 * - Visualizar fechas y horas en diversos formatos.
		 * - ...
		 * */
		/* El tamaño exacto de un campo se especifica mediante una "anchura de campo".
		 * Si la anchura es mayor que los datos a mostrar, se justifican a la derecha.
		 * Se especifica un entero entre el signo % y el carácter de conversión.
		 * También se puede especificar la precisión de los datos, en este caso, el 
		 * valor de la anchura cambia su significado dependiendo el tipo de dato.
		 * */

		System.out.printf("%4d\n", 1);
		System.out.printf("%4d\n", 12);
		System.out.printf("%4d\n", 123);
		System.out.printf("%4d\n", 1234);
		System.out.printf("%9.3f\n", 123.456789);


		/* Printf permite el uso de "banderas" para mejorar la visualización de los datos:
		 * '-'		Justifica a la izquierda.
		 * '+'		Muestra un signo + para valores positivos y - para valores negativos.
		 * ' '		Muestra un espacio.
		 * '0'		Muestra 0's a la izquierda.
		 * ...
		 * */
		 
		System.out.printf( "%+d\t%+d\n", 786, -786 );
		System.out.printf( "% d\n% d\n", 547, -547 );
		System.out.printf( "%+09d\n", 452 );
		System.out.printf( "%09d\n", 452 );
		System.out.printf( "% 9d\n", 452 );

		System.out.println("");
	}
	
}

