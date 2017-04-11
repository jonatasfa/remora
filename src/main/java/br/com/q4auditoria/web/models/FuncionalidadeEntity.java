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
@Table(name="Funcionalidade")
public class FuncionalidadeEntity extends BaseEntity {

	private static final long serialVersionUID = 6749470673773150874L;

	@Id
	@GeneratedValue(generator = "SEQ_FUNCIONALIDADE", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQ_FUNCIONALIDADE", sequenceName = "SEQ_FUNCIONALIDADE", allocationSize = 0)
	@Column(name="fu_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name="me_id")
	private MenuEntity menu;

	@Column(name="fu_descricao")
	private String descricao;

	@Column(name="fu_ativo")
	private Boolean ativo;

	@Column(name="fu_ordem")
	private int ordem;

	@Column(name="fu_pagina")
	private String pagina;

	public FuncionalidadeEntity() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MenuEntity getMenu() {
		return menu;
	}

	public void setMenu(MenuEntity menu) {
		this.menu = menu;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}

}
