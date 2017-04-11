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
@Table(name="PerfilAcaoFuncionalidade")
public class PerfilAcaoFuncionalidadeEntity extends BaseEntity {

	private static final long serialVersionUID = -2883360197612892930L;

	@Id
	@GeneratedValue(generator = "SEQ_PERFILACAOFUNCIONALIDADE", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQ_PERFILACAOFUNCIONALIDADE", sequenceName = "SEQ_PERFILACAOFUNCIONALIDADE", allocationSize = 0)
	@Column(name="pf_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name="af_id")
	private AcaoFuncionalidadeEntity acaoFuncionalidade;

	@ManyToOne
	@JoinColumn(name="pe_id")
	private PerfilEntity perfil;

	public PerfilAcaoFuncionalidadeEntity() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AcaoFuncionalidadeEntity getAcaoFuncionalidade() {
		return this.acaoFuncionalidade;
	}

	public void setAcaoFuncionalidade(AcaoFuncionalidadeEntity acaoFuncionalidade) {
		this.acaoFuncionalidade = acaoFuncionalidade;
	}

	public PerfilEntity getPerfil() {
		return this.perfil;
	}

	public void setPerfil(PerfilEntity perfil) {
		this.perfil = perfil;
	}

}
