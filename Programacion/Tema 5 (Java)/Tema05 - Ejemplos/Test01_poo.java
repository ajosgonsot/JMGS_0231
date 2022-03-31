import java.util.Scanner;

public class Test01_poo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		
		Cliente c=new Cliente();
		System.out.print("Introduzca el dni del cliente: ");
		c.setDNI(sc.next());
		System.out.print("Introduzca el nombre del cliente: ");
		c.setNombre(sc.next());
		
		Producto p=new Producto();
		System.out.print("Introduzca el codigo del producto: ");
		p.setCodigo(sc.nextInt());
		System.out.print("Introduzca el nombre del producto: ");
		p.setNombre(sc.next());
		System.out.print("Introduzca la precio del producto: ");
		p.setPrecio(sc.nextDouble());
		
		Factura f=new Factura();
		System.out.print("Introduzca el id de la factura: ");
		f.setId(sc.next());
		System.out.print("Introduzca la fecha de la factura: ");
		f.setFecha(sc.next());
		System.out.print("Introduzca la cantidad del producto: ");
		f.setCantidad(sc.nextInt());
		f.setDNICliente(c.getDNI());
		f.setCodigoProducto(p.getCodigo());
		f.setTotal(f.getCantidad()*p.getPrecio());
		
		System.out.println("");
		System.out.printf("FACTURA:\t %s %s\n",f.getId(),f.getFecha());
		System.out.printf("CLIENTE:\t %s %s\n",f.getDNICliente(),c.getNombre());
		System.out.printf("PRODUCTO:\t %d %s %d %.2f euros\n",
					f.getCodigoProducto(),p.getNombre(),f.getCantidad(),p.getPrecio());
		System.out.printf("TOTAL:\t\t %.2f euros\n",f.getTotal());
		System.out.println("");
	}
}
