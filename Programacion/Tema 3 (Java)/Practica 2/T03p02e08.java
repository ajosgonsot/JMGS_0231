import java.util.Scanner;
import java.lang.Math;

public class T03p02e08 {	
	
  public static void main(String[] args) {
		 
    Scanner sc=new Scanner(System.in);
    float numero;
    float codigo;
    float cantidad;
    float precio;
    float contador=0F;
    float importefactura=0;
    float sumalitros=1;
    float litroscod=0F;
   
	do{
		System.out.print("Fecha Num. ");
		numero=sc.nextFloat();
		System.out.print("Codigo de producto.: ");
		codigo=sc.nextFloat();
		System.out.print("Cantidad(litros): ");
		cantidad=sc.nextFloat();
		System.out.print("Precio(litros): ");
		precio=sc.nextFloat();
		
		sumalitros=cantidad*precio;
		
	
		importefactura=importefactura+sumalitros;
	
		System.out.println(""+sumalitros);
		
		
		 if (codigo == 1)
			litroscod=cantidad;
			
		if(importefactura >= 600)
			contador++;
			
	}while(numero<3);

		System.out.println("Resumen de ventas\n");

		System.out.println("La facturación total es de: " +importefactura + "€");

		System.out.println("Ventas del producto 1: " + litroscod + " litros");

		System.out.println("Factura superior a 600€: " + contador);



		}
}
