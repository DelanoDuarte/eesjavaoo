package br.com.app.testes;

import org.junit.Test;

import br.com.app.domain.StatusRecusada;

public class RecusadaTest {

	@Test(expected = IllegalStateException.class)
	public void testSolicitar() throws Exception {
		StatusRecusada instance = new StatusRecusada();
		instance.solicitar();
	}

	@Test(expected = IllegalStateException.class)
	public void testAprovar() throws Exception {
		StatusRecusada instance = new StatusRecusada();
		instance.aprovar();
	}

	@Test(expected = IllegalStateException.class)
	public void testRecusar() throws Exception {
		StatusRecusada instance = new StatusRecusada();
		instance.recusar();
	}

	@Test(expected = IllegalStateException.class)
	public void testRetornar() throws Exception {
		StatusRecusada instance = new StatusRecusada();
		instance.retomar("");
	}

}
