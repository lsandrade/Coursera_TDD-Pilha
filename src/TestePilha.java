import static org.junit.Assert.*;

import org.junit.Test;


public class TestePilha {

	@Test
	public void pilhaVazia() {
		Pilha p = new Pilha(10);
		assertTrue(p.estaVazia());
		assertEquals(0,p.tamanho());
		
	}
	
	@Test
	public void empilhaUmElemento(){
		Pilha p = new Pilha(10);
		p.empilha("primeiro");
		assertFalse(p.estaVazia());
		assertEquals(1,p.tamanho());
		assertEquals("primeiro",p.topo());
		
	}
	
	@Test
	public void empilhaEDesempilha(){
		Pilha p = new Pilha(10);
		p.empilha("primeiro");
		p.empilha("segundo");
		assertEquals(2,p.tamanho());
		assertEquals("segundo",p.topo());
		
		Object desempilhado = p.desempilha();
		assertEquals(1,p.tamanho());
		assertEquals("primeiro",p.topo());
		assertEquals("segundo",desempilhado);
		
	}

}
