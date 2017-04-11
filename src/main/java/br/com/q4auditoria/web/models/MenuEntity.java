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
@Table(name="Menu")
public class MenuEntity extends BaseEntity {

	private static final long serialVersionUID = 1694426342452966609L;

	@Id
	@GeneratedValue(generator = "SEQ_MENU", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQ_MENU", sequenceName = "SEQ_MENU", allocationSize = 0)
	@Column(name="me_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name="me_id_pai")
	private MenuEntity menuPai;

	@Column(name="me_descricao")
	private String descricao;

	@Column(name="me_ordem")
	private int ordem;

	public MenuEntity() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MenuEntity getMenuPai() {
		return menuPai;
	}

	public void setMenuPai(MenuEntity menuPai) {
		this.menuPai = menuPai;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

}
