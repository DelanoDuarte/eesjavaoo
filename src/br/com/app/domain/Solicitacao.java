/**
 * 
 */
package br.com.app.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author delano.junior
 *
 */
public class Solicitacao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private Date inicio;
	private Date termino;
	private String motivo;
	private String observacao;
	private Funcionario funcionario;
	public Status status = new StatusNovaSolicitacao();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getTermino() {
		return termino;
	}

	public void setTermino(Date termino) {
		this.termino = termino;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void solicitar() {
		throw new UnsupportedOperationException("Metodo ainda nao implementado");
	}

	public void aprovar() {
		throw new UnsupportedOperationException("Metodo ainda nao implementado");
	}

	public void recusar() {
		throw new UnsupportedOperationException("Metodo ainda nao implementado");
	}

	public void retomar(String motivo) {
		throw new UnsupportedOperationException("Metodo ainda nao implementadof");
	}

}
