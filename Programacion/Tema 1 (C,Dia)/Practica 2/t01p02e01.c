#include <stdio.h>
#include <stdlib.h>

int main(){

	int	x;
	
	printf("Introduce un numero:");
	scanf("%i",&x);
	
	while(x<10) {
	
	printf("Introduce otro numero numero:\n");
	printf("El numero %i es menor a 10.\n:",x);
	scanf("%i",&x);

	}


	system("pause");
	return 0;	
}