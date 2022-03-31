#include <stdio.h>
#include <stdlib.h>

int main () {
	
	int numero;
	int contador=2;
	int num_divisores=2;

	
	
	do {
	
		printf("Introduce un numero:");
		scanf("%i",&numero);
		contador = 1;
		num_divisores=0; 
		do{
			if(numero%contador==0){
				num_divisores++;	//te divide los divisores  numero hasta el numero introducido	contador = 1;num_divisores=2;		
			}						
			contador++;
		}while(contador<=numero); //
			
		
		if( num_divisores==2)
			printf("El %i es primo\n",numero);
		else{
			printf("El %i no es primo\n", numero);
		}

	} while(numero != 0);
		
		

	system("pause");
	return 0;	
}