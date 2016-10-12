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
	private Status status = new StatusNovaSolicitacao();

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

	public Status getStatus() {
		return status;
	}

	public void setStatus(final Status status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Solicitacao))
			return false;
		Solicitacao other = (Solicitacao) obj;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	public void solicitar() {
		status.solicitar(this);
	}

	public void aprovar() {
		status.aprovar(this);
	}

	public void recusar() {
		status.recusar(this);
	}

	public void retomar(String motivo) {
		status.retomar(motivo);
	}

}
