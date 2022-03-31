
public class Alumno {
	
	// Atributos
	private String dni;			// PK
	private String nombre;
	private int edad;
	
	public static int numAlumno=0;
	
	// Constructor básico
	public Alumno() {
		dni="";
		nombre="";
		edad=0;
	}

	// Métodos getters&setters
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	public void setDni(String dni) {
		this.dni=dni;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	// Métodos
	
	public boolean existeAlumno(Alumno[] tAlumnos) {
		for (int i=0; i<tAlumnos.length; i++) {
			if (tAlumnos[i]!=null) {
				if (tAlumnos[i].getDni().equals(dni)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public boolean altaAlumno(Alumno[] tAlumnos) {

		if (existeAlumno(tAlumnos)) return false;
		
		tAlumnos[numAlumno++]=this;
		return true;
	}
	
	public boolean bajaAlumno(Alumno[] tAlumnos) {

		if (!existeAlumno(tAlumnos)) return false;
		
		int pos=-1;
		for (int i=0; i<tAlumnos.length; i++) {
			if (tAlumnos[i]!=null) {
				if (tAlumnos[i].getDni().equals(dni)) {
					pos=i;
					break;
				}
			}
		}
		for (int j=pos; j<tAlumnos.length-1; j++) {
			tAlumnos[j]=tAlumnos[j+1];
		}
		tAlumnos[tAlumnos.length-1]=null;
		numAlumno--;
		return true;
	}
}
