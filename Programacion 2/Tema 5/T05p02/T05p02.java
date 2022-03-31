import java.util.Scanner;
public class T05p02{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		Usuario a = new Usuario();
		Libro b = new Libro();
		Prestamo c = new Prestamo();
			
		a.setDni("54532123L");     					
		a.setNombre("juan");						
		a.setDomicilio("Calle San Juan");
		a.setTelefono("652325412");		
								
		b.setIsbn("4655213214564");						
		b.setFecha("20/11/2020");
		b.setTitulo("Un libro");
		b.setDescripcion("Esto es la descripcion del libro");
		
		
		c.setId("4");
		c.setFechaPrestamo("23/10/2020");
		c.setFechaDevolucion("27/10/2020");
		c.setDni(a.getDni());
		c.setIsbn(b.getIsbn());
		
		
		System.out.printf("Usuario: DNI: %s Nombre: %s Domicilio: %s Telefono: %s \n"
                                    ,a.getDni()
                                    ,a.getNombre()
                                    ,a.getDomicilio()
                                    ,a.getTelefono()
                                    );
        System.out.println();
		System.out.printf("Libro: Isbn: %s Fecha: %s Titulo: %s Descripcion: %s \n"
                                    ,b.getIsbn()
                                    ,b.getFecha()
                                    ,b.getTitulo()
                                    ,b.getDescripcion()
                                    );
        System.out.println();
        System.out.printf("Prestamo: Id: %s FechaPrestamo: %s FechaDevolucion: %s Dni: %s Isbn: %s \n"
                                    ,c.getId()
                                    ,c.getFechaPrestamo()
                                    ,c.getFechaDevolucion()
                                    ,c.getDni()
                                    ,c.getIsbn()
                                    );                            

	}
}
