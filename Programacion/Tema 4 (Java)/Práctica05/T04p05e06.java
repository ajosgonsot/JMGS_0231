import java.util.Scanner;

public class T04p05e06{
	
	enum MESES {ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int num=-1;
		System.out.print("\nIntroduce un numero de mes 1..12 (0:Salir): ");
		num=sc.nextInt();
		while(num!=0){
			
			num--;
			if(MESES.values()[num]==MESES.ENERO || MESES.values()[num].name()=="MARZO" || MESES.values()[num].name()=="MAYO" || MESES.values()[num].name()=="JULIO" || MESES.values()[num].name()=="AGOSTO" || MESES.values()[num].name()=="OCTUBRE" || MESES.values()[num].name()=="DICIEMBRE"){
				System.out.printf("El mes %s tiene 31 d\u00edas\n",MESES.values()[num]);
			}else if(MESES.values()[num].name()=="ABRIL" || MESES.values()[num].name()=="JUNIO" || MESES.values()[num].name()=="SEPTIEMBRE" || MESES.values()[num].name()=="NOVIEMBRE"){
				System.out.printf("El mes %s tiene 30 d\u00edas\n",MESES.values()[num]);
			}else{
				System.out.printf("El mes %s tiene 28 o 29 d\u00edas\n",MESES.values()[num]);
			}
			num++;
			System.out.print("\nIntroduce un numero de mes 1..12 (0:Salir): ");
			num=sc.nextInt();
		}
	}
}
