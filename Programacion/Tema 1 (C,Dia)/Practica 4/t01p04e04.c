#include <stdio.h>
#include <stdlib.h>

int main(){

	int numero1;	
	int numero2;
	char elegir;
	int suma;
	int multi;
	int resta;
	float division;
	char letra;	
	
	
		do {
			do{
				printf("Introduce una letra 'a'=suma, 'b'=resta ,'c'=multiplicacion, 'd'=division:");
				scanf(" %c",&elegir);
				printf("Introduce una numero: ");
				scanf("%i",&numero1);
				printf("Introduce una numero: ");
				scanf("%i",&numero2);
				
				switch (elegir) {
				case 'a':
					suma=numero1+numero2;
					printf("La suma es %i:\n",suma);
					break;	
				case 'b':
					resta=numero1-numero2;
					printf("La rsta es %i :\n",resta);	
					break;
				case 'c':
					multi=numero1*numero2;
					printf("La multiplicacion es %i :\n",multi);	
					break;
				case 'd':
					division=numero1/numero2;
					printf("La  division es %f :\n",division);	
					break;
				}


			}while(elegir!='a' && elegir!='b' && elegir!='c'&& elegir!='d');
		
			printf("Desea continuar? (s)i (n)o \n");
			scanf(" %c",&letra);
		
			
		}while(letra=='s');
		

	system("pause");
	return 0;
}