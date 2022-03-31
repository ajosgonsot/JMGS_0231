import java.util.Scanner;
public class T03p02e08{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			int cod_Art;
			int vent_Litro;
			double precioLitros;
			double subtotal;
			double total = 0;
			
			int contFact =0;
			int contFact1 =0;
			int contSuper =0;
			
			
			
			for(int i = 0; i<3; i++){
				contFact++;
				System.out.printf("Factura Num %d\n",contFact);
				
				System.out.print("Codigo del Producto: ");
				cod_Art=sc.nextInt();
				System.out.print("Cantidad(litros): ");
				vent_Litro=sc.nextInt();
				System.out.print("Precio(litros): ");
				precioLitros=sc.nextDouble();
				
				subtotal = vent_Litro *precioLitros;
				total = total +vent_Litro *precioLitros;
				
				if(cod_Art == 1){
					contFact1= contFact1 +vent_Litro;
				}
				if(subtotal >600){
					contSuper++;
				}
				subtotal = 0;
				
			}
			
			System.out.println("");
			System.out.println("Resumen de ventas");
			System.out.printf("La factura total es: %.2f",total);
			System.out.printf("\nVentas del producto codigo 1: %d",contFact1);
			System.out.printf("\nFacturas superiores a 600 euros: %d",contSuper);
			
			
			
			
	}
}
