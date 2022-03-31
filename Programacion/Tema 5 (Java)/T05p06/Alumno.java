import java.time.*;
import java.time.format.*;

public class Alumno {
	
	/* Atributos ******************************************************/
	
	private String dni;			// PK
	private String nombre;
	private LocalDate fecNac;
	
	public static int numAlumno=0;
		
	/* Constructor ****************************************************/
	
	public Alumno() {
		dni="";
		nombre="";
		fecNac=null;
	}
	
	/* Métodos getters & setters **************************************/
	
	public String getDni() { return dni; }
	public String getNombre() { return nombre; }
	public String getFecNac() {
		if (fecNac!=null)
			// Opcion1
			return fecNac.format(DateTimeFormatter.ofPattern("dd/MM/uuuu"));
			// Opcion2
			//return String.format("%02d/%02d/%04d",fecNac.getDayOfMonth(),fecNac.getMonthValue(),fecNac.getYear());
		else return "";
	}
	
	public void setDni(String dni) { this.dni=dni; }
	public void setNombre(String nombre) { this.nombre=nombre; }
	public void setFecNac(String fecNac) { 
		// Opcion1
		this.fecNac=LocalDate.of(Integer.parseInt(fecNac.substring(6,10)),
								Integer.parseInt(fecNac.substring(3,5)),
								Integer.parseInt(fecNac.substring(0,2)));
		// Opcion2
		//this.fecNac=LocalDate.parse(fecNac,DateTimeFormatter.ofPattern("dd/MM/uuuu"));
	}
	
	/* Métodos ********************************************************/
	
	public boolean existeAlumno(Alumno[] tAlumnos) {
		
		// Comprobamos si el Alumno existe
		for (int i=0; i<tAlumnos.length; i++)
			if (tAlumnos[i]!=null)
				if (tAlumnos[i].getDni().equals(dni))
					return true;
		return false;
	}
	
	public boolean altaAlumno(Alumno[] tAlumnos) {
		
		// Comprobamos si el Alumno existe ya
		if (existeAlumno(tAlumnos)) return false;
		
		// Insertamos el nuevo Alumno
		tAlumnos[numAlumno]=this;
		numAlumno++;
		return true;
	}
	
	public boolean bajaAlumno(Alumno[] tAlumnos) {
		
		// Comprobamos que el Alumno existe ya
		if (!existeAlumno(tAlumnos)) return false;
		
		// Buscamos su posición
		int pos=0;
		for (int i=0; i<tAlumnos.length; i++)
			if (tAlumnos[i]!=null)
				if (tAlumnos[i].getDni().equals(dni)) {
					pos=i;
					break;
				}
				
		// Eliminamos el elemento y desplazamos el resto hacia atrás
		for (int j=pos; j<tAlumnos.length-1; j++)
			tAlumnos[j]=tAlumnos[j+1];
			
		tAlumnos[tAlumnos.length-1]=null; // Si la tabla estaba llena el último elemento estaría duplicado
		numAlumno--;
		return true;
	}
	
}
