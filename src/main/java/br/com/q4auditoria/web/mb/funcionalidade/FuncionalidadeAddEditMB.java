package br.com.q4auditoria.web.mb.funcionalidade;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.q4auditoria.web.models.FuncionalidadeEntity;
import br.com.q4auditoria.web.models.MenuEntity;
import br.com.q4auditoria.web.services.interfaces.IFuncionalidadeService;
import br.com.q4auditoria.web.services.interfaces.IMenuService;
import br.com.q4auditoria.web.utils.BaseEntity;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "funcionalidadeAddEditMB")
public class FuncionalidadeAddEditMB extends BaseEntity {

	private static final long serialVersionUID = -8755242630598014318L;
	
	@Inject
	private IFuncionalidadeService funcionalidadeService;
	
	@Inject
	private IMenuService menuService;
	
	@Inject
	private FuncionalidadeMB mbFuncionalidadeBean;
	
	private FuncionalidadeEntity funcionalidade;
	
	private String title;
	
	private List<MenuEntity> listaMenu;
	
	public FuncionalidadeAddEditMB(){
		this.funcionalidade = new FuncionalidadeEntity();
	}
	
	public FuncionalidadeEntity getFuncionalidade(){
		return this.funcionalidade;
	}
	
	public void add(){
		this.title = "Adicionar";
	}
	
	public void update(){
		this.funcionalidade = mbFuncionalidadeBean.getSelectedFuncionalidade();
		this.title = "Alterar";
	}

	public String getTitle(){
		return this.title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void save(){
		if (this.funcionalidade != null){
			if (this.funcionalidade.getId() == null){
				this.funcionalidadeService.insert(this.funcionalidade);
			}else{
				this.funcionalidadeService.update(this.funcionalidade);
			}
		}
	}
		
	public List<MenuEntity> getListaMenu(){
		this.listaMenu = menuService.findAll();
		return this.listaMenu;
	}
}
