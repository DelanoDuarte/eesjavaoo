package br.com.app.testes;

import org.junit.Test;

import br.com.app.domain.Solicitacao;
import br.com.app.domain.StatusRecusada;
import junit.framework.TestCase;

public class RecusadaTest extends TestCase {

	@Test(expected = IllegalStateException.class)
	public void testSolicitar() throws Exception {

		Solicitacao solicitacao = new Solicitacao();

		StatusRecusada instance = new StatusRecusada();
		instance.solicitar(solicitacao);
	}

	@Test(expected = IllegalStateException.class)
	public void testAprovar() throws Exception {

		Solicitacao solicitacao = new Solicitacao();

		StatusRecusada instance = new StatusRecusada();
		instance.aprovar(solicitacao);
	}

	@Test(expected = IllegalStateException.class)
	public void testRecusar() throws Exception {

		Solicitacao solicitacao = new Solicitacao();

		StatusRecusada instance = new StatusRecusada();
		instance.recusar(solicitacao);
	}

	@Test(expected = IllegalStateException.class)
	public void testRetornar() throws Exception {
		StatusRecusada instance = new StatusRecusada();
		instance.retomar("");
	}

}
