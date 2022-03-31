
public class Test10_composicion {
	
	public static void main(String[] args) {
		
		System.out.println("");
			
		/* COMPOSICIÓN */
		
		/* La composición es el agrupamiento de uno o varios objetos y valores,
		 * como atributos, que conforman el valor de los distintos objetos de una clase.
		 * Normalmente los atributos contenidos se declaran con acceso privado y se
		 * inicializan en el constructor de la nueva clase.
		 * La composición crea una relación "tiene", que puede ser una relación 1 a 1 si
		 * sólo se define un objeto como atributo o, una relación 1 a muchos si se define
		 * una colección de objetos como atributos.
		 * */


		/* EJEMPLO SIN COMPOSICIÓN */
		
		//~ Expediente1[] listaE=new Expediente1[10];
		//~ Alumno[] listaA=new Alumno[10];
		
		//~ Alumno a=new Alumno();
		//~ a.setDni("1");
		//~ a.setNombre("pepe");
		//~ listaA[0]=a;
		
		//~ Expediente1 e1=new Expediente1();
		//~ e1.setCodigo("1");
		//~ e1.setDni("1");
		//~ listaE[0]=e1;
		
		//~ for (int i=0; i<listaE.length; i++)
			//~ if (listaE[i]!=null)
				//~ System.out.printf("Codigo: %s DNI: %s Nombre: %s\n",
									//~ listaE[i].getCodigo(),
									//~ listaE[i].getDni(),
									//~ listaE[i].getAlumno(listaA).getNombre());
		
		
		/* EJEMPLO CON COMPOSICIÓN (1 a 1) */
		
		//~ Expediente2[] listaE=new Expediente2[10];
		//~ Alumno[] listaA=new Alumno[10];
		
		//~ Alumno a=new Alumno();
		//~ a.setDni("1");
		//~ a.setNombre("pepe");
		//~ listaA[0]=a;
		
		//~ Expediente2 e2=new Expediente2();
		//~ e2.setCodigo("1");
		//~ e2.setAlumno(a);
		//~ listaE[0]=e2;
		
		//~ for (int i=0; i<listaE.length; i++)
			//~ if (listaE[i]!=null)
				//~ System.out.printf("Codigo: %s DNI: %s Nombre: %s\n",
									//~ listaE[i].getCodigo(),
									//~ listaE[i].getAlumno().getDni(),
									//~ listaE[i].getAlumno().getNombre());
		
		
		/* EJEMPLO CON COMPOSICIÓN (1 a n) */
		
		Expediente3[] listaE=new Expediente3[10];
		
		Alumno a=new Alumno();
		a.setDni("1");
		a.setNombre("pepe");
		
		Expediente3 e3=new Expediente3();
		e3.setCodigo("1");
		e3.setAlumno(a);
		listaE[0]=e3;
		
		for (int i=0; i<listaE.length; i++)
			if (listaE[i]!=null)
				for (int j=0; j<listaE[i].getAlumnos().length; j++)
					if (listaE[i].getAlumnos()[j]!=null)
						System.out.printf("Codigo: %s DNI: %s Nombre: %s\n",
											listaE[i].getCodigo(),
											listaE[i].getAlumnos()[j].getDni(),
											listaE[i].getAlumnos()[j].getNombre());
																	
		System.out.println("");
	}
}

/*public*/ class Expediente1 {
	
    private String codigo;
    private String dni; /* Alumno */

    public Expediente1() {
        codigo="";
        dni="";
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo=codigo; }
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni=dni; }
    
	public Alumno getAlumno(Alumno[] t) {
        for (int i=0; i<t.length; i++)
            if (t[i]!=null)
				if (t[i].getDni().equals(this.dni))
					return t[i];
        return null;
    }
}

/*public*/ class Expediente2 {
	
    private String codigo;
    private Alumno alumno;

    public Expediente2() {
        codigo="";
        alumno=new Alumno(); /* Esto podría cambiar si, por ejemplo,
								utilizamos un constructor sobrecargado,
								lo que afectaría tb al método setAlumno */
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo=codigo; }
    public Alumno getAlumno() { return alumno; }
    public void setAlumno(Alumno a) { this.alumno=a; }
}

/*public*/ class Expediente3 {
	
    private String codigo;
    private Alumno[] alumnos;
    private int numAlumno;		/* Indice para conocer la posición en el
									array donde hay que insertar un nuevo
									alumno. OJO no es static en este caso. */

    public Expediente3() {
        codigo="";
        alumnos=new Alumno[10]; /* Esto podría cambiar si, por ejemplo,
								utilizamos un constructor sobrecargado,
								lo que afectaría tb al método setAlumno */
		numAlumno=0;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo=codigo; }
    public Alumno[] getAlumnos() { return alumnos; }
    public void setAlumno(Alumno a) { this.alumnos[numAlumno++]=a; }
}

/*public*/ class Alumno {
	
    private String dni;
    private String nombre;

    public Alumno() {
        dni="";
        nombre="";
    }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni=dni; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre=nombre; }
}
