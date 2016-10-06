package br.com.app.testes;

import org.junit.Test;

import br.com.app.domain.Funcionario;
import br.com.app.domain.Solicitacao;
import br.com.app.domain.Status;
import br.com.app.domain.StatusAguardandoChefia;
import br.com.app.domain.StatusAguardandoRH;
import br.com.app.domain.StatusAprovada;
import junit.framework.TestCase;

public class AguardandoRHTest extends TestCase {

	@Test(expected = IllegalStateException.class)
	public void testSolicitar() throws Exception {
		StatusAguardandoRH instance = montaCenario();
		instance.solicitar();
	}

	@Test
	public void testAprovar() throws Exception {
		StatusAguardandoRH instance = montaCenario();
		instance.aprovar();
		Status statusEsperado = new StatusAprovada();
		// statusEsperado = instance.solicitacao.status;
		assertEquals(statusEsperado, instance.solicitacao.status);
	}
	
	@Test
	public void testRecusar() throws Exception {
		StatusAguardandoRH instance = montaCenario();
		instance.recusar();

		Status statusEsperado = instance.solicitacao.status;
		assertEquals(statusEsperado, instance.solicitacao.status);
	}

	@Test
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
