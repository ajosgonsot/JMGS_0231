#include <stdio.h>
#include <stdlib.h>

int main(){

float nota;

	do {
		printf("Introduce un numero:");
		scanf("%f.",&nota);
		
			if(nota<3){
				printf("Muy deficiente\n");
			}else if(nota>=3 && nota<5){
				printf("suspenso\n");
			}else if(nota>=5 && nota<6){
				printf(" suficiente\n");
			}else if( nota>=6 && nota<7 ){
				printf(" bien\n");
			}else if( nota>=7 && nota<9 ){
				printf(" notable\n");
			}else if( nota>=9 && nota<10 ){
				printf("sobresaliente\n");
			}else{
				printf("error");
			}
			
		} while(nota!=0);



	system("pause");
	return 0;
}