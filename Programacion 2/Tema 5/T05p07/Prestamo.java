public class Prestamo {
	
	// Atributos
	
	private int codigo;
	private String titulo;
	private int horasSemanales;
	
	public static int numPrestamo=0;
 		
	// Constructor 
	
	public Prestamo()	{
		codigo=0;
		titulo="";
		horasSemanales=0;
	}
	
	// Getters & Setters 
	
	public int getCodigo() { return codigo; }
	public String getTitulo() { return titulo; }
	public int getHorasSemanales() { return horasSemanales; }
	
	public void setCodigo(int codigo) { this.codigo=codigo; }
	public void setTitulo(String titulo) { this.titulo=titulo; }
	public void setHorasSemanales(int horasSemanales) { this.horasSemanales=horasSemanales; }

	// Métodos
	
	public boolean existePrestamo(Prestamo[] tPrestamos) {
		
		for (int i=0; i<tPrestamos.length; i++)
			if (tPrestamos[i]!=null)
				if (tPrestamos[i].getCodigo()==codigo)
					return true;
		return false;
	}
	
	public boolean altaPrestamo(Prestamo[] tPrestamos) {
		
		if (existePrestamo(tPrestamos)) return false;
		
		tPrestamos[numPrestamo]=this;
		numPrestamo++;
		return true;
	}
	
	public boolean bajaPrestamo(Prestamo[] tPrestamos) {
		
		if (!existePrestamo(tPrestamos)) return false;
		
		int pos=0;
		for (int i=0; i<tPrestamos.length; i++)
			if (tPrestamos[i]!=null)
				if (tPrestamos[i].getCodigo()==codigo) {
					pos=i;
					break;
				}
				
		for (int j=pos; j<tPrestamos.length-1; j++)
			tPrestamos[j]=tPrestamos[j+1];
			
		tPrestamos[tPrestamos.length-1]=null;
		numPrestamo--;
		return true;
	}
	
}
