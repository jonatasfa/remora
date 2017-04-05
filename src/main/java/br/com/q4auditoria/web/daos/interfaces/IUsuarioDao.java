package br.com.q4auditoria.web.daos.interfaces;

import br.com.q4auditoria.web.models.UsuarioEntity;
import br.com.q4auditoria.web.utils.IGenericDao;

public interface IUsuarioDao extends IGenericDao<UsuarioEntity, Long> {

	public UsuarioEntity findByLogin(String login);
}
