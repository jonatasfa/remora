package br.com.q4auditoria.web.mb.perfil;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.q4auditoria.web.models.PerfilEntity;
import br.com.q4auditoria.web.services.interfaces.IPerfilService;
import br.com.q4auditoria.web.utils.BaseEntity;

@Scope(value = WebApplicationContext.SCOPE_SESSION)
@Named(value = "perfilMB")
public class PerfilMB extends BaseEntity {

	private static final long serialVersionUID = 7389027102791571478L;
	
	public static final Logger logger = Logger.getLogger(PerfilMB.class);
	
	@Inject
	private IPerfilService perfilService;
	
	private List<PerfilEntity> listaPerfil;
	
	private PerfilEntity selectedPerfil;
	
	public PerfilMB(){
	}
	
	public void delete(){
		if (this.selectedPerfil != null){
			this.perfilService.delete(selectedPerfil);
		}
	}
	
	public void onLoad(){
		this.listaPerfil = this.perfilService.findAll();
	}
	
	public List<PerfilEntity> getListaPerfil(){
		return this.listaPerfil;
	}
	
	public void selectPerfil(SelectEvent evt){
		try{
			if (evt.getObject() != null){
				this.selectedPerfil = (PerfilEntity) evt.getObject();
			}else{
				this.selectedPerfil = null;
			}
		}catch (Exception e) {
			this.selectedPerfil = null;
			logger.error(e.getMessage(), e);
		}
	}
	
	public void unselectPerfil(){
		this.selectedPerfil = null;
	}

	public PerfilEntity getSelectedPerfil() {
		return selectedPerfil;
	}

	public void setSelectedPerfil(PerfilEntity selectedPerfil) {
		this.selectedPerfil = selectedPerfil;
	}
	
}
