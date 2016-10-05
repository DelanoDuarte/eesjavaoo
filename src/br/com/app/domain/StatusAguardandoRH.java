/**
 * 
 */
package br.com.app.domain;

/**
 * @author delano.junior
 *
 */
public class StatusAguardandoRH implements Status {

	public Solicitacao solicitacao;

	@Override
	public void solicitar() {

	}

	@Override
	public void aprovar() {
		this.solicitacao.status = new StatusAprovada();
	}

	@Override
	public void recusar() {
		this.solicitacao.status = new StatusRecusada();
	}

	@Override
	public void retomar(String motivo) {
		this.solicitacao.status = new StatusNovaSolicitacao();

	}

}
