#include <stdio.h>
#include <stdlib.h>

int main(){

	
	int numero;
	int contador=0;
	int numero1;
	int suma=0;
	int multi=1;

		
		printf("Introduce los numeros que quieras:");
		scanf("%i",&numero);
		
			do{
		
				printf("Introduce los numeros:");
				scanf("%i",&numero1);
				contador++;
				
				if(numero1 % 2 == 0){
				
					suma=(suma+numero1);
				
				}
 
				else{
					
					multi=(multi*numero1);

				}
		
			
			
			}while(contador<numero);

			printf("La suma de los numeros pares es %i:\n",suma);
			printf("La multiplicacion  de los numeros impares es %i:\n",multi);



	system("pause");
	return 0;
}