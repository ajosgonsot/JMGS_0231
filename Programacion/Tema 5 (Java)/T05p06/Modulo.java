
public class Modulo {
	
	/* Atributos ******************************************************/
	
	private int codigo;			// PK
	private String titulo;
	private int horasSemanales;
	
	public static int numModulo=0;
 		
	/* Constructor ****************************************************/
	
	public Modulo()	{
		codigo=0;
		titulo="";
		horasSemanales=0;
	}
	
	/* Métodos getters & setters **************************************/
	
	public int getCodigo() { return codigo; }
	public String getTitulo() { return titulo; }
	public int getHorasSemanales() { return horasSemanales; }
	
	public void setCodigo(int codigo) { this.codigo=codigo; }
	public void setTitulo(String titulo) { this.titulo=titulo; }
	public void setHorasSemanales(int horasSemanales) { this.horasSemanales=horasSemanales; }

	/* Métodos ********************************************************/
	
	public boolean existeModulo(Modulo[] tModulos) {
		
		// Comprobamos si el Módulo existe
		for (int i=0; i<tModulos.length; i++)
			if (tModulos[i]!=null)
				if (tModulos[i].getCodigo()==codigo)
					return true;
		return false;
	}
	
	public boolean altaModulo(Modulo[] tModulos) {
		
		// Comprobamos si el Módulo existe ya
		if (existeModulo(tModulos)) return false;
		
		// Insertamos el nuevo módulo
		tModulos[numModulo]=this;
		numModulo++;
		return true;
	}
	
	public boolean bajaModulo(Modulo[] tModulos) {
		
		// Comprobamos que el Módulo existe ya
		if (!existeModulo(tModulos)) return false;
		
		// Buscamos su posición
		int pos=0;
		for (int i=0; i<tModulos.length; i++)
			if (tModulos[i]!=null)
				if (tModulos[i].getCodigo()==codigo) {
					pos=i;
					break;
				}
				
		// Eliminamos el elemento y desplazamos el resto hacia atrás
		for (int j=pos; j<tModulos.length-1; j++)
			tModulos[j]=tModulos[j+1];
			
		tModulos[tModulos.length-1]=null; // Si la tabla estaba llena el último elemento estaría duplicado
		numModulo--;
		return true;
	}
	
}
