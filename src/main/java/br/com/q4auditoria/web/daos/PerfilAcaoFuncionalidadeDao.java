package br.com.q4auditoria.web.daos;

import javax.inject.Named;

import br.com.q4auditoria.web.daos.interfaces.IPerfilAcaoFuncionalidadeDao;
import br.com.q4auditoria.web.models.PerfilAcaoFuncionalidadeEntity;
import br.com.q4auditoria.web.utils.GenericDao;

@Named
public class PerfilAcaoFuncionalidadeDao extends GenericDao<PerfilAcaoFuncionalidadeEntity, Long> implements IPerfilAcaoFuncionalidadeDao {

}
