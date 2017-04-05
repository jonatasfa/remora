package br.com.q4auditoria.web.daos;

import javax.inject.Named;

import org.apache.log4j.Logger;
import org.hibernate.Query;

import br.com.q4auditoria.web.daos.interfaces.IUsuarioDao;
import br.com.q4auditoria.web.models.UsuarioEntity;
import br.com.q4auditoria.web.utils.GenericDao;

@Named
public class UsuarioDao extends GenericDao<UsuarioEntity, Long> implements IUsuarioDao {
	
	private final Logger logger = Logger.getLogger(UsuarioDao.class);
	
	public UsuarioEntity findByLogin(String login){
		
		UsuarioEntity retorno = null;
		
		try{
			
			Query queryHql = this.getSession().createQuery(String.format("SELECT u FROM UsuarioEntity u WHERE u.usLogin = '%s'", login));
			queryHql.setMaxResults(1);
			
			retorno = (UsuarioEntity) queryHql.uniqueResult();
			
		}catch (Exception e) {
			retorno = null;
			logger.error(e.getMessage());
		}
				
		return retorno;
	}
}
