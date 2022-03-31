import java.util.Scanner;

public class T03p04e09 {

	public static void main (String[] args) {
				
		Scanner sc=new Scanner(System.in);
	
		int num1;
        int num2;
        int x=0;
        int y=0;
        int z=0;
        int w=0;
        
        System.out.println("Introduce un numero entre 1000 y 9999");
        num1=sc.nextInt();
        
        num2=num1;
               
			if(num1>999)
			{
				x=num1/1000;    
				num1-=(x*1000);
			}
       
			if(num1>99)
            {
                y=num1/100;
                num1-=(y*100);
           
            }
			if(num1>9)
            {
                z=num1/10;
                num1-=(z*10);          
           
            }
			if(num1<10)
        {
				w=num1;
           
        }
                
			if(x==z||y==w)
			{
				System.out.println("El numero "+x+y+z+w+" es capicua");
			}else
			{
				System.out.println("El numero "+x+y+z+w+" no es capicua ya que es diferente a "+y+z+w+x+"");
			}23
        
	}
}
