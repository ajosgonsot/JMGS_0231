
public class Test02_operacionesbasicas {
	
	public static void mostrar(int[] t) {
		System.out.println("");
		for (int i=0; i<t.length; i++) {
			System.out.print(t[i]+" ");
		}
		System.out.println("");
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		// Búsqueda secuencial de un elemento
		
		//~ int[] t={1,2,3,4,0};
		//~ mostrar(t);
		
		//~ int key=3;
		//~ int pos=-1;
		//~ for (int i=0; i<t.length; i++) {
			//~ if (t[i]==key) {
				//~ pos=i;
				//~ break;
			//~ }
		//~ }		
		//~ if (pos!=-1) {
			//~ System.out.println("Numero "+key+" en posicion "+pos);
		//~ } else {
			//~ System.out.println("Numero "+key+ " no existe!!");
		//~ }
		
		
		// Inserción de un elemento por posición
		
		//~ int[] t={1,2,3,4,0};
		//~ mostrar(t);
		
		//~ int key=7;
		//~ int pos=2;
		//~ for (int i=t.length-1; i>pos; i--) {
			//~ t[i]=t[i-1];
		//~ }
		//~ t[pos]=key;
		
		//~ mostrar(t);
		
		
		// Inserción de un elemento ordenado
		
		//~ int[] t={1,3,5,7,0};
		//~ mostrar(t);
		
		//~ int key=4;
		//~ int pos=-1;
		//~ do {
			//~ pos++;
		//~ } while (pos<t.length && t[pos]!=0 && t[pos]<key);
		//~ if (pos<t.length) {
			//~ for (int i=t.length-1; i>pos; i--) {
				//~ t[i]=t[i-1];
			//~ }
			//~ t[pos]=key;
		//~ }
		
		//~ mostrar(t);
		
		
		// Borrado de un elemento por posición
		
		//~ int[] t={1,2,3,4,0};
		//~ mostrar(t);
		
		//~ int pos=2;
		//~ for (int i=pos; i<t.length-1; i++) {
			//~ t[i]=t[i+1];
		//~ }
		//~ t[t.length-1]=0;
		
		//~ mostrar(t);
		
		
		// Borrado de un elemento dado
		
		//~ int[] t={1,2,3,4,0};
		//~ mostrar(t);
		
		//~ int key=3;
		//~ int pos=-1;
		//~ do {
			//~ pos++;
		//~ } while (pos<t.length && t[pos]!=key);
		//~ if (pos<t.length) {
			//~ for (int i=pos; i<t.length-1; i++) {
				//~ t[i]=t[i+1];
			//~ }
			//~ t[t.length-1]=0;
		//~ }

		//~ mostrar(t);
		
		
		// Ordenación (Selección)	
		
		//~ int[] t={4,1,3,2,5};
		//~ mostrar(t);
		
		//~ int pos;
		//~ for (int i=0; i<t.length-1; i++) {
			//~ pos=i;
			//~ for (int j=i+1; j<t.length; j++) {
				//~ if (t[j]<t[pos]) {
					//~ pos=j;
				//~ }
			//~ }
			//~ int aux=t[i];
			//~ t[i]=t[pos];
			//~ t[pos]=aux;
		//~ }

		//~ mostrar(t);
		
		
		// Ordenación (Burbuja)
		
		//~ int[] t={4,1,3,2,5};
		//~ mostrar(t);
		
		//~ for (int i=0; i<t.length-1; i++) {
			//~ for (int j=t.length-1; j>i; j--) {
				//~ if (t[j-1]>t[j]) {
					//~ int aux=t[j-1];
					//~ t[j-1]=t[j];
					//~ t[j]=aux;
				//~ }
			//~ }
		//~ }

		//~ mostrar(t);


		// Ordenación (Inserción)
		
		//~ int[] t={4,1,3,2,5};
		//~ mostrar(t);
		
		//~ for (int i=1; i<t.length; i++) {
			//~ int aux=t[i];
			//~ int j=i-1;
			//~ while (j>=0 && aux<t[j]) {
				//~ t[j+1]=t[j];
				//~ j--;
			//~ }
			//~ t[j+1]=aux;
		//~ }

		//~ mostrar(t);
		
	}
}
