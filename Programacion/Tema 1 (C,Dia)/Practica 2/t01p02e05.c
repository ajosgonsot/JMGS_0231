#include <stdio.h>
#include <stdlib.h>

int main () {
	
	int numero;
	int contador=0;
	int maximo=0;
	int minimo=100;

	
	do {
		
		printf("Introduce un numero: ");
		scanf("%i",&numero);

		if (numero<100){
			if (numero<minimo){
				minimo=numero;
			}
			if (numero>maximo){
				maximo=numero;
			}
		}
		contador++;
	
	} while (contador<3); 
	
	printf("El numero %i es menor: \n",minimo);
	printf("El numero %i es mayor: \n",maximo);


	system("pause");
	return 0;	
}