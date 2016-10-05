/**
 * 
 */
package br.com.app.domain;

/**
 * @author delano.junior
 *
 */
public class StatusAguardandoChefia implements Status {

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
		this.solicitacao.status = new StatusAguardandoRH();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.app.domain.Status#recusar()
	 */
	@Override
	public void recusar() {
		this.solicitacao.status = new StatusRecusada();
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
