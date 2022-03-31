public class Modulo {
	
	// Atributos
	
	private int codigo;
	private String titulo;
	private int horasSemanales;
	
	public static int numModulo=0;
 		
	// Constructor 
	
	public Modulo()	{
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
	
	public boolean existeModulo(Modulo[] tModulos) {
		
		for (int i=0; i<tModulos.length; i++)
			if (tModulos[i]!=null)
				if (tModulos[i].getCodigo()==codigo)
					return true;
		return false;
	}
	
	public boolean altaModulo(Modulo[] tModulos) {
		
		if (existeModulo(tModulos)) return false;
		
		tModulos[numModulo]=this;
		numModulo++;
		return true;
	}
	
	public boolean bajaModulo(Modulo[] tModulos) {
		
		if (!existeModulo(tModulos)) return false;
		
		int pos=0;
		for (int i=0; i<tModulos.length; i++)
			if (tModulos[i]!=null)
				if (tModulos[i].getCodigo()==codigo) {
					pos=i;
					break;
				}
				
		for (int j=pos; j<tModulos.length-1; j++)
			tModulos[j]=tModulos[j+1];
			
		tModulos[tModulos.length-1]=null;
		numModulo--;
		return true;
	}
	
}
