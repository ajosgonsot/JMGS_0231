import java.time.*;
import java.time.format.*;

public class Alumno {
	
	// Atributos
	
	private String dni;
	private String nombre;
	private LocalDate fecNac;
	
	public static int numAlumno=0;
		
	// Constructor
	
	public Alumno() {
		dni="";
		nombre="";
		fecNac=null;
	}
	
	// Getters & Setters
	
	public String getDni() { return dni; }
	public String getNombre() { return nombre; }
	public String getFecNac() {
		if (fecNac!=null)
			
			return fecNac.format(DateTimeFormatter.ofPattern("dd/MM/uuuu"));
		else return "";
	}
	
	public void setDni(String dni) { this.dni=dni; }
	public void setNombre(String nombre) { this.nombre=nombre; }
	public void setFecNac(String fecNac) { 
		
		this.fecNac=LocalDate.parse(fecNac,DateTimeFormatter.ofPattern("dd/MM/uuuu"));
	}
	
	// Métodos
	
	public boolean existeAlumno(Alumno[] tAlumnos) {
		
		for (int i=0; i<tAlumnos.length; i++)
			if (tAlumnos[i]!=null)
				if (tAlumnos[i].getDni().equals(dni))
					return true;
		return false;
	}
	
	public boolean altaAlumno(Alumno[] tAlumnos) {
		
		if (existeAlumno(tAlumnos)) return false;
		
		tAlumnos[numAlumno]=this;
		numAlumno++;
		return true;
	}
	
	public boolean bajaAlumno(Alumno[] tAlumnos) {
		
		if (!existeAlumno(tAlumnos)) return false;
		
		int pos=0;
		for (int i=0; i<tAlumnos.length; i++)
			if (tAlumnos[i]!=null)
				if (tAlumnos[i].getDni().equals(dni)) {
					pos=i;
					break;
				}
				
		for (int j=pos; j<tAlumnos.length-1; j++)
			tAlumnos[j]=tAlumnos[j+1];
			
		tAlumnos[tAlumnos.length-1]=null;
		numAlumno--;
		return true;
	}
	
}
