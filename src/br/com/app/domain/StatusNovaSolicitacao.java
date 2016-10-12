/**
 * 
 */
package br.com.app.domain;

/**
 * @author delano.junior
 *
 */
public class StatusNovaSolicitacao implements Status {

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.app.domain.Status#solicitar()
	 */

	@Override
	public void solicitar(Solicitacao solicitacao) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.app.domain.Status#aprovar()
	 */
	@Override
	public void aprovar(Solicitacao solicitacao) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.app.domain.Status#recusar()
	 */
	@Override
	public void recusar(Solicitacao solicitacao) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.app.domain.Status#retomarf()
	 */
	@Override
	public void retomar(String motivo) {

	}

	@Override
	public Solicitacao getSolicitacao(Solicitacao solicitacao) {
		return solicitacao;
	}

}
