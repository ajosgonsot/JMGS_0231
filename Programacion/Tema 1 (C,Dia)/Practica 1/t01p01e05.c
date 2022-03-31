#include <stdio.h>
#include <stdlib.h>

int main () {

	char opcion;
	
	printf("Introduce una opcion: ");
	scanf("%c",&opcion);
	
	
	switch (opcion) {
	case 'a':
	printf("OpcionA \n",opcion);
	break;
	case 'b':
	printf("OpcionB \n",opcion);
	break;
	case 'c':
	printf("OpcionC \n",opcion);
	break;
	default:
	printf("Es otra opcion \n",opcion);
	break;
	}
	
	system("pause");
	return 0;	
}