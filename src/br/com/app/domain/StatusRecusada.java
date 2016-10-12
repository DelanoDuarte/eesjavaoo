package br.com.app.domain;

public class StatusRecusada implements Status {

	@Override
	public void solicitar(Solicitacao solicitacao) {
		// TODO Auto-generated method stub

	}

	@Override
	public void aprovar(Solicitacao solicitacao) {
		// TODO Auto-generated method stub

	}

	@Override
	public void recusar(Solicitacao solicitacao) {
		// TODO Auto-generated method stub

	}

	@Override
	public void retomar(String motivo) {
		// TODO Auto-generated method stub

	}

	@Override
	public Solicitacao getSolicitacao(Solicitacao solicitacao) {
		return solicitacao;
	}

}
