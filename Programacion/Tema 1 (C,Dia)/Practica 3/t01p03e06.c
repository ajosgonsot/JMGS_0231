#include <stdio.h>
#include <stdlib.h>

int main(){


	int contador=0;
	int maximo=0;
	int minimo=999999;
	int numero;
	int contador_numero=0;

		printf("¿Cuantos numeros deesas introducir?");
		scanf("%i",&numero);
		
		do{
		printf("Introduce lo siguientes numeros:");
		scanf("%i",&contador_numero);
		contador++;	
			
			if(contador_numero<minimo){
				minimo=contador_numero;
			}
				
			if(contador_numero>maximo){
				maximo=contador_numero;

			}
				
		
		}while(contador<numero);

		printf("El numero %i es el minimo:\n",minimo);	
		printf("El numero %i es el maximo:\n",maximo);	



	system("pause");
	return 0;
}