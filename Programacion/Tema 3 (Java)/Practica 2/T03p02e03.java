import java.util.Scanner;
import java.lang.Math;

public class T03p02e03 {	
	
  public static void main(String[] args) {
		 
    Scanner sc=new Scanner(System.in);
    
    int hor,min,seg;
    
      System.out.println("Ingresa hora");
       hor= sc.nextInt();
      System.out.println("Ingresa minuto");
       min= sc.nextInt();
      System.out.println("Ingresa segundo");
       seg= sc.nextInt();
       
      if(hor < 24 && min < 60 && seg < 60){
          if(seg < 59 && seg >= 0){
          System.out.println(hor+"hor "+min+"min "+(seg+1)+"seg");// los segundos se suman
          }else{
            if(seg==59){ //no puede haber mas de 60 segundos
                  if(min==59){//no puede haber mas de 60 minutos
                      if(hor==23){//no puede haber mas de 24h y si lo hay, hay error en la hora
                          System.out.println("00h 00m 00s");
                      }else{
                          System.out.println((hor+1)+"hor 00m 00s"); //las horas se suman
                      }
                  }else{
                      System.out.println(hor+"hor "+(min+1)+"min 00s"); //los minutos se suman
                  }
              }
          }
      }else{
          System.out.println("Fuera de Rango"); // la hora es incorrecta.
		
	}
	
}
}
