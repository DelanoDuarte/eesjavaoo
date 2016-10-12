package br.com.app.testes;

import org.junit.Test;

import br.com.app.domain.Funcionario;
import br.com.app.domain.Solicitacao;
import br.com.app.domain.StatusAguardandoChefia;
import br.com.app.domain.StatusAguardandoRH;
import br.com.app.domain.StatusAprovada;
import br.com.app.domain.StatusRecusada;
import junit.framework.TestCase;

public class AguardandoRHTest extends TestCase {

	@Test(expected = IllegalStateException.class)
	public void testSolicitar() throws Exception {

		Solicitacao solicitacao = new Solicitacao();

		StatusAguardandoRH instance = montaCenario();
		instance.solicitar(solicitacao);
	}

	@Test
	public void testAprovar() throws Exception {

		Solicitacao solicitacao = new Solicitacao();

		StatusAguardandoRH instance = montaCenario();
		instance.aprovar(solicitacao);

		assertEquals(new StatusAprovada(), solicitacao.getStatus());
	}

	@Test
	public void testRecusar() throws Exception {

		Solicitacao solicitacao = new Solicitacao();

		StatusAguardandoRH instance = montaCenario();
		instance.recusar(solicitacao);

		assertEquals(new StatusRecusada(), solicitacao.getStatus());
	}

	@Test
	public void testRetornar() throws Exception {

		Solicitacao solicitacao = new Solicitacao();

		StatusAguardandoRH instance = montaCenario();
		instance.retomar("");
		assertEquals(new StatusAguardandoChefia(), solicitacao.getStatus());
	}

	private StatusAguardandoRH montaCenario() {

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("JOAO");
		Solicitacao solicitacao = new Solicitacao();
		solicitacao.setFuncionario(funcionario);

		StatusAguardandoRH instance = new StatusAguardandoRH();
		instance.getSolicitacao(solicitacao);
		return instance;
	}

}
