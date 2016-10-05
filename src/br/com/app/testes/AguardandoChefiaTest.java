package br.com.app.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.app.domain.Funcionario;
import br.com.app.domain.Solicitacao;
import br.com.app.domain.StatusAguardandoChefia;
import br.com.app.domain.StatusAguardandoRH;
import br.com.app.domain.StatusRecusada;

public class AguardandoChefiaTest {

	@Test(expected = IllegalStateException.class)
	public void testSolicitar() throws Exception {
		StatusAguardandoChefia instance = montaCenario();
		instance.solicitar();
	}

	public void testAprovar() throws Exception {
		StatusAguardandoChefia instance = montaCenario();
		instance.aprovar();
		assertEquals(new StatusAguardandoRH(), instance.solicitacao.status);
	}

	public void testRecusar() throws Exception {
		StatusAguardandoChefia instance = montaCenario();
		instance.recusar();
		assertEquals(new StatusRecusada(), instance.solicitacao.status);
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
		instance.solicitacao = solicitacao;
		return instance;
	}
}
