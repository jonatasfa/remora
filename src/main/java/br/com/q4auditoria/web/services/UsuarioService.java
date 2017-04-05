package br.com.q4auditoria.web.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.q4auditoria.web.daos.interfaces.IUsuarioDao;
import br.com.q4auditoria.web.models.UsuarioEntity;
import br.com.q4auditoria.web.services.interfaces.IUsuarioService;
import br.com.q4auditoria.web.utils.GenericService;
import br.com.q4auditoria.web.utils.IGenericDao;

@Named
public class UsuarioService extends GenericService<UsuarioEntity, Long> implements IUsuarioService {

	@Inject
	private IUsuarioDao usuarioDao;
	
	@Override
	protected IGenericDao<UsuarioEntity, Long> getConcreteDao() {
		return this.usuarioDao;
	}

	@Override
	public UsuarioEntity findByLogin(String login) {
		return this.usuarioDao.findByLogin(login);
	}

}
