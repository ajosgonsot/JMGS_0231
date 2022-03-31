import java.time.*;
import java.time.format.*;

public class Usuario {
	
	// Atributos
	
	private String dni;
	private String nombre;
	private String domicilio;
	private LocalDate telofono;
	
	public static int numUsuario=0;
		
	// Constructor
	
	public Usuario() {
		dni="";
		nombre="";
		domicilio="";
		telefono="";
	}
	
	// Getters & Setters
	
	public String getDni() { return dni; }
	public String getNombre() { return nombre; }
	public String getDomicilio() { return domicilio; }
	public String getTelefono() { return descripcion; }
		else return "";
	}
	
	public void setDni(String dni) { this.dni=dni; }
	public void setNombre(String nombre) { this.nombre=nombre; }
	public void setDomicilio(String domicilio) { this.domicilio=domicilio; }
	public void setTelefono(String telefono) { this.telefono=telefono; }
	}
	
	// Métodos
	
	public boolean existeUsuario(Usuario[] tUsuarios) {
		
		for (int i=0; i<tUsuarios.length; i++)
			if (tUsuarios[i]!=null)
				if (tUsuarios[i].getDni().equals(dni))
					return true;
		return false;
	}
	
	public boolean altaUsuario(Usuario[] tUsuarios) {
		
		if (existeUsuario(tUsuarios)) return false;
		
		tUsuarios[numUsuario]=this;
		numUsuario++;
		return true;
	}
	
	public boolean bajaUsuario(Usuario[] tUsuarios) {
		
		if (!existeUsuario(tUsuarios)) return false;
		
		int pos=0;
		for (int i=0; i<tUsuarios.length; i++)
			if (tUsuarios[i]!=null)
				if (tUsuarios[i].getDni().equals(dni)) {
					pos=i;
					break;
				}
				
		for (int j=pos; j<tUsuarios.length-1; j++)
			tUsuarios[j]=tUsuarios[j+1];

		numUsuario--;
		return true;
	}
	
}
