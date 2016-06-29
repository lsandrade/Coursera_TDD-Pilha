
public class Pilha {
	
	private int quantidade;
	private Object elemento;
	
	public Pilha(int i) {
		// TODO Auto-generated constructor stub
	}

	public boolean estaVazia() {
		// TODO Auto-generated method stub
		
		return (elemento == null);
	}

	public int tamanho() {
		// TODO Auto-generated method stub
		return quantidade;
	}


	public void empilha(Object elemento) {
		// TODO Auto-generated method stub
		this.elemento = elemento;
		quantidade++;
		
	}

	public Object topo() {
		// TODO Auto-generated method stub
		return elemento;
	}

}
