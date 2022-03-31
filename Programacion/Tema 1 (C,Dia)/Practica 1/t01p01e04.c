#include <stdio.h>
#include <stdlib.h>

int main () {

	int num1;
	
	
	printf("Introduce un numero: ");
	scanf("%i",&num1);
	
	
	if(num1%2==0) {
		
	printf("Es un numero par: %i\n",num1);

		
	} else {
		
	printf ("Es un numero impar: %i\n",num1);	
		
		
	}
	
	
	system("pause");
	return 0;	
}