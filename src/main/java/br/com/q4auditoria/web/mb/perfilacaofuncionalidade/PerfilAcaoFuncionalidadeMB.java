package br.com.q4auditoria.web.mb.perfilacaofuncionalidade;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.q4auditoria.web.models.PerfilAcaoFuncionalidadeEntity;
import br.com.q4auditoria.web.services.interfaces.IPerfilAcaoFuncionalidadeService;
import br.com.q4auditoria.web.utils.BaseEntity;

@Scope(value = WebApplicationContext.SCOPE_SESSION)
@Named(value = "perfilAcaoFuncionalidadeMB")
public class PerfilAcaoFuncionalidadeMB extends BaseEntity {

	private static final long serialVersionUID = 4362013025445066895L;
	
	public static final Logger logger = Logger.getLogger(PerfilAcaoFuncionalidadeMB.class);
	
	@Inject
	private IPerfilAcaoFuncionalidadeService perfilAcaoFuncionalidadeService;
	
	private List<PerfilAcaoFuncionalidadeEntity> listaPerfilAcaoFuncionalidade;
	
	private PerfilAcaoFuncionalidadeEntity selectedPerfilAcaoFuncionalidade;
	
	public PerfilAcaoFuncionalidadeMB(){
	}
	
	public void detele(){
		if (this.selectedPerfilAcaoFuncionalidade != null){
			this.perfilAcaoFuncionalidadeService.delete(selectedPerfilAcaoFuncionalidade);
		}
	}
	
	public void onLoad(){
		this.listaPerfilAcaoFuncionalidade = this.perfilAcaoFuncionalidadeService.findAll();
	}
	
	public List<PerfilAcaoFuncionalidadeEntity> getListaPerfilAcaoFuncionalidade(){
		return this.listaPerfilAcaoFuncionalidade;
	}
	
	public void selectPerfilAcaoFuncionalidade(SelectEvent evt){
		try{
			if (evt.getObject() != null){
				this.selectedPerfilAcaoFuncionalidade = (PerfilAcaoFuncionalidadeEntity) evt.getObject();
			}else{
				this.selectedPerfilAcaoFuncionalidade = null;
			}
		}catch (Exception e) {
			this.selectedPerfilAcaoFuncionalidade = null;
			logger.error(e.getMessage(), e);
		}
	}
	
	public void unselectPerfilAcaoFuncionalidade(){
		this.listaPerfilAcaoFuncionalidade = null;
	}

	public PerfilAcaoFuncionalidadeEntity getSelectedPerfilAcaoFuncionalidade() {
		return selectedPerfilAcaoFuncionalidade;
	}

	public void setSelectedPerfilAcaoFuncionalidade(PerfilAcaoFuncionalidadeEntity selectedPerfilAcaoFuncionalidade) {
		this.selectedPerfilAcaoFuncionalidade = selectedPerfilAcaoFuncionalidade;
	}

}
