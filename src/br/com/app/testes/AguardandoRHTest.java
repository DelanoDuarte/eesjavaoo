package br.com.app.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.app.domain.Funcionario;
import br.com.app.domain.Solicitacao;
import br.com.app.domain.StatusAguardandoChefia;
import br.com.app.domain.StatusAguardandoRH;
import br.com.app.domain.StatusAprovada;
import br.com.app.domain.StatusRecusada;

public class AguardandoRHTest {

	@Test(expected = IllegalStateException.class)
	public void testSolicitar() throws Exception {
		StatusAguardandoRH instance = montaCenario();
		instance.solicitar();
	}

	public void testAprovar() throws Exception {
		StatusAguardandoRH instance = montaCenario();
		instance.aprovar();
		assertEquals(new StatusAprovada(), instance.solicitacao.status);
	}

	public void testRecusar() throws Exception {
		StatusAguardandoRH instance = montaCenario();
		instance.recusar();
		assertEquals(new StatusRecusada(), instance.solicitacao.status);
	}

	public void testRetornar() throws Exception {
		StatusAguardandoRH instance = montaCenario();
		instance.retomar("");
		assertEquals(new StatusAguardandoChefia(), instance.solicitacao.status);
	}

	private StatusAguardandoRH montaCenario() {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("JOAO");
		Solicitacao solicitacao = new Solicitacao();
		solicitacao.setFuncionario(funcionario);

		StatusAguardandoRH instance = new StatusAguardandoRH();
		instance.solicitacao = solicitacao;
		return instance;
	}

}
