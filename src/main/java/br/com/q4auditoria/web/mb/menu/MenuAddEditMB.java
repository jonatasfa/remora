package br.com.q4auditoria.web.mb.menu;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.q4auditoria.web.models.MenuEntity;
import br.com.q4auditoria.web.services.interfaces.IMenuService;
import br.com.q4auditoria.web.utils.BaseEntity;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "menuAddEditMB")
public class MenuAddEditMB extends BaseEntity {

	private static final long serialVersionUID = 3463835195986302468L;
	
	@Inject
	private IMenuService menuService;
	
	@Inject
	private MenuMB mbMenuBean;
	
	private MenuEntity menu;
	
	private String title;
	
	private List<MenuEntity> listaMenu;
	
	public MenuAddEditMB(){
		this.menu = new MenuEntity();
	}
	
	public MenuEntity getMenu(){
		return this.menu;
	}
	
	public void add(){
		this.title = "Adicionar";
	}
	
	public void update(){
		this.menu = this.mbMenuBean.getSelectedMenu();
		this.title = "Alterar";
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void save(){
		if (this.menu.getId() == null){
			this.menuService.insert(menu);
		}else{
			this.menuService.update(menu);
		}
	}
	
	public List<MenuEntity> getListaMenu(){
		this.listaMenu = menuService.findAll();
		return this.listaMenu;
	}

}
