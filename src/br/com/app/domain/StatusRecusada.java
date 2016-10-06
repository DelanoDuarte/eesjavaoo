package br.com.app.domain;

public class StatusRecusada implements Status {

	public Solicitacao solicitacao;

	@Override
	public void solicitar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void aprovar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void recusar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void retomar(String motivo) {
		// TODO Auto-generated method stub

	}

	@Override
	public Solicitacao getSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
		return solicitacao;
	}

}
