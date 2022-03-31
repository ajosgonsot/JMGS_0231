#include <stdio.h>
#include <stdlib.h>

int main(){

	int contador=0;
	int numero;
	int numero2;
	int pares;
	

		printf("¿Cuantos numeros deesas introducir? ");
		scanf("%i",&numero);

	do{
		printf("Introduce un numero: ");
		scanf("%i",&numero2);
	
		contador++;		
		if ( numero % 2 == 0 ){
				pares++;
			}	
		
	}while(contador<numero);

	
	printf("El total de numero pares es %i: ",numero);	
	
	system("pause");
	return 0;
}