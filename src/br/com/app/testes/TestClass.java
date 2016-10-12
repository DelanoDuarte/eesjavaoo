/**
 * 
 */
package br.com.app.testes;

import br.com.app.domain.Solicitacao;
import br.com.app.domain.StatusAguardandoChefia;
import br.com.app.domain.StatusAguardandoRH;

/**
 * @author Jessica
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Solicitacao solicitacao = new Solicitacao();

		StatusAguardandoChefia chefia = new StatusAguardandoChefia();
		chefia.aprovar(solicitacao);
		System.out.println(solicitacao.getStatus().toString());

		StatusAguardandoRH rh = new StatusAguardandoRH();
		rh.aprovar(solicitacao);

		System.out.println(solicitacao.getStatus().toString());
	}

}
