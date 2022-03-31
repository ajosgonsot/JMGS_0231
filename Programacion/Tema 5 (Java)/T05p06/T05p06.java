import java.util.*;

public class T05p06 {
	
	private static int mostrarMenu() {
		
		Scanner sc=new Scanner(System.in);
		int op;
		System.out.println("MENU");
		System.out.println("----");
		System.out.println();
		System.out.println("1.- Alta de alumno.");
		System.out.println("2.- Baja de alumno.");
		System.out.println("3.- Alta de modulo.");
		System.out.println("4.- Baja de modulo.");
		System.out.println("5.- Calificar.");
		System.out.println("6.- Listado de alumnos.");
		System.out.println("7.- Listado de modulos.");
		System.out.println("8.- Listado de notas.");
		System.out.println("0.- Salir.");
		System.out.println();
		System.out.print("Opcion? ");
		op=sc.nextInt();
		System.out.println("");
		return op;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int op;
		
		final int POS=10;
		Alumno[] tAlumnos=new Alumno[POS];
		Modulo[] tModulos=new Modulo[POS];
		Notas[] tNotas=new Notas[POS];
		
		do {
			System.out.println("");
			op=mostrarMenu();
			
			switch (op)	{
				
			case 1: // Alta de Alumno
				
				if (Alumno.numAlumno==POS) {
					System.out.println("Tabla alumnos completa!!");
				} else {
					Alumno a=new Alumno();
					System.out.print("Introduce el dni del alumno: ");
					a.setDni(sc.next());
					System.out.print("Introduce el nombre del alumno: ");
					a.setNombre(sc.next());
					System.out.print("Introduce la fecha de nacimiento del alumno (dd/mm/yyyy): ");
					a.setFecNac(sc.next());
					System.out.println("");
					if (a.altaAlumno(tAlumnos))
						System.out.println("Alta de alumno correcta. DNI: "+a.getDni());
					else
						System.out.println("Alta de alumno incorrecta!!");
				}
				break;
				
			case 2: // Baja Alumno
			
				if (Alumno.numAlumno==0) {
					System.out.println("Tabla alumnos vacia!!");
				} else {
					Alumno a=new Alumno();
					System.out.print("Introduce el dni del alumno: ");
					a.setDni(sc.next());
					System.out.println("");
					if (a.bajaAlumno(tAlumnos))
						System.out.println("Baja de alumno correcta. DNI: "+a.getDni());
					else
						System.out.println("Baja de alumno incorrecta!!");
				}
				break;
				
			case 3: // Alta de Módulo
				
				if (Modulo.numModulo==POS) {
					System.out.println("Tabla módulos completa!!");
				} else {
					Modulo m=new Modulo();
					System.out.print("Introduce el codigo del modulo: ");
					m.setCodigo(sc.nextInt());
					System.out.print("Introduce el titulo del modulo: ");
					m.setTitulo(sc.next());
					System.out.print("Introduce las horas semanales del modulo: ");
					m.setHorasSemanales(sc.nextInt());
					System.out.println("");
					if (m.altaModulo(tModulos))
						System.out.println("Alta de modulo correcta. CODIGO: "+m.getCodigo());
					else
						System.out.println("Alta de modulo incorrecta!!");
				}
				break;
				
			case 4: // Baja Módulo
			
				if (Modulo.numModulo==0) {
					System.out.println("Tabla modulos vacia!!");
				} else {
					Modulo m=new Modulo();
					System.out.print("Introduce el codigo del modulo: ");
					m.setCodigo(sc.nextInt());
					System.out.println("");
					if (m.bajaModulo(tModulos))
						System.out.println("Baja de modulo correcta. CODIGO: "+m.getCodigo());
					else
						System.out.println("Baja de modulo incorrecta!!");
				}
				break;
					
			case 5: // Calificar
			
				if (Notas.numNotas==POS) {
					System.out.println("Tabla notas completa!!");
				} else {
					Notas n=new Notas();
					System.out.print("Introduce el dni del alumno: ");
					n.setDni(sc.next());
					System.out.print("Introduce el codigo del modulo: ");
					n.setCodigo(sc.nextInt());
					System.out.print("Introduce la nota de la 1a Evaluacion: ");
					n.setNota1aEv(sc.nextDouble());
					System.out.print("Introduce la nota de la 2a Evaluacion: ");
					n.setNota2aEv(sc.nextDouble());
					System.out.print("Introduce la nota de la 3a Evaluacion: ");
					n.setNota3aEv(sc.nextDouble());
					System.out.println("");
					if (n.altaNotas(tNotas,tAlumnos,tModulos))
						System.out.println("Alta de notas correcta. DNI: "+n.getDni()+" CODIGO: "+n.getCodigo());
					else
						System.out.println("Alta de notas incorrecta!!");
				}
				break;
				
			case 6: // Listado de Alumnos
			
				System.out.println("LISTADO DE ALUMNOS");
				System.out.println("------------------");
				for (int i=0; i<tAlumnos.length; i++) {
					if (tAlumnos[i]!=null)
						System.out.printf("%d-. DNI: %s NOMBRE: %s FEC NAC.: %s\n",
											i,
											tAlumnos[i].getDni(),
											tAlumnos[i].getNombre(),
											tAlumnos[i].getFecNac());
					else
						System.out.println(i+"-. null");
				}
				break;

			case 7: // Listado de Modulos
			
				System.out.println("LISTADO DE MODULOS");
				System.out.println("------------------");
				for (int i=0; i<tModulos.length; i++) {
					if (tModulos[i]!=null)
						System.out.printf("%d-. CODIGO: %d TITULO: %s HORAS SEMANALES: %d\n",
											i,
											tModulos[i].getCodigo(),
											tModulos[i].getTitulo(),
											tModulos[i].getHorasSemanales());
					else
						System.out.println(i+"-. null");
				}
				break;

			case 8: // Listado de Notas
			
				System.out.println("\nLISTADO DE NOTAS");
				System.out.println("----------------");
				for (int i=0; i<tNotas.length; i++) {
					if (tNotas[i]!=null)
						System.out.printf("%d-. DNI: %s NOMBRE %s CODIGO: %d TITULO: %s\n"+
										"\tNOTA 1aEv: %.2f NOTA 2aEv: %.2f NOTA 3aEv: %.2f FINAL: %s\n",
											i,
											tNotas[i].getDni(),
											(tNotas[i].getAlumno(tAlumnos)!=null) ? tNotas[i].getAlumno(tAlumnos).getNombre() : "",
											tNotas[i].getCodigo(),
											(tNotas[i].getModulo(tModulos)!=null) ? tNotas[i].getModulo(tModulos).getTitulo() : "",
											tNotas[i].getNota1aEv(),
											tNotas[i].getNota2aEv(),
											tNotas[i].getNota3aEv(),
											tNotas[i].getNotaFinal());
					else
						System.out.println(i+"-. null");
				}
				break;

			case 0:
				break;
				
			default:
				System.out.println("Opcion incorrecta!!");
				System.out.println("");
			}
			
		} while (op!=0);
		System.out.println("");
	}
	
}
