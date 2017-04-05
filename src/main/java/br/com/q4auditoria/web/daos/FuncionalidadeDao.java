package br.com.q4auditoria.web.daos;

import javax.inject.Named;

import br.com.q4auditoria.web.daos.interfaces.IFuncionalidadeDao;
import br.com.q4auditoria.web.models.FuncionalidadeEntity;
import br.com.q4auditoria.web.utils.GenericDao;

@Named
public class FuncionalidadeDao extends GenericDao<FuncionalidadeEntity, Long> implements IFuncionalidadeDao {

}
