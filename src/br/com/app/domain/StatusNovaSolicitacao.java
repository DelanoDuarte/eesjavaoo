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

	public Solicitacao solicitacao;

	@Override
	public void solicitar() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.app.domain.Status#aprovar()
	 */
	@Override
	public void aprovar() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.app.domain.Status#recusar()
	 */
	@Override
	public void recusar() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.app.domain.Status#retomarf()
	 */
	@Override
	public void retomar(String motivo) {
		// TODO Auto-generated method stub

	}

}
