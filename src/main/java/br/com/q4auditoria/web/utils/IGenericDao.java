package br.com.q4auditoria.web.utils;

import java.io.Serializable;
import java.util.List;

public interface IGenericDao<T extends BaseEntity, ID extends Serializable> {

	T findById(ID id);

	List<T> findAll();

	ID save(T entity);

	void update(T entity);

	void delete(T entity);

}
