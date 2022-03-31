import java.util.*;

public class Test {

	private static int mostrarMenu() {
		Scanner sc=new Scanner(System.in);			
		System.out.println("");
		System.out.println("MENU");
		System.out.println("----");
		System.out.println("1. Alta de Alumno.");
		System.out.println("2. Baja de Alumno.");
		System.out.println("3. Listado de Alumnos.");
		System.out.println("0. Salir.");
		System.out.println("");
		System.out.print("Opcion? ");
		int op=sc.nextInt();
		System.out.println("");
		return op;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			
		int op;
		
		final int SIZE=10;
		Alumno[] tAlumnos=new Alumno[SIZE];
		
		do {
			op=mostrarMenu();
			switch (op) {
				case 1: // Alta de alumno

					if (Alumno.numAlumno==SIZE) {
						System.out.println("No hay alumnos!!");
					} else {										
						Alumno a=new Alumno();
						System.out.print("Introduce el dni del alumno: ");
						a.setDni(sc.next());
						System.out.print("Introduce el nombre del alumno: ");
						a.setNombre(sc.next());
						System.out.print("Introduce la edad del alumno: ");
						a.setEdad(sc.nextInt());
						System.out.println("");
						
						if (a.altaAlumno(tAlumnos)) {
							System.out.println("Alta alumno correcta.");
						} else {
							System.out.println("Alta alumno incorrecta!!");
						}
					}
					break;
				
				case 2: // Baja de Alumno

					if (Alumno.numAlumno==0) {
						System.out.println("No hay alumnos!!");
					} else {					
						Alumno a=new Alumno();
						System.out.print("Introduce el dni del alumno: ");
						a.setDni(sc.next());
						System.out.println("");
						
						if (a.bajaAlumno(tAlumnos)) {
							System.out.println("Baja alumno correcta.");
						} else {
							System.out.println("Baja alumno incorrecta!!");
						}
					}
					break;

				case 3:
					System.out.println("Listado de Alumnos");
					System.out.println("------------------");
					for (int i=0; i<tAlumnos.length; i++) {
						if (tAlumnos[i]!=null) {
							System.out.printf("%d.- DNI: %s NOMBRE: %s EDAD: %d\n",
											i,
											tAlumnos[i].getDni(),
											tAlumnos[i].getNombre(),
											tAlumnos[i].getEdad());
						} else {
							System.out.printf("%d.- null.\n",i);
						}
					}
					
					break;
					
				case 0:
					break;
				default:
					System.out.println("Opcion incorrecta!!");
			}
		} while (op!=0);











		System.out.println("");
	}

}
