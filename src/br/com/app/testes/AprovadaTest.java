package br.com.app.testes;

import org.junit.Test;

import br.com.app.domain.StatusAprovada;
import junit.framework.TestCase;

public class AprovadaTest extends TestCase {

	@Test(expected = IllegalStateException.class)
	public void testSolicitar() throws Exception {
		StatusAprovada instance = new StatusAprovada();
		instance.solicitar();
	}

	@Test(expected = IllegalStateException.class)
	public void testAprovar() throws Exception {
		StatusAprovada instance = new StatusAprovada();
		instance.aprovar();
	}

	@Test(expected = IllegalStateException.class)
	public void testRecusar() throws Exception {
		StatusAprovada instance = new StatusAprovada();
		instance.recusar();
	}

	@Test(expected = IllegalStateException.class)
	public void testRetornar() throws Exception {
		StatusAprovada instance = new StatusAprovada();
		instance.retomar("");
	}

}
