import java.util.Scanner;
public class T04p03e01;

		public static void mostrar(int[] t) {
		System.out.println("");
		for (int i=0; i<t.length; i++) {
			System.out.print(t[i]+" ");
		}
		System.out.println("");
		System.out.println("");
	}

		int[] t={1,2,3,4,0};
		mostrar(t);
		
		int key=3;
		int pos=-1;
		for (int i=0; i<t.length; i++) {
			if (t[i]==key) {
				pos=i;
				break;
			}
		}		
		if (pos!=-1) {
			System.out.println("Numero "+key+" en posicion "+pos);
		} else {
			System.out.println("Numero "+key+ " no existe!!");
		 }
}
