package br.com.q4auditoria.web.mb.menu;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.q4auditoria.web.models.MenuEntity;
import br.com.q4auditoria.web.services.interfaces.IMenuService;
import br.com.q4auditoria.web.utils.BaseEntity;
@Scope(value = WebApplicationContext.SCOPE_SESSION)
@Named(value = "menuMB")
public class MenuMB extends BaseEntity {

	private static final long serialVersionUID = -6659581933608381917L;
	
	public static final Logger logger = Logger.getLogger(MenuMB.class);
	
	@Inject
	private IMenuService menuService;
	
	private List<MenuEntity> listaMenu;
	
	private MenuEntity selectedMenu;
	
	public MenuMB(){
	}
	
	public void delete(){
		if (this.selectedMenu != null){
			this.menuService.delete(selectedMenu);
		}
	}
	
	public void onLoad(){
		this.listaMenu = menuService.findAll();
	}
	
	public List<MenuEntity> getListaMenu(){
		return this.listaMenu;
	}
	
	public void selectMenu(SelectEvent evt){
		try{
			if (evt.getObject() != null){
				this.selectedMenu = (MenuEntity) evt.getObject();
			}else{
				this.selectedMenu = null;
			}
		}catch (Exception e) {
			this.selectedMenu = null;
			logger.error(e.getMessage(), e);
		}
	}
	
	public void unselectMenu(){
		this.selectedMenu = null;
	}

	public MenuEntity getSelectedMenu() {
		return selectedMenu;
	}

	public void setSelectedMenu(MenuEntity selectedMenu) {
		this.selectedMenu = selectedMenu;
	}

}
