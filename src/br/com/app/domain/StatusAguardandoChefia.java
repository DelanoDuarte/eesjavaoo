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

	@Override
	public void solicitar(Solicitacao solicitacao) {
		solicitacao.setStatus(new StatusAguardandoChefia());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.app.domain.Status#aprovar()
	 */
	@Override
	public void aprovar(Solicitacao solicitacao) {
		solicitacao.setStatus(new StatusAguardandoRH());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.app.domain.Status#recusar()
	 */
	@Override
	public void recusar(Solicitacao solicitacao) {
		solicitacao.setStatus(new StatusRecusada());
	}

	/*
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
