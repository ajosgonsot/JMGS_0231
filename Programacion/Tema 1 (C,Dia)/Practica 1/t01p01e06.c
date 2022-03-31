#include <stdio.h>
#include <stdlib.h>

int main () {


	int num1;
	
	
	printf("Introducir numero: ");
	scanf("%i",&num1);

	if(num1>100) {
		
	if(num1%5==0)

	printf("%i Es multiplo de 5 \n",num1);	
	
	else
	
	printf("%i No es multiplo de 5 \n",num1);

	} else {
	
	if(num1%2==0)

	printf("%i Es multiplo de 2 \n",num1);	
	
	else
	
	printf("%i No es multiplo de 2 \n",num1);
	
		
	}
	


	
	system("pause");
	return 0;	
}