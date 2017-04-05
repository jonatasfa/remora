package br.com.q4auditoria.web.mb.usuario;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.q4auditoria.web.models.PerfilEntity;
import br.com.q4auditoria.web.models.UsuarioEntity;
import br.com.q4auditoria.web.services.interfaces.IPerfilService;
import br.com.q4auditoria.web.services.interfaces.IUsuarioService;
import br.com.q4auditoria.web.utils.BaseEntity;

@Scope(value = WebApplicationContext.SCOPE_SESSION)
@Named(value = "usuarioMB")
public class UsuarioMB extends BaseEntity {

	private static final long serialVersionUID = 7429991130552686215L;
	
	public static final Logger logger = Logger.getLogger(UsuarioMB.class);
	
	@Inject
	private IUsuarioService usuarioService;
	
	@Inject
	private IPerfilService perfilService;
	
	private List<UsuarioEntity> listaUsuario;
	
	private List<PerfilEntity> listaPerfil;
	
	private UsuarioEntity selectedUsuario;
	
	public UsuarioMB(){
	}
	
	public void delete(){
		if (this.selectedUsuario != null){
			this.usuarioService.delete(selectedUsuario);
		}
	}
	
	public void onLoad(){
		this.listaUsuario = this.usuarioService.findAll();
	}
	
	public List<UsuarioEntity> getListaUsuario(){
		return this.listaUsuario;
	}
	
	public List<PerfilEntity> getListaPerfil(){
		if (this.listaPerfil != null){
			this.listaPerfil = perfilService.findAll();
		}
		return this.listaPerfil;
	}
	
	public void selectUsuario(SelectEvent evt){
		try{
			if (evt.getObject() != null){
				this.selectedUsuario = (UsuarioEntity) evt.getObject();
			}else{
				this.selectedUsuario = null;
			}
		}catch (Exception e) {
			this.selectedUsuario = null;
			logger.error(e.getMessage(), e);
		}
	}
	
	public void unselectUsuario(){
		this.selectedUsuario = null;
	}

	public UsuarioEntity getSelectedUsuario() {
		return selectedUsuario;
	}

	public void setSelectedUsuario(UsuarioEntity selectedUsuario) {
		this.selectedUsuario = selectedUsuario;
	}

}
