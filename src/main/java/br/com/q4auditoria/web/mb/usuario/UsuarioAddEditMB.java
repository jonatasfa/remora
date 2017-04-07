package br.com.q4auditoria.web.mb.usuario;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.q4auditoria.web.models.PerfilEntity;
import br.com.q4auditoria.web.models.UsuarioEntity;
import br.com.q4auditoria.web.services.interfaces.IPerfilService;
import br.com.q4auditoria.web.services.interfaces.IUsuarioService;
import br.com.q4auditoria.web.utils.BaseEntity;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "usuarioAddEditMB")
public class UsuarioAddEditMB extends BaseEntity {

	private static final long serialVersionUID = -8377776255414403983L;
	
	@Inject
	private IUsuarioService usuarioService;
	
	@Inject
	private IPerfilService perfilService;
	
	@Inject
	private UsuarioMB mbUsuarioBean;
	
	private UsuarioEntity usuario;
	
	private String title;
	
	private List<PerfilEntity> listaPerfil;
	 
	public UsuarioAddEditMB(){
		this.usuario = new UsuarioEntity();
	}
	
	public UsuarioEntity getUsuario(){
		return this.usuario;
	}
	
	public void add(){
		this.title = "Adicionar";
	}
	
	public void update(){
		this.usuario = this.mbUsuarioBean.getSelectedUsuario();
		this.title = "Alterar";
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void save(){
		if (this.usuario.getId() != null){			
			this.usuarioService.insert(usuario);
		}else{
			this.usuarioService.update(usuario);
		}
	}

	public List<PerfilEntity> getListaPerfil() {
		this.listaPerfil = perfilService.findAll();
		return listaPerfil;
	}

	public void setListaPerfil(List<PerfilEntity> listaPerfil) {
		this.listaPerfil = listaPerfil;
	}

}
