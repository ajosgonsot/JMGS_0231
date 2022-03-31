#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

int main(){


int s=0;
int m=0;
int h=0;
	
	while(1){
		
		printf("%2.2i:%2.2i:%2.2i\n%",h,m,s);
		Sleep(1000);
		system("cls");
		if(s<59){
			s++;
			}else{
				s=0;
				m++;
		}if(m<59){
			
			}else{
				m=0;
				h++;
		}if(h<23){
			
			}else{
				h=0;
		}
			
		
		}
		
	system("pause");
	return 0;

}