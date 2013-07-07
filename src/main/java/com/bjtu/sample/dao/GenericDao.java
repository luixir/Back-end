package com.bjtu.sample.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class GenericDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Object object)
	{
		sessionFactory.getCurrentSession().save(object);
	}
	
	

}
