package br.com.app.testes;

import org.junit.Test;

import br.com.app.domain.Funcionario;
import br.com.app.domain.Solicitacao;
import br.com.app.domain.StatusAguardandoChefia;
import br.com.app.domain.StatusNovaSolicitacao;
import junit.framework.TestCase;

public class NovaSolicitacaoTest extends TestCase {

	@Test
	public void testSolicitar() {

		Solicitacao solicitacao = new Solicitacao();

		StatusNovaSolicitacao instance = montaCenario();
		instance.solicitar(solicitacao);
		assertEquals(new StatusAguardandoChefia(), solicitacao.getStatus());
	}

	@Test(expected = IllegalStateException.class)
	public void testAprovar() throws Exception {

		Solicitacao solicitacao = new Solicitacao();

		StatusNovaSolicitacao instance = montaCenario();
		instance.aprovar(solicitacao);
	}

	@Test(expected = IllegalStateException.class)
	public void testRecusar() throws Exception {

		Solicitacao solicitacao = new Solicitacao();

		StatusNovaSolicitacao instance = montaCenario();
		instance.recusar(solicitacao);
	}

	@Test(expected = IllegalStateException.class)
	public void testRetornar() throws Exception {
		StatusNovaSolicitacao instance = montaCenario();
		instance.retomar("");
	}

	private StatusNovaSolicitacao montaCenario() {

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("JOAO");
		Solicitacao solicitacao = new Solicitacao();
		solicitacao.setFuncionario(funcionario);

		StatusNovaSolicitacao instance = new StatusNovaSolicitacao();
		instance.getSolicitacao(solicitacao);
		return instance;
	}
}
