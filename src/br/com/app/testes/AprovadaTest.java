package br.com.app.testes;

import org.junit.Test;

import br.com.app.domain.Solicitacao;
import br.com.app.domain.StatusAprovada;
import junit.framework.TestCase;

public class AprovadaTest extends TestCase {

	@Test(expected = IllegalStateException.class)
	public void testSolicitar() throws Exception {

		Solicitacao solicitacao = new Solicitacao();

		StatusAprovada instance = new StatusAprovada();
		instance.solicitar(solicitacao);
	}

	@Test(expected = IllegalStateException.class)
	public void testAprovar() throws Exception {

		Solicitacao solicitacao = new Solicitacao();

		StatusAprovada instance = new StatusAprovada();
		instance.aprovar(solicitacao);
	}

	@Test(expected = IllegalStateException.class)
	public void testRecusar() throws Exception {

		Solicitacao solicitacao = new Solicitacao();

		StatusAprovada instance = new StatusAprovada();
		instance.recusar(solicitacao);
	}

	@Test(expected = IllegalStateException.class)
	public void testRetornar() throws Exception {

		StatusAprovada instance = new StatusAprovada();
		instance.retomar("");
	}

}
