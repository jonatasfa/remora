package br.com.q4auditoria.web.daos;

import javax.inject.Named;

import br.com.q4auditoria.web.daos.interfaces.IMenuDao;
import br.com.q4auditoria.web.models.MenuEntity;
import br.com.q4auditoria.web.utils.GenericDao;

@Named
public class MenuDao extends GenericDao<MenuEntity, Long> implements IMenuDao {

}
