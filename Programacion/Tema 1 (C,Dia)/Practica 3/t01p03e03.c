#include <stdio.h>
#include <stdlib.h>

int main(){


	int numero;
	int numero1;
	
			
	
		do{
			printf("introduce uno numero:");		
			scanf("%i",&numero1);
			printf("introduce otro numero:");		
			scanf("%i",&numero);

		
			
			if (numero>numero1){
				printf("El %i es mayor que %i\n",numero,numero1);
			}
			if (numero1>numero){
				printf("El %i es mayor que %i\n",numero1,numero);
			}
			else{
				printf("El %i dos son iguales %i\n",numero1,numero);
			}
			
		}
		while(numero!=numero1);
		



	system("pause");
	return 0;
}