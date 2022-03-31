import java.util.Scanner;
public class T05p03{
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	
	Cliente a = new Cliente();
	Producto b = new Producto();
	Factura c = new Factura();
	
	a.setDni("31221456L");     					
	a.setNombre("Pepe");						
	a.setDomicilio("Calle San pepe");
	a.setTelefono("613523551");
								
	b.setCodigo("45137453");						
	b.setNombre("Ordneador");
	b.setPrecioUnidad(400);
		
		
	c.setId("4");
	c.setFecha("22/10/2020");
	c.setDni(a.getDni());
	c.setCantidad(2);
	c.setIva(0.21f);
	c.setTotal((b.getPrecioUnidad()*c.getCantidad())+(b.getPrecioUnidad()*c.getCantidad()*c.getIva()));

	System.out.printf("Cliente: Dni: %s Nombre: %s Domicilio: %s Telegram: %s \n"
									,a.getDni()
									,a.getNombre()
									,a.getDomicilio()
									,a.getTelefono()
									);
	System.out.println();
	System.out.printf("Producto: Codigo: %s Nombre: %s PrecioUnididad %.2f \n"
									,b.getCodigo()
									,b.getNombre()
									,b.getPrecioUnidad()
									);
	System.out.println();
	System.out.printf("Factura: Id: %s Fecha: %s Dni: %s Cantidad: %d Iva: %.2f Total: %.2f"
									,c.getId()
									,c.getFecha()
									,c.getDni()
									,c.getCantidad()
									,c.getIva()
									,c.getTotal()
									);
	}	
}
