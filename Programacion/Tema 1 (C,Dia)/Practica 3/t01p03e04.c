#include <stdio.h>
#include <stdlib.h>

int main(){

	char opcion;
	
		do{
			printf("Introduce una letra 'a','b','c': ");
			scanf(" %c",&opcion);			
			
		}while(opcion!='a' && opcion!='b' && opcion!='c');
		
		
			switch (opcion) {
		
				case 'a':
					printf("La opcion es la %c.\n",opcion);	
					break;	
					
				case 'b':
					printf("La opcion es la %c.\n",opcion);	
					break;
					
				case 'c':
					printf("La opcion es la %c.\n",opcion);	
					break;
				default :
					printf("La opcion es otra.\n");
			}


	system("pause");
	return 0;
}