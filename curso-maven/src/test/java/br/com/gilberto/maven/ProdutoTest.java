package br.com.gilberto.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.gilberto.maven.Produto;

public class ProdutoTest {
	
	@Test
	public void verificaPrecoComImposto() {
		
		Produto bala = new Produto("bala", 0.10);
		assertEquals(0.11, bala.getPrecoComImposto(), 0.0000001);
	}
}
