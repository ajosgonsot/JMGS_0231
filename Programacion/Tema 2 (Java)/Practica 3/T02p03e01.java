public class T02p03e01 {

	public static void main(String[] args) {
		
		int num1=1;
		int num2=2;
		int num3=3;
		int mayor;
		int menor;
		
		
		mayor = (num1>num2 && num1>num3)?num1:(num2>num1 && num2>num3)?num2:num3;
		
		menor = (num1<num2 && num1<num3)?num1:(num2<num1 && num2<num3)?num2:num3;
		
		
		
		System.out.printf("El valor mayor es: %d y el menor es: %d",mayor,menor);
		
		
		
	}
	
	
}
