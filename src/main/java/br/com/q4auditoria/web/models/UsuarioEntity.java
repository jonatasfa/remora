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
	private Long usId;

	@ManyToOne
	@JoinColumn(name="pe_id")
	private PerfilEntity perfil;

	@Column(name="us_nome")
	private String usNome;

	@Column(name="us_email")
	private String usEmail;

	@Column(name="us_login")
	private String usLogin;

	@Column(name="us_senha")
	private String usSenha;

	@Column(name="us_telefone")
	private Integer usTelefone;

	@Column(name="us_ativo")
	private Boolean usAtivo;

	@Column(name="us_dt_acesso")
	private Date usDtAcesso;

	@Column(name="us_alterar_senha")
	private Boolean usAlterarSenha;

	@Column(name="us_dt_alt_senha")
	private Date usDtAltSenha;

	@Column(name="us_bloqueado")
	private Boolean usBloqueado;

	@Column(name="us_qnt_erro")
	private Integer usQntErro;

	public UsuarioEntity() {
	}

	public Long getUsId() {
		return this.usId;
	}

	public void setUsId(Long usId) {
		this.usId = usId;
	}

	public PerfilEntity getPerfil() {
		return this.perfil;
	}

	public void setPerfil(PerfilEntity perfil) {
		this.perfil = perfil;
	}

	public String getUsNome() {
		return this.usNome;
	}

	public void setUsNome(String usNome) {
		this.usNome = usNome;
	}

	public String getUsEmail() {
		return this.usEmail;
	}

	public void setUsEmail(String usEmail) {
		this.usEmail = usEmail;
	}

	public String getUsLogin() {
		return this.usLogin;
	}

	public void setUsLogin(String usLogin) {
		this.usLogin = usLogin;
	}

	public String getUsSenha() {
		return this.usSenha;
	}

	public void setUsSenha(String usSenha) {
		this.usSenha = usSenha;
	}

	public Integer getUsTelefone() {
		return this.usTelefone;
	}

	public void setUsTelefone(Integer usTelefone) {
		this.usTelefone = usTelefone;
	}

	public Boolean getUsAtivo() {
		return this.usAtivo;
	}

	public void setUsAtivo(Boolean usAtivo) {
		this.usAtivo = usAtivo;
	}

	public Date getUsDtAcesso() {
		return this.usDtAcesso;
	}

	public void setUsDtAcesso(Date usDtAcesso) {
		this.usDtAcesso = usDtAcesso;
	}

	public Boolean getUsAlterarSenha() {
		return this.usAlterarSenha;
	}

	public void setUsAlterarSenha(Boolean usAlterarSenha) {
		this.usAlterarSenha = usAlterarSenha;
	}

	public Date getUsDtAltSenha() {
		return this.usDtAltSenha;
	}

	public void setUsDtAltSenha(Date usDtAltSenha) {
		this.usDtAltSenha = usDtAltSenha;
	}

	public Boolean getUsBloqueado() {
		return this.usBloqueado;
	}

	public void setUsBloqueado(Boolean usBloqueado) {
		this.usBloqueado = usBloqueado;
	}

	public Integer getUsQntErro() {
		return this.usQntErro;
	}

	public void setUsQntErro(Integer usQntErro) {
		this.usQntErro = usQntErro;
	}

}
