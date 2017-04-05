package br.com.q4auditoria.web.utils;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.apache.log4j.Logger;

public abstract class GenericService<T extends BaseEntity, ID extends Serializable> implements IGenericService<T, ID> {

	private final Logger logger = Logger.getLogger(this.getClass());

	private final Class<T> typeOfEntity;

	private final Class<ID> typeOfKeyEntity;

	/////////////////////////////////////////////////////////////////////////////////
	// CONSTRUCTORS
	/////////////////////////////////////////////////////////////////////////////////

	@SuppressWarnings("unchecked")
	public GenericService() {
		try {
			ParameterizedType parameterizedType = (ParameterizedType)this.getClass().getGenericSuperclass();
			Type[] genericTypes = parameterizedType.getActualTypeArguments();

			this.logger.debug(genericTypes[0].getClass().getName());
			this.typeOfEntity = (Class<T>)genericTypes[0];
			this.typeOfKeyEntity = (Class<ID>)genericTypes[1];
		} catch (RuntimeException e) {
			this.logger.error(e.getMessage(), e);
			// Re-throw the exception.
			throw e;
		}

		if (this.logger.isInfoEnabled()) {
			this.logger.info(String.format("Creating a service with the entity [%s] and key [%s].",
					getTypeOfEntity(), getTypeOfKeyEntity()));
		}
	}

	/////////////////////////////////////////////////////////////////////////////////
	// ABSTRACT METHODS
	/////////////////////////////////////////////////////////////////////////////////

	protected abstract IGenericDao<T, ID> getConcreteDao();

	/////////////////////////////////////////////////////////////////////////////////
	// PUBLIC METHODS (IServiceBase)
	/////////////////////////////////////////////////////////////////////////////////

	@Override
	public T findById(ID id) {
		return this.getConcreteDao().findById(id);
	}

	@Override
	public List<T> findAll() {
		return this.getConcreteDao().findAll();
	}

	@Override
	public ID insert(T entity) {
		return getConcreteDao().save(entity);
	}

	@Override
	public void update(T entity) {
		this.getConcreteDao().update(entity);
	}

	@Override
	public void delete(T entity) {
		this.getConcreteDao().delete(entity);
	}

	/////////////////////////////////////////////////////////////////////////////////
	// PUBLIC METHODS
	/////////////////////////////////////////////////////////////////////////////////

	public final Class<T> getTypeOfEntity() {
		return this.typeOfEntity;
	}

	public final Class<ID> getTypeOfKeyEntity() {
		return this.typeOfKeyEntity;
	}

}
