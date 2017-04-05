package br.com.q4auditoria.web.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.q4auditoria.web.daos.interfaces.IAcaoFuncionalidadeDao;
import br.com.q4auditoria.web.models.AcaoFuncionalidadeEntity;
import br.com.q4auditoria.web.services.interfaces.IAcaoFuncionalidadeService;
import br.com.q4auditoria.web.utils.GenericService;
import br.com.q4auditoria.web.utils.IGenericDao;

@Named
public class AcaoFuncionalidadeService extends GenericService<AcaoFuncionalidadeEntity, Long> implements IAcaoFuncionalidadeService {

	@Inject
	private IAcaoFuncionalidadeDao acaoFuncionalidadeDao;
	
	@Override
	protected IGenericDao<AcaoFuncionalidadeEntity, Long> getConcreteDao() {
		return this.acaoFuncionalidadeDao;
	}

}
