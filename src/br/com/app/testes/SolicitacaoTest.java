package br.com.app.testes;

import org.junit.Test;

import br.com.app.domain.Funcionario;
import br.com.app.domain.Solicitacao;
import br.com.app.domain.Status;
import br.com.app.domain.StatusAguardandoChefia;
import br.com.app.domain.StatusAguardandoRH;
import br.com.app.domain.StatusAprovada;
import br.com.app.domain.StatusNovaSolicitacao;
import br.com.app.domain.StatusRecusada;
import junit.framework.TestCase;

public class SolicitacaoTest extends TestCase {

	@Test
	public void testSolicitar() throws Exception {
		Solicitacao solicitacao = montaCenario();

		solicitacao.solicitar();

		assertEquals(new StatusAguardandoChefia(), solicitacao.getStatus());
	}

	private Solicitacao montaCenario() {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("JOAO");
		Solicitacao solicitacao = new Solicitacao();
		solicitacao.setFuncionario(funcionario);
		return solicitacao;
	}

	@Test
	public void testHappyDay() throws Exception {
		Solicitacao solicitacao = montaCenario();

		Status result1 = solicitacao.getStatus();
		solicitacao.solicitar();
		Status result2 = solicitacao.getStatus();
		solicitacao.aprovar();
		Status result3 = solicitacao.getStatus();
		solicitacao.aprovar();
		Status result4 = solicitacao.getStatus();

		assertEquals(new StatusNovaSolicitacao(), result1);
		assertEquals(new StatusAguardandoChefia(), result2);
		assertEquals(new StatusAguardandoRH(), result3);
		assertEquals(new StatusAprovada(), result4);
	}

	@Test
	public void testSolicitacaoRecusadaPelaChefia() throws Exception {
		Solicitacao solicitacao = montaCenario();

		solicitacao.solicitar();
		solicitacao.recusar();

		assertEquals(new StatusRecusada(), solicitacao.getStatus());
	}

	@Test
	public void testSolicitacaoRecusadaPeloRH() throws Exception {

		Solicitacao solicitacao = montaCenario();
		solicitacao.solicitar();
		solicitacao.aprovar();

		solicitacao.recusar();

		assertEquals(new StatusRecusada(), solicitacao.getStatus());
	}

	@Test(expected = IllegalStateException.class)
	public void testSolicitacaoNovaNaoPodeSerAprovada() throws Exception {
		Solicitacao solicitacao = montaCenario();

		solicitacao.aprovar();
	}

	@Test(expected = IllegalStateException.class)
	public void testSolicitacaoNovaNaoPodeSerRecusada() throws Exception {
		Solicitacao solicitacao = montaCenario();

		solicitacao.recusar();
	}

	@Test(expected = IllegalStateException.class)
	public void testSolicitacaoAprovadaNaoPodeSerRetornada() throws Exception {
		Solicitacao solicitacao = montaCenario();

		solicitacao.aprovar();
		solicitacao.aprovar();

		solicitacao.retomar("Faltou um documento");
	}

	@Test(expected = IllegalStateException.class)
	public void testSolicitacaoAprovadaNaoPodeSerRecusada() throws Exception {
		Solicitacao solicitacao = montaCenario();

		solicitacao.aprovar();
		solicitacao.aprovar();

		solicitacao.recusar();
	}

	@Test(expected = IllegalStateException.class)
	public void testSolicitacaoRecusadaNaoPodeSerAprovada() throws Exception {
		Solicitacao solicitacao = montaCenario();

		solicitacao.solicitar();
		solicitacao.recusar();

		solicitacao.aprovar();
	}

}
