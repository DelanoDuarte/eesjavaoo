package br.com.app.domain;

public class StatusRecusada implements Status {

	@Override
	public void solicitar(Solicitacao solicitacao) {
	}

	@Override
	public void aprovar(Solicitacao solicitacao) {

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
