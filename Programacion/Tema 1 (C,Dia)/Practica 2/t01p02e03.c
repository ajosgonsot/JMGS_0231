#include<stdio.h>
#include<stdlib.h>

int main() {
	
	char letra;
	int contador=0;
	
		
		printf("Introduce caracteres: ");
		scanf("%c", &letra);
	
		
		while(contador<5) {
		
		printf("introduce un caracter de nuevo: ");
		scanf(" %c",&letra);
		
		contador=contador+1;
		
	}
	
	system("pause");
	return 0;
	
}