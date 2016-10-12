/**
 * 
 */
package br.com.app.testes;

import br.com.app.domain.Solicitacao;
import br.com.app.domain.StatusAguardandoChefia;
import br.com.app.domain.StatusRecusada;

/**
 * @author Jessica
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//
		// StatusAguardandoChefia chefia = new StatusAguardandoChefia();
		// chefia.aprovar(solicitacao);
		// System.out.println(solicitacao.getStatus().toString());
		//
		// StatusAguardandoRH rh = new StatusAguardandoRH();
		// rh.aprovar(solicitacao);
		//
		// System.out.println(solicitacao.getStatus().toString());
	}

	void metodoTeste() {
		Solicitacao solicitacao = new Solicitacao();

		StatusAguardandoChefia chefia = new StatusAguardandoChefia();
		chefia.recusar(solicitacao);
		boolean resultado = false;
		if (solicitacao.getStatus().equals(new StatusRecusada())) {
			resultado = true;
		} else {
			resultado = false;
		}

	}

}
