/**
 * 
 */
package com.bjtu.sample.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Downpour
 */
public class GenericDaoSupport {
	
	private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	/**
	 * Save entity using current session
	 * 
	 * @param entity
	 * @return
	 */
	public Serializable save(Object entity) {
		return sessionFactory.getCurrentSession().save(entity);
	}

	/**
	 * Update entity using current session
	 * 
	 * @param entity
	 */
	public void update(Object entity) {
		sessionFactory.getCurrentSession().update(entity);
	}

	/**
	 * Save or update entity using current session
	 * 
	 * @param entity
	 */
	public void saveOrUpdate(Object entity) {
		sessionFactory.getCurrentSession().saveOrUpdate(entity);
	}

	/**
	 * Delete entity using current session
	 * 
	 * @param entity
	 */
	public void delete(Object entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}

	/**
	 * Delete entity according to persistentClass and primary key using current
	 * session
	 * 
	 * @param <T>
	 * @param persistentClass
	 * @param id
	 */
	public <T> void delete(Class<T> persistentClass, Serializable id) {
		delete(load(persistentClass, id));
	}

	/**
	 * Load entity according to persistentClass and primary key using current
	 * session
	 * 
	 * @param <T>
	 * @param persistentClass
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> T load(Class<T> persistentClass, Serializable id) {
		return (T) sessionFactory.getCurrentSession().load(persistentClass, id);
	}

	/**
	 * Load all the entities according to persistentClass using current session
	 * 
	 * @param <T>
	 * @param persistentClass
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> List<T> loadAll(Class<T> persistentClass) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(persistentClass);
		return criteria.list();
	}

	/**
	 * Get entity according to persistentClass and primary key using current
	 * session
	 * 
	 * @param <T>
	 * @param persistentClass
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> T get(Class<T> persistentClass, Serializable id) {
		return (T) sessionFactory.getCurrentSession().get(persistentClass, id);
	}

	/**
	 * Search by hibernate for int result, using Map basic parameters. Mostly
	 * used for HQL like: 'SELECT count(*) ...'
	 * 
	 * @param sentence
	 * @param parameters
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public int searchForInt(final String sentence, final Map<String, Object> parameters) {

		Query query = sessionFactory.getCurrentSession().createQuery(sentence);
		query.setProperties(parameters);

		List result = query.list();

		// deal with the condition when hql contains group by
		return result.size() > 1 ? result.size() : ((Long) result.get(0)).intValue();
	}

	/**
	 * Search by hibernate for list result, using Map basic parameter.
	 * 
	 * @param sentence
	 * @param parameters
	 * @return
	 */
	@SuppressWarnings({ "rawtypes" })
	public List searchForList(final String sentence, final Map<String, Object> parameters) {
		Query query = sessionFactory.getCurrentSession().createQuery(sentence);
		query.setProperties(parameters);
		return query.list();
	}

	/**
	 * Search by hibernate for list result from beginIndex to the number of
	 * maxResult, using Map as basic parameter.
	 * 
	 * @param sentence
	 * @param parameters
	 * @param beginIndex
	 * @param maxResult
	 * @return
	 */
	@SuppressWarnings({ "rawtypes" })
	public List searchForList(final String sentence, final Map<String, Object> parameters, final int beginIndex, final int maxResult) {
		Query query = sessionFactory.getCurrentSession().createQuery(sentence);
		query.setFirstResult(beginIndex);
		query.setMaxResults(maxResult);
		query.setProperties(parameters);
		return query.list();
	}
	
}
