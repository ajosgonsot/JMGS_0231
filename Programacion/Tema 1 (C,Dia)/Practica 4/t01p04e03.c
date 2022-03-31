#include <stdio.h>
#include <stdlib.h>

int main(){


	int y;
	
	printf("introduce el years:");
	scanf("%i",&y);

	if (y %4 ==0){
		printf("El año  es bisiesto $i:",y);
	} else if (y %100 ==0){
		printf("El año 100 es bisiesto de $i:",y);
	} else if (y %400 ==0){	
		printf("El año 400 es bisiesto de $i:",y);
	} else{
		printf("El año no es bisiesto $i:",y);
	}	




	system("pause");
	return 0;
}