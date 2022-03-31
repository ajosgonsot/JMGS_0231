import java.util.*;
public class T05p07{
	
	private static int mostrarMenu(){
		
		Scanner sc=new Scanner(System.in);
		int op;
		System.out.println("MENU");
		System.out.println("----");
		System.out.println();
		System.out.println("1.- Alta de usuario.");
		System.out.println("2.- Baja de usuario.");
		System.out.println("3.- Alta de libro.");
		System.out.println("4.- Baja de libro.");
		System.out.println("5.- Alta de prestamo.");
		System.out.println("6.- Baja de prestamo.");
		System.out.println("7.- Listado de usuarios.");
		System.out.println("8.- Listado de libros.");
		System.out.println("9.- Listado de prestamos.");
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
		Usuario[] tUsuarios=new Usuario[POS];
		Libro[] tLibros=new Libro[POS];
		Prestamo[] tPrestamos=new Prestamo[POS];
		
		do {
			System.out.println("");
			op=mostrarMenu();
			
			switch (op)	{
				
			case 1: // Alta de Usuario
				
				if (Usuario.numUsuario==POS) {
					System.out.println("Tabla Usuarios completa!!");
				} else {
					Usuario a=new Usuario();
					System.out.print("Introduce el dni del usuario: ");
					a.setDni(sc.next());
					System.out.print("Introduce el nombre del usuario: ");
					a.setNombre(sc.next());
					System.out.print("Introduce el domicilio: ");
					a.setDomicilio(sc.next());
					System.out.print("Introduce el telefono: ");
					a.setTelefono(sc.next());
					System.out.println("");
					if (a.altaUsuario(tUsuario))
						System.out.println("Alta de usuario correcta. DNI: "+a.getDni());
					else
						System.out.println("Alta de usuario incorrecta!!");
				}
				break;
		
		case 2: // Baja de Usuario
			
				if (Usuario.numUsuario==0) {
					System.out.println("Tabla Usuarios vacia!!");
				} else {
					Usuario u=new Usuario();
					System.out.print("Introduce el dni del usuario: ");
					a.setDni(sc.next());
					System.out.print("Introduce el nombre del usuario: ");
					a.setNombre(sc.next());
					System.out.print("Introduce el domicilio: ");
					a.setDomicilio(sc.next());
					System.out.print("Introduce el telefono: ");
					a.setTelefono(sc.next());
					System.out.println("");
					if (a.bajaUsuario(tUsuario))
						System.out.println("Baja de usuario correcta. DNI: "+a.getDni());
					else
						System.out.println("Baja de usuario incorrecta!!");
				}
				break;
		case 3: // Alta de libro
		
			if (Libro.numLibro==Pos){
				System.out.println("Tabla libros completa!!");
			} else {
				Libro l=new Libro();
					System.out.print("Introduce el isbn del libro: ");
					a.setIsbn(sc.next());
					System.out.print("Introduce la fecha: ");
					a.setFecha(sc.next());
					System.out.print("Introduce el titulo: ");
					a.setTitulo(sc.next());
					System.out.print("Introduce el descripcion: ");
					a.setDescripcion(sc.next());
					System.out.println("");
					if (a.bajaUsuario(tUsuario))
					if (m.altaLibro(tLibro))
						System.out.println("Alta de modulo correcta. CODIGO: "+l.getCodigo());
					else
						System.out.println("Alta de modulo incorrecta!!");
				}
				break;
		
		case 4: // Baja de libro
			
				if (Libro.numLibro==0) {
					System.out.println("Tabla libros vacia!!");
				} else {
					Libro l=new Libro();
					System.out.print("Introduce el isbn del libro: ");
					a.setIsbn(sc.next());
					System.out.print("Introduce la fecha: ");
					a.setFecha(sc.next());
					System.out.print("Introduce el titulo: ");
					a.setTitulo(sc.next());
					System.out.print("Introduce el descripcion: ");
					a.setDescripcion(sc.next());
					System.out.println("");
					if (l.bajaLibro(tLibro))
						System.out.println("Baja del libro correcta. CODIGO: "+l.getCodigo());
					else
						System.out.println("Baja del libro incorrecta!!");
				}
				break;
		case 5: // Alta de prestamo
		
				if (Prestamo.numPrestamo==Pos){
					System.out.println("Tabla prestamos completa");
				
				} else {
					Prestamo p=new Prestamo();
					System.out.print("Introduce el id del prestamo");
					p.setid(sc.nextInt());
					System.out.print("Introduce la fecha del prestamo: ");
					p.setFechaP(sc.next());
					System.out.print("Introduce el dni: ");
					p.setDni(sc.next());
					System.out.print("Introduce el isbn: ");
					p.setIsbn (sc.next());
					System.out.println("");
					if (p.altaPrestamo(tPrestamo))
						System.out.println("Alta de prestamo correcta. DNI: "+p.getCodigo());
					else
						System.out.println("Alta de usuario incorrecta!!");
					
				}
				break;
			case 6: // Baja de prestamo
		
				if (Prestamo.numPrestamo==0) {
					System.out.println("Tabla prestamos vacia!!");
				} else {
					Prestamos p=new Prestamos();
					System.out.print("Introduce el id del prestamo");
					p.setid(sc.nextInt());
					System.out.print("Introduce la fecha del prestamo: ");
					p.setFechaP(sc.next());
					System.out.print("Introduce el dni: ");
					p.setDni(sc.next());
					System.out.print("Introduce el isbn: ");
					p.setIsbn (sc.next());
					System.out.println("");
					if (p.bajaPrestamo(tPrestamo))
						System.out.println("Baja de prestamos correcta. DNI: "+p.getCodigo());
					else
						System.out.println("Baja de prestamos incorrecta!!");
				}
				break;
		}
	
}
