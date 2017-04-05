package br.com.q4auditoria.web.utils;

import java.io.Serializable;
import java.util.List;

public interface IGenericService<T extends BaseEntity, ID extends Serializable> {

	T findById(ID id);

	List<T> findAll();

	ID insert(T bean);

	void update(T bean);

	void delete(T bean);

}
