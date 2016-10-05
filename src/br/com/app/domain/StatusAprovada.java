/**
 * 
 */
package br.com.app.domain;

/**
 * @author delano.junior
 *
 */
public class StatusAprovada implements Status {

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
		// TODO Auto-generated method stub

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

	}

}
