package br.com.q4auditoria.web.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.q4auditoria.web.daos.interfaces.IPerfilAcaoFuncionalidadeDao;
import br.com.q4auditoria.web.models.PerfilAcaoFuncionalidadeEntity;
import br.com.q4auditoria.web.services.interfaces.IPerfilAcaoFuncionalidadeService;
import br.com.q4auditoria.web.utils.GenericService;
import br.com.q4auditoria.web.utils.IGenericDao;

@Named
public class PerfilAcaoFuncionalidadeService extends GenericService<PerfilAcaoFuncionalidadeEntity, Long> implements IPerfilAcaoFuncionalidadeService {

	@Inject
	private IPerfilAcaoFuncionalidadeDao perfilAcaoFuncionalidadeDao;
	
	@Override
	protected IGenericDao<PerfilAcaoFuncionalidadeEntity, Long> getConcreteDao() {
		return this.perfilAcaoFuncionalidadeDao;
	}

}
