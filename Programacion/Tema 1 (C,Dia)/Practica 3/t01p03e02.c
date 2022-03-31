#include <stdio.h>
#include <stdlib.h>

int main(){

	int contador=0;
	float numero;
	float numero2;
	float suma=0;
	float media;	

		printf("¿Cuantos numeros deesas introducir?");
		scanf("%f",&numero);

	do{
		printf("Introduce un numero:");
		scanf("%f",&numero2);
	
		contador++;		
		suma=suma+numero2;		
		
	}while(contador<numero);

	media=suma/numero;
	printf("la media es %f:",media);	
	
	system("pause");
	return 0;
}