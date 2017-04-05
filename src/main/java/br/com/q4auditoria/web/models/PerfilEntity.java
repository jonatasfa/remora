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
@Table(name="Perfil")
public class PerfilEntity extends BaseEntity {

	private static final long serialVersionUID = -1030839824395995499L;
	
	@Id
	@GeneratedValue(generator = "SEQ_PERFIL", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQ_PERFIL", sequenceName = "SEQ_PERFIL", allocationSize = 0)
	@Column(name="pe_id")
	private Long peId;

	@Column(name="pe_descricao")
	private String peDescricao;

	@Column(name="pe_regra")
	private String peRegra;

	public PerfilEntity() {
	}

	public Long getPeId() {
		return this.peId;
	}

	public void setPeId(Long peId) {
		this.peId = peId;
	}

	public String getPeDescricao() {
		return this.peDescricao;
	}

	public void setPeDescricao(String peDescricao) {
		this.peDescricao = peDescricao;
	}

	public String getPeRegra() {
		return this.peRegra;
	}

	public void setPeRegra(String peRegra) {
		this.peRegra = peRegra;
	}

}
