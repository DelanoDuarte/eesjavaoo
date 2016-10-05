package br.com.app.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.app.domain.Funcionario;
import br.com.app.domain.Solicitacao;
import br.com.app.domain.StatusAguardandoChefia;
import br.com.app.domain.StatusNovaSolicitacao;

public class NovaSolicitacaoTest {

	@Test
	public void testSolicitar() {
		StatusNovaSolicitacao instance = montaCenario();
		instance.solicitar();
		assertEquals(new StatusAguardandoChefia(), instance.solicitacao.status);
	}

	@Test(expected = IllegalStateException.class)
	public void testAprovar() throws Exception {

		StatusNovaSolicitacao instance = montaCenario();
		instance.aprovar();
	}

	@Test(expected = IllegalStateException.class)
	public void testRecusar() throws Exception {

		StatusNovaSolicitacao instance = montaCenario();
		instance.recusar();
	}

	@Test(expected = IllegalStateException.class)
	public void testRetornar() throws Exception {
		StatusNovaSolicitacao instance = montaCenario();
		instance.retomar("");
	}

	private StatusNovaSolicitacao montaCenario() {
		// Cenário
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("JOAO");
		Solicitacao solicitacao = new Solicitacao();
		solicitacao.setFuncionario(funcionario);

		StatusNovaSolicitacao instance = new StatusNovaSolicitacao();
		instance.solicitacao = solicitacao;
		return instance;
	}
}
