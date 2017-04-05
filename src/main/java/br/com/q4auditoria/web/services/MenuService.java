package br.com.q4auditoria.web.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.q4auditoria.web.daos.interfaces.IMenuDao;
import br.com.q4auditoria.web.models.MenuEntity;
import br.com.q4auditoria.web.services.interfaces.IMenuService;
import br.com.q4auditoria.web.utils.GenericService;
import br.com.q4auditoria.web.utils.IGenericDao;

@Named
public class MenuService extends GenericService<MenuEntity, Long> implements IMenuService {

	@Inject
	private IMenuDao menuDao;
	
	@Override
	protected IGenericDao<MenuEntity, Long> getConcreteDao() {
		return this.menuDao;
	}

}
