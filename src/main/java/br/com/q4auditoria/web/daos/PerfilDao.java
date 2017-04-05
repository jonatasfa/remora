package br.com.q4auditoria.web.daos;

import javax.inject.Named;

import br.com.q4auditoria.web.daos.interfaces.IPerfilDao;
import br.com.q4auditoria.web.models.PerfilEntity;
import br.com.q4auditoria.web.utils.GenericDao;

@Named
public class PerfilDao extends GenericDao<PerfilEntity, Long> implements IPerfilDao {

}
