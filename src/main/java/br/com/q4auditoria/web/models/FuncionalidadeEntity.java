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
	private Long fuId;

	@ManyToOne
	@JoinColumn(name="me_id")
	private MenuEntity menu;

	@Column(name="fu_descricao")
	private String fuDescricao;

	@Column(name="fu_ativo")
	private Boolean fuAtivo;

	@Column(name="fu_ordem")
	private int fuOrdem;

	@Column(name="fu_pagina")
	private String fuPagina;

	public FuncionalidadeEntity() {
	}

	public Long getFuId() {
		return this.fuId;
	}

	public void setFuId(Long fuId) {
		this.fuId = fuId;
	}

	public MenuEntity getMenu() {
		return this.menu;
	}

	public void setMenu(MenuEntity menu) {
		this.menu = menu;
	}

	public String getFuDescricao() {
		return this.fuDescricao;
	}

	public void setFuDescricao(String fuDescricao) {
		this.fuDescricao = fuDescricao;
	}

	public Boolean getFuAtivo() {
		return this.fuAtivo;
	}

	public void setFuAtivo(Boolean fuAtivo) {
		this.fuAtivo = fuAtivo;
	}

	public int getFuOrdem() {
		return this.fuOrdem;
	}

	public void setFuOrdem(int fuOrdem) {
		this.fuOrdem = fuOrdem;
	}

	public String getFuPagina() {
		return this.fuPagina;
	}

	public void setFuPagina(String fuPagina) {
		this.fuPagina = fuPagina;
	}

}
