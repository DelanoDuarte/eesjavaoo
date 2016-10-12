/**
 * 
 */
package br.com.app.domain;

/**
 * @author delano.junior
 *
 */
public interface Status {

	public Solicitacao getSolicitacao(Solicitacao solicitacao);

	public void solicitar(Solicitacao solicitacao);

	public void aprovar(Solicitacao solicitacao);

	public void recusar(Solicitacao solicitacao);

	public void retomar(String motivo);
}
