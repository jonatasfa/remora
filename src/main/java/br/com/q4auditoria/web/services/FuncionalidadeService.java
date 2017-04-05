package br.com.q4auditoria.web.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.q4auditoria.web.daos.interfaces.IFuncionalidadeDao;
import br.com.q4auditoria.web.models.FuncionalidadeEntity;
import br.com.q4auditoria.web.services.interfaces.IFuncionalidadeService;
import br.com.q4auditoria.web.utils.GenericService;
import br.com.q4auditoria.web.utils.IGenericDao;

@Named
public class FuncionalidadeService extends GenericService<FuncionalidadeEntity, Long> implements IFuncionalidadeService {

	@Inject
	private IFuncionalidadeDao funcionalidadeDao;
	
	@Override
	protected IGenericDao<FuncionalidadeEntity, Long> getConcreteDao() {
		return this.funcionalidadeDao;
	}

}
