#include <stdio.h>
#include <stdlib.h>

int main () {

	int num1;
	int cuadrado;
	
	printf("Introduce un numero: ");
	scanf("%i",&num1);
	
	if (num1>0) {
		
		printf("%i Es positivo \n",num1);
		cuadrado=num1*num1;
		printf("El resultado es %i \n",cuadrado);
			
	} else {
		
		cuadrado=num1*num1;
		printf("El resultado es %i \n",cuadrado);
		
		
	}
	
	
	
	
	
	
	
	system("pause");
	return 0;	
}