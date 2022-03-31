#include <stdio.h>
#include <stdlib.h>

int main(){

	const float pi=3.1415;
	int h=0;
	int r=0;
	int v;
	int a;
	char opcion;
		do{
			printf("introduce la radio:");
			scanf("%i",&r);
			printf("introduce la area:");
			scanf("%i",&h);
			
			a=(2*pi*r*(r+h));
			v=(pi*r*r*h);
			
			printf("Los resultados de la area son %i:\n",a);
			printf("Los resultados del volumen son %i:\n",v);
			
			printf("Si pones una s se cierra el programa:");
			scanf(" %c",&opcion);

		}while(opcion != 's');
		
		

	system("pause");
	return 0;
}