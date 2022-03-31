import java.util.Scanner;
public class T05p01{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Alumno a = new Alumno();
		Modulo b = new Modulo();
		Notas c = new Notas();
		
		a.setDni("123");
		a.setNombre("juan");
		a.setFecNac("20/11/2020");
		
		b.setCodigo("56321");
		b.setTitulo("YOKSE");
		b.setHorasSemanales(40);
		
		c.setDni(a.getDni());
		c.setCodigo(b.getCodigo());
		c.setNota1aEv(5);
		c.setNota2aEv(6);
		c.setNota3aEv(7);
		c.setNotaFinal(c.getNotaFinal());
		
		
		System.out.printf("Alumno: DNI: %s NOMBRE: %s Fecha_Nacimiento: %s\n"
                                    ,a.getDni()
                                    ,a.getNombre()
                                    ,a.getFecNac()
                                    );
        System.out.println();
		System.out.printf("Modulo: Codigo: %s Titulo: %s HorasSemanales: %d\n"
                                    ,b.getCodigo()
                                    ,b.getTitulo()
                                    ,b.getHorasSemanales()
                                    );
        System.out.println();
        System.out.printf("Notas: Dni: %s Codigo: %s Notas1aEv: %.2f Notas2aEv: %.2f Notas3aEv: %.2f NotasFinal: %.2f  \n"
                                    ,c.getDni()
                                    ,c.getCodigo()
                                    ,c.getNota1aEv()
                                    ,c.getNota2aEv()
                                    ,c.getNota3aEv()
                                    ,c.getNotaFinal()
                                    );                            

	}
}
