package br.com.q4auditoria.web.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.q4auditoria.web.daos.interfaces.IPerfilDao;
import br.com.q4auditoria.web.models.PerfilEntity;
import br.com.q4auditoria.web.services.interfaces.IPerfilService;
import br.com.q4auditoria.web.utils.GenericService;
import br.com.q4auditoria.web.utils.IGenericDao;

@Named
public class PerfilService extends GenericService<PerfilEntity, Long> implements IPerfilService {

	@Inject
	private IPerfilDao prfilDao;
	
	@Override
	protected IGenericDao<PerfilEntity, Long> getConcreteDao() {
		return this.prfilDao;
	}

}
