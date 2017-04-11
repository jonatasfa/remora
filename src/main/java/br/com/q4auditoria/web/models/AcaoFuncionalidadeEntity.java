package br.com.q4auditoria.web.models;
// Generated 13/03/2017 16:55:31 by Hibernate Tools 5.2.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.q4auditoria.web.utils.BaseEntity;

@Entity
@Table(name="AcaoFuncionalidade")
public class AcaoFuncionalidadeEntity extends BaseEntity {

	private static final long serialVersionUID = 7697389592149036678L;
	
	@Id
	@GeneratedValue(generator = "SEQ_ACAOFUNCIONALIDADE", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQ_ACAOFUNCIONALIDADE", sequenceName = "SEQ_ACAOFUNCIONALIDADE", allocationSize = 0)
	@Column(name="af_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="ac_id")
	private AcaoEntity acao;

	@ManyToOne
	@JoinColumn(name="fu_id")
	private FuncionalidadeEntity funcionalidade;

	public AcaoFuncionalidadeEntity() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AcaoEntity getAcao() {
		return this.acao;
	}

	public void setAcao(AcaoEntity acao) {
		this.acao = acao;
	}

	public FuncionalidadeEntity getFuncionalidade() {
		return this.funcionalidade;
	}

	public void setFuncionalidade(FuncionalidadeEntity funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

}
