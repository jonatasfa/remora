package br.com.q4auditoria.web.services.interfaces;

import br.com.q4auditoria.web.models.UsuarioEntity;
import br.com.q4auditoria.web.utils.IGenericService;

public interface IUsuarioService extends IGenericService<UsuarioEntity, Long> {

	public UsuarioEntity findByLogin(String login);
}
