
public class EstructurasdeControl {
	
	/* ESTRUCTURAS DE CONTROL */
	
	public static void main(String[] args) {

		/* ESTRUCTURAS IF *********************************************/
		
		//~ if (expresion_booleana) {
			
			//~ sentencias;
			
		//~ }
		
		//~ if (expresion_booleana) {
			
			//~ sentencias1;
			
		//~ } else {
			
			//~ sentencias2;
			
		//~ }
		
		//~ if (expresion_booleana1) {
			
			//~ sentencias1;
			
		//~ } else if (expresion_booleana2) {
			
			//~ sentencias2;
			
		//~ } else {
			
			//~ sentencias3;
			
		//~ }
		
		
		int x=0;
		
		if (x==1) {
			
			System.out.println("La variable x vale 1");
			
		}
		
		if (x==1) {
			
			System.out.println("La variable x vale 1");
			
		} else if (x>1) {
			
			System.out.println("La variable x es mayor que 1");
			
		}
		
		if (x==1) {
			
			System.out.println("La variable x vale 1");
			
		} else if (x>1) {
			
			System.out.println("La variable x es mayor que 1");
			
		} else {
			
			System.out.println("La variable x es menor que 1");
			
		}
		
		if (x==1) {
			
			System.out.println("La variable x vale 1");
			
		} else {
			
			if (x>1) {
				
				System.out.println("La variable x es mayor que 1");
				
			} else {
				
				System.out.println("La variable x es menor que 1");
				
			}
		}
		
		
		/* ESTRUCTURAS SWITCH *****************************************/
		
		//~ switch (expresion) {
			//~ case valor1: sentencias1; break;
			//~ case valor2: sentencias2; break;
			//~ case valor3: sentencias3; break;
			//~ ...
			//~ case valorN: sentenciasN; break;
			//~ [default: sentencias;]
		//~ }
		
		
		int nota=10;
		
		switch (nota) {
			case 5:
			case 6: System.out.println("APROBADO"); break;
			case 7:
			case 8: System.out.println("NOTABLE"); break;
			case 9:
			case 10: System.out.println("SOBRESALIENTE"); break;
			
			default:  System.out.println("SUSPENSO");
		}
		
		
		/* ESTRUCTURAS WHILE ******************************************/
		
		//~ while (expresion_booleana) {
			
			//~ sentencias;
			
		//~ }
		
		
		//~ int contador=1;
		
		//~ while (contador<=10) {
			
			//~ System.out.println(contador);
			//~ contador++;
			
		//~ }
		
		
		/* ESTRUCTURAS DO WHILE ***************************************/
		
		//~ do {
			
			//~ sentencias;
		
		//~ } while (expresion_booleana);
		
		//~ int contador=1;
		
		//~ do {
			
			//~ System.out.println(contador);
			//~ contador++;
			
		//~ } while (contador<=10);
		
		
		/* ESTRUCTURAS FOR ********************************************/
		
		//~ for ( inicializacion; expresion_booleana; incremento ) {
			
			//~ sentencias;
			
		//~ }
		
		
		//~ for (int contador=1; contador<=10; contador++) {
			
			//~ System.out.println(contador);
			
		//~ }
		
		//~ for (int i=1; i<=10; i++)
			//~ for (int j=1; j<=10; j++)
				//~ System.out.println("("+i+","+j+")");
		
		//~ for (int i=10; i>=1; i--)
			//~ for (int j=1; j<=10; j+=2)
				//~ System.out.println("("+i+","+j+")");
		
		
		/* ESTRUCTURAS DE SALTO ***************************************/
		
		//~ int i=0;
		//~ while (i<10) {
			//~ i++;
			//~ if (i==5) break;
			//~ System.out.println(i);
		//~ }
		
		//~ int j=0;
		//~ while (j<10) {
			//~ j++;
			//~ if (j==5) continue;
			//~ System.out.println(j);
		//~ }
		
		//~ int i=0;
		//~ bucleext:
		//~ while (i<10) {
			//~ i++;
			//~ for (int j=0;j<i;j++) {
				//~ System.out.print("*");
				//~ if (i==5) break bucleext;
			//~ }
			//~ System.out.println("");
		//~ }
		
		
	}
	
	
	/* METODOS O FUNCIONES ****************************************/
	
	//~ tipo_resultado nombre_funcion ( tipo_parametro nombre_parametro, ...) {
		
		//~ sentencias;
	
	//~ }
	
	void metodo1(int i, int j) {
		
		System.out.println("Valor parametro i: "+i);
		System.out.println("Valor parametro j: "+j);
	}
	
	int funcion1(int i, int j) {
		
		return i+j;
	}
	
	int funcion2() {
		
		metodo1(1,2);
		return funcion1(1,2);
	}
	
}
