package br.com.q4auditoria.web.models;
// Generated 13/03/2017 16:55:31 by Hibernate Tools 5.2.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.q4auditoria.web.utils.BaseEntity;

@Entity
@Table(name="Acao")
public class AcaoEntity extends BaseEntity {

	private static final long serialVersionUID = -5064789517538784994L;
	
	@Id
	@GeneratedValue(generator = "SEQ_ACAO", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQ_ACAO", sequenceName = "SEQ_ACAO", allocationSize = 0)
	@Column(name="ac_id")
	private Long id;
	
	@Column(name="ac_descricao")
	private String descricao;

	public AcaoEntity() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
