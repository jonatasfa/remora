package br.com.q4auditoria.web.mb.funcionalidade;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.q4auditoria.web.models.FuncionalidadeEntity;
import br.com.q4auditoria.web.models.MenuEntity;
import br.com.q4auditoria.web.services.interfaces.IFuncionalidadeService;
import br.com.q4auditoria.web.services.interfaces.IMenuService;
import br.com.q4auditoria.web.utils.BaseEntity;

@Scope(value = WebApplicationContext.SCOPE_SESSION)
@Named(value = "funcionalidadeMB")
public class FuncionalidadeMB extends BaseEntity {

	private static final long serialVersionUID = 5730734087071058549L;

	private static final Logger logger = Logger.getLogger(FuncionalidadeMB.class);
	
	@Inject
	private IFuncionalidadeService funcionalidadeService;
	
	@Inject
	private IMenuService menuService;
	
	private List<FuncionalidadeEntity> listaFuncionalidade;
	
	private List<MenuEntity> listaMenu;
	
	private FuncionalidadeEntity selectedFuncionalidade;
	
	public FuncionalidadeMB(){	
	}
	
	public void delete(){
		if (this.selectedFuncionalidade != null){
			this.funcionalidadeService.delete(selectedFuncionalidade);
		}
	}
	
	public void onLoad(){
		this.listaFuncionalidade = this.funcionalidadeService.findAll();
	}
	
	public List<FuncionalidadeEntity> getListaFuncionalidade(){
		return this.listaFuncionalidade;
	}
	
	public List<MenuEntity> getListaMenu(){
		if (listaMenu == null){
			listaMenu = menuService.findAll();
		}		
		return listaMenu;
	}
	
	public void selectFuncionalidade(SelectEvent evt){
		try{
			if (evt.getObject() != null){
				this.selectedFuncionalidade = (FuncionalidadeEntity) evt.getObject();			
			}else{
				this.selectedFuncionalidade = null;
			}
		}catch (Exception e) {
			this.selectedFuncionalidade = null;			
			logger.error(e.getMessage(), e);
		}
	}
	
	public void unselectFuncionalidade(){
		this.selectedFuncionalidade = null;
	}
	
	public FuncionalidadeEntity getSelectedFuncionalidade(){
		return this.selectedFuncionalidade;
	}
	
	public void setSelectedFuncionalidade(FuncionalidadeEntity selectedFuncionalidade){
		this.selectedFuncionalidade = selectedFuncionalidade;
	}

}
