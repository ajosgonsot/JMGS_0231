public class Notas{

	private String dni;
	private String codigo;
	private float nota1aEv;
	private float nota2aEv;
	private float nota3aEv;
	private float notaFinal;
	
	public Notas(){
	
		dni="";
		codigo="";
		nota1aEv=0.0f;
		nota2aEv=0.0f;
		nota3aEv=0.0f;
		notaFinal=0.0f;
		
	}
	public String getDni(){
		return dni;	
	}
	public String getCodigo(){
		return codigo;	
	}
	public float getNota1aEv(){
		return nota1aEv;	
	}
	public float getNota2aEv(){
		return nota2aEv;	
	}
	public float getNota3aEv(){
		return nota3aEv;	
	}
	public float getNotaFinal(){
		return notaFinal=(nota1aEv+nota2aEv+nota3aEv)/3;	
	}
	public void setDni(String dni){
		this.dni=dni; 
	}
	public void setCodigo(String codigo){
		this.codigo=codigo; 
	}
	public void setNota1aEv(float nota1aEv){
		this.nota1aEv=nota1aEv; 
	}
	public void setNota2aEv(float nota2aEv){
		this.nota2aEv=nota2aEv; 
	}
	public void setNota3aEv(float nota3aEv){
		this.nota3aEv=nota3aEv; 
	}
	public void setNotaFinal(float notaFinal){
		this.notaFinal=notaFinal; 
	}
}
