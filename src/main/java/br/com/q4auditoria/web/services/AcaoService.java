package br.com.q4auditoria.web.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.q4auditoria.web.daos.interfaces.IAcaoDao;
import br.com.q4auditoria.web.models.AcaoEntity;
import br.com.q4auditoria.web.services.interfaces.IAcaoService;
import br.com.q4auditoria.web.utils.GenericService;
import br.com.q4auditoria.web.utils.IGenericDao;

@Named
public class AcaoService extends GenericService<AcaoEntity, Long> implements IAcaoService {

	@Inject
	private IAcaoDao acaoDao;
	
	@Override
	protected IGenericDao<AcaoEntity, Long> getConcreteDao() {
		return this.acaoDao;
	}

}
