
public class Pilha {
	
	private int quantidade;
	private Object[] elementos = new Object[10];
	
	public Pilha(int i) {
		// TODO Auto-generated constructor stub
	}

	public boolean estaVazia() {
		// TODO Auto-generated method stub
		
		return (quantidade == 0);
	}

	public int tamanho() {
		// TODO Auto-generated method stub
		return quantidade;
	}


	public void empilha(Object elemento) {
		// TODO Auto-generated method stub
		this.elementos[quantidade] = elemento;
		quantidade++;
		
	}

	public Object topo() {
		// TODO Auto-generated method stub
		return elementos[quantidade-1];
	}

	public Object desempilha() {
		// TODO Auto-generated method stub
		Object topo = topo();
		quantidade--;
		return topo;
	}

}
