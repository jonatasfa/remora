package br.com.q4auditoria.web.models;
// Generated 13/03/2017 16:55:31 by Hibernate Tools 5.2.1.Final

import java.util.Date;

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
@Table(name="Usuario")
public class UsuarioEntity extends BaseEntity {

	private static final long serialVersionUID = -7935344211760274886L;

	@Id
	@GeneratedValue(generator = "SEQ_USUARIO", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SEQ_USUARIO", sequenceName = "SEQ_USUARIO", allocationSize = 0)
	@Column(name="us_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name="pe_id")
	private PerfilEntity perfil;

	@Column(name="us_nome")
	private String nome;

	@Column(name="us_email")
	private String email;

	@Column(name="us_login")
	private String login;

	@Column(name="us_senha")
	private String senha;

	@Column(name="us_telefone")
	private Integer telefone;

	@Column(name="us_ativo")
	private Boolean ativo = true;

	@Column(name="us_dt_acesso")
	private Date dtAcesso = new Date();

	@Column(name="us_alterar_senha")
	private Boolean alterarSenha;

	@Column(name="us_dt_alt_senha")
	private Date dtAltSenha;

	@Column(name="us_bloqueado")
	private Boolean bloqueado;

	@Column(name="us_qnt_erro")
	private Integer qntErro;

	public UsuarioEntity() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PerfilEntity getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilEntity perfil) {
		this.perfil = perfil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Date getDtAcesso() {
		return dtAcesso;
	}

	public void setDtAcesso(Date dtAcesso) {
		this.dtAcesso = dtAcesso;
	}

	public Boolean getAlterarSenha() {
		return alterarSenha;
	}

	public void setAlterarSenha(Boolean alterarSenha) {
		this.alterarSenha = alterarSenha;
	}

	public Date getDtAltSenha() {
		return dtAltSenha;
	}

	public void setDtAltSenha(Date dtAltSenha) {
		this.dtAltSenha = dtAltSenha;
	}

	public Boolean getBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(Boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public Integer getQntErro() {
		return qntErro;
	}

	public void setQntErro(Integer qntErro) {
		this.qntErro = qntErro;
	}

}
