/**
 * 
 */
package br.com.app.domain;

/**
 * @author delano.junior
 *
 */
public class StatusAguardandoRH implements Status {

	@Override
	public void solicitar(Solicitacao solicitacao) {

	}

	@Override
	public void aprovar(Solicitacao solicitacao) {
		solicitacao.setStatus(new StatusAprovada());
	}

	@Override
	public void recusar(Solicitacao solicitacao) {

	}

	@Override
	public void retomar(String motivo) {

	}

	@Override
	public Solicitacao getSolicitacao(Solicitacao solicitacao) {
		return solicitacao;
	}
}
