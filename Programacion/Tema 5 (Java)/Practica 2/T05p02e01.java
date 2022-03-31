import java.util.Scanner;

public class T05p02e01 {
	
	public static void main (String[] args) {


	Prestamo p=new Prestamo();
	Usuario u=new Usuario();
	Libro l=new Libro();
	
	u.setTelefono(465123789);
	u.setDni("56265147J");
	u.setNombre("Eustatikio");
	u.setDomicilio("Callepepe");
	
	p.setId("54687");
	p.setFechaD("12/2/2019");
	p.setFechaP("18/1/2019");
	p.setDni(u.getDni());
	p.setIsbn ("231576d");
	
	l.setIsbn(p.getIsbn());
	l.setFecha("05/1/2019");
	l.setTitulo("Los calcetines escurridizos ");
	l.setDescripcion("Las aventuras de unos calcetines escurridizos ");
	
	
	System.out.print("\n"+u.getTelefono());
	System.out.print("\n"+u.getDni());
	System.out.print("\n"+u.getNombre());
	System.out.print("\n"+u.getDomicilio());
	System.out.print("");
	System.out.print("\n"+p.getId());
	System.out.print("\n"+p.getFechaD());
	System.out.print("\n"+p.getFechaP());
	System.out.print("\n"+p.getDni());
	System.out.print("\n"+p.getIsbn ());
	System.out.print("");
	System.out.print("\n"+l.getIsbn());
	System.out.print("\n"+l.getFecha());
	System.out.print("\n"+l.getTitulo());
	System.out.print("\n"+l.getDescripcion());
	
	}
	
} 
	
