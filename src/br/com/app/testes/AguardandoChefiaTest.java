package br.com.app.testes;

import org.junit.Test;

import br.com.app.domain.Funcionario;
import br.com.app.domain.Solicitacao;
import br.com.app.domain.Status;
import br.com.app.domain.StatusAguardandoChefia;
import br.com.app.domain.StatusAguardandoRH;
import br.com.app.domain.StatusRecusada;
import junit.framework.TestCase;

public class AguardandoChefiaTest extends TestCase{

	@Test(expected = IllegalStateException.class)
	public void testSolicitar() throws Exception {
		StatusAguardandoChefia instance = montaCenario();
		instance.solicitar();
	}

	@Test
	public void testAprovar() throws Exception {
		StatusAguardandoChefia instance = montaCenario();
		instance.aprovar();
		Status statusEsperado = new StatusAguardandoRH();
		//statusEsperado = instance.solicitacao.status;

		assertEquals(statusEsperado, instance.solicitacao.status);
	}

	@Test
	public void testRecusar() throws Exception {
		StatusAguardandoChefia instance = montaCenario();
		instance.recusar();
		Status statusEsperado = new StatusRecusada();
		statusEsperado = instance.solicitacao.status;
		
		assertEquals(statusEsperado, instance.solicitacao.status);
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
