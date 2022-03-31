import java.util.Scanner;
public class T05p03{

	public static void main(String[] args){
	Scanner sc = new Scanner (System.in);

	Cliente c=new Cliente();
	
		c.setDni("65423217A");
		c.setNombre("Juan Ramon Ecija Sanchez");
		c.setDomicilio("C/ SanJuan nº7");
		c.setTelefono("652475265");
	
	Producto p=new Producto();
	
		p.setCodigo(40);
		p.setNombre("Nissan junke");
		p.setPrecioUnidad(10000);
	
	
	Factura f=new Factura();
	
		f.setId(20);
		f.setFecha("05/10/2012");
		f.setDni(c.getDni());
		f.setCodigoProducto(p.getCodigo());
		f.setCantidad(1);
		f.setIva(0.21);
		f.setTotalSin(p.getPrecioUnidad() * f.getCantidad());
		f.setIvaPrecio(f.getTotalSin() * f.getIva());
		f.setTotalCon(f.getTotalSin() + f.getIvaPrecio());

	
		System.out.println("");
		System.out.println("Cliente");
		System.out.println("----");
		System.out.printf("El Dni del Ciente es el: %s\n",c.getDni());
		System.out.printf("El Nombre del Ciente es el: %s\n",c.getNombre());
		System.out.printf("El Domicilio del Ciente es el: %s\n",c.getDomicilio());
		System.out.printf("El Telefono del Ciente es el: %s\n",c.getTelefono());
		System.out.println("");
		System.out.println("Producto");
		System.out.println("----");
		System.out.printf("El Codigo del Producto es el: %d\n",p.getCodigo());
		System.out.printf("El Nombre del Producto es el: %s\n",p.getNombre());
		System.out.printf("El Precio/Unidad del Producto es el: %.1f euros\n",p.getPrecioUnidad());
		System.out.println("");
		System.out.println("Factura");
		System.out.println("----");
		System.out.println("----");
		System.out.printf("El ID de la Factura es el: %d\n",f.getId());
		System.out.printf("El Fecha de la Factura es la: %s\n",f.getFecha());
		System.out.printf("El DNI del Cliente/Factura es el: %s\n",f.getDni());
		System.out.printf("El Codigo del Producto/Factura es el: %s\n",f.getCodigoProducto());
		System.out.printf("La Cantidad de Productos/Factura son: %d\n",f.getCantidad());
		System.out.printf("El IVA correspodiente es el: %.2f\n",f.getIva());
		System.out.printf("El TOTAL SIN IVA es: %.2f euros\n",f.getTotalSin());
		System.out.printf("El TOTAL CON IVA es: %.2f euros\n",f.getTotalCon());
	
	
	}
}
