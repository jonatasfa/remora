package br.com.q4auditoria.web.mb.perfil;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.q4auditoria.web.models.PerfilEntity;
import br.com.q4auditoria.web.services.interfaces.IPerfilService;
import br.com.q4auditoria.web.utils.BaseEntity;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "perfilAddEditMB")
public class PerfilAddEditMB extends BaseEntity {

	private static final long serialVersionUID = -6629700432877283744L;
	
	@Inject
	private IPerfilService perfilService;
	
	@Inject
	private PerfilMB mbPerfilBean;
	
	private PerfilEntity perfil;
	
	private String title;
	
	public PerfilAddEditMB(){
		this.perfil = new PerfilEntity();
	}
	
	public PerfilEntity getPerfil(){
		return this.perfil;
	}
	
	public void add(){
		this.title = "Adicionar";
	}
	
	public void update(){
		this.perfil = this.mbPerfilBean.getSelectedPerfil();
		this.title = "Alterar";
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void save(){
		if (this.perfil.getId() == null){
			this.perfilService.insert(perfil);
		}else{
			this.perfilService.update(perfil);
		}
	}

}
