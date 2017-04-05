package br.com.q4auditoria.web.daos;

import javax.inject.Named;

import br.com.q4auditoria.web.daos.interfaces.IAcaoDao;
import br.com.q4auditoria.web.models.AcaoEntity;
import br.com.q4auditoria.web.utils.GenericDao;

@Named
public class AcaoDao extends GenericDao<AcaoEntity, Long> implements IAcaoDao {

}
