package br.com.app.testes;

import org.junit.Test;

import br.com.app.domain.Funcionario;
import br.com.app.domain.Solicitacao;
import br.com.app.domain.StatusAguardandoChefia;
import br.com.app.domain.StatusAguardandoRH;
import br.com.app.domain.StatusRecusada;
import junit.framework.TestCase;

public class AguardandoChefiaTest extends TestCase {

	@Test(expected = IllegalStateException.class)
	public void testSolicitar() throws Exception {
		Solicitacao solicitacao = new Solicitacao();

		StatusAguardandoChefia instance = montaCenario();
		instance.solicitar(solicitacao);
	}

	@Test
	public void testAprovar() throws Exception {
		Solicitacao solicitacao = new Solicitacao();

		StatusAguardandoChefia instance = montaCenario();
		instance.aprovar(solicitacao);

		// assertTrue(solicitacao.getStatus().equals(new StatusAguardandoRH()));

		// assertSame(solicitacao.getStatus(), solicitacao.getStatus());

		assertEquals(new StatusAguardandoRH(), solicitacao.getStatus());
	}

	@Test
	public void testRecusar() throws Exception {
		StatusAguardandoChefia instance = montaCenario();

		Solicitacao solicitacao = new Solicitacao();

		instance.recusar(solicitacao);
		
		assertEquals(new StatusRecusada(), solicitacao.getStatus());
	}

	@Test(expected = IllegalStateException.class)
	public void testRetornar() throws Exception {
		StatusAguardandoChefia instance = montaCenario();
		instance.retomar("");
	}

	private StatusAguardandoChefia montaCenario() {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("JOAO");
		Solicitacao solicitacao = new Solicitacao();
		solicitacao.setFuncionario(funcionario);

		StatusAguardandoChefia instance = new StatusAguardandoChefia();
		instance.getSolicitacao(solicitacao);
		return instance;
	}
}
