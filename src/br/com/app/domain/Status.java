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

	public void solicitar();

	public void aprovar();

	public void recusar();

	public void retomar(String motivo);
}
