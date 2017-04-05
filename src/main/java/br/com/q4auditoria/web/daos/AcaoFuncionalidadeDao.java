package br.com.q4auditoria.web.daos;

import javax.inject.Named;

import br.com.q4auditoria.web.daos.interfaces.IAcaoFuncionalidadeDao;
import br.com.q4auditoria.web.models.AcaoFuncionalidadeEntity;
import br.com.q4auditoria.web.utils.GenericDao;

@Named
public class AcaoFuncionalidadeDao extends GenericDao<AcaoFuncionalidadeEntity, Long> implements IAcaoFuncionalidadeDao {

}
