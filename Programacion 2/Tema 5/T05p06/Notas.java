public class Notas {
	
	// Atributos
	
	private String dni;
	private int codigo;			
	private double nota1aEv;
	private double nota2aEv;
	private double nota3aEv;
	
	public static int numNotas=0;
	
	private enum CALIFICACION { SUSPENSO, APROBADO, NOTABLE, SOBRESALIENTE }
	
	// Constructor
	
	public Notas() {
		dni="";
		codigo=0;
		nota1aEv=0.0;
		nota2aEv=0.0;
		nota3aEv=0.0;
	}
	
	// Getters & Setters 
	
	public String getDni() { return dni; }
	public int getCodigo() { return codigo; }
	public double getNota1aEv() { return nota1aEv; }
	public double getNota2aEv() { return nota2aEv; }
	public double getNota3aEv() { return nota3aEv; }
	public String getNotaFinal() {
		int nota=(int)(nota1aEv+nota2aEv+nota3aEv)/3;
		if (nota>=9) return CALIFICACION.SOBRESALIENTE.toString();
		else if (nota>=7) return CALIFICACION.NOTABLE.toString();
		else if (nota>=5) return CALIFICACION.APROBADO.toString();
		else return CALIFICACION.SUSPENSO.toString();
	}
	
	public void setDni(String dni) { this.dni=dni; }
	public void setCodigo(int codigo) { this.codigo=codigo; }
	public void setNota1aEv(double nota1aEv) { this.nota1aEv=nota1aEv; }
	public void setNota2aEv(double nota2aEv) { this.nota2aEv=nota2aEv; }
	public void setNota3aEv(double nota3aEv) { this.nota3aEv=nota3aEv; }

	// Métodos
	
	public boolean existeNotas(Notas[] tNotas) {
		
		for (int i=0; i<tNotas.length; i++)
			if (tNotas[i]!=null)
				if (tNotas[i].getDni().equals(dni) && tNotas[i].getCodigo()==codigo)
					return true;
		return false;
	}
	
	public boolean altaNotas(Notas[] tNotas, Alumno[] tAlumnos, Modulo[] tModulos) {
		
		boolean existeAlumno=false;
		for (int i=0; i<tAlumnos.length; i++)
			if (tAlumnos[i]!=null)
				if (tAlumnos[i].getDni().equals(dni)) {
					existeAlumno=true;
					break;
				}

		boolean existeModulo=false;
		for (int i=0; i<tModulos.length; i++)
			if (tModulos[i]!=null)
				if (tModulos[i].getCodigo()==codigo) {
					existeModulo=true;
					break;
				}

		if (existeNotas(tNotas)) return false;

		if (existeAlumno && existeModulo) {
			tNotas[numNotas]=this;
			numNotas++;
			return true;
		}
		return false;
	}
	
	public Alumno getAlumno(Alumno[] tAlumnos) {
		for (int i=0; i<tAlumnos.length; i++)
			if (tAlumnos[i]!=null)
				if (tAlumnos[i].getDni().equals(dni))
					return tAlumnos[i];
		return null;
	}
	
	public Modulo getModulo(Modulo[] tModulos) {
		for (int i=0; i<tModulos.length; i++)
			if (tModulos[i]!=null)
				if (tModulos[i].getCodigo()==codigo)
					return tModulos[i];
		return null;
	}
}
