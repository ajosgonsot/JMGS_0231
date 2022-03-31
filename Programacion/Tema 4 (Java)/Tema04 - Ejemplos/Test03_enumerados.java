
public class Test03_enumerados {
	
	/* ENUMERADOS */
		
	/* El tipo básico "enum" define un conjunto de constantes que se representan
	 * como identificadores únicos. Son de tipo referencia, al igual que las clases.
	 * Los tipos "enum" son implícitamente "final", no se pueden modificar.
	 * Los tipos "enum" son implícitamente "static" y no pueden ser locales.
	 * No se pueden crear objetos de tipos enumerados (new).
	 * En Java, los tipos "enum" se definen internamente como clases "Enum". */

	private enum DIAS {LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO}
	private enum ESTADO {APAGADO,ENCENDIDO}
	private enum COLORES {ROJO,VERDE,AZUL}

	/* La siguiente declaración sería equivalente pero no nos ofrece
	 * las ventajas de los enumerados, aunque permite comparaciones con
	 * enteros que los enumerados no permiten!! */
	 
	private final static int ROJO=1;
	private final static int VERDE=2;
	private final static int AZUL=3;
	
	
	public static void main(String[] args) {

		/* EJEMPLOS */

		System.out.println("");		
		
		DIAS dia=DIAS.LUNES;
		
		if (dia==DIAS.LUNES) System.out.println("El dia es: "+dia);
		
		System.out.println(dia.name());		// Método de la clase Enum
		System.out.println(dia.ordinal());	// Médoto de la clase Enum
		
		switch (dia) {
			case LUNES:
				System.out.println("El dia es: "+dia);
				break;
			case MARTES:
				System.out.println("El dia es: "+dia);
				break;
			/* ... */	
		}

		for (int i=0; i<DIAS.values().length; i++) {	// Recorrido del enumerado como array
			System.out.println(DIAS.values()[i].name()+" "+DIAS.values()[i].ordinal());
		}
		
		System.out.println("");
	}
}
