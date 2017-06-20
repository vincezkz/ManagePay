package com.zkz.dao;

import java.util.List;

import org.hibernate.*;

import com.zkz.model.User;

public class UserDao implements BaseDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List FindALL() {
		try {
			Session session = sessionFactory.openSession();
			String hql = "from User";
			Query<com.zkz.model.User> query = session.createQuery(hql);
			List<com.zkz.model.User> users = query.list();
			return users;
		} catch (Exception e) {
			throw e;
		}
	};

	@Override
	public User FindByAttr(String code) {
		try {
			return null;

		} catch (Exception e) {
			throw e;
		}
	}

	public Boolean UserIsExist(User user) {
		Boolean result = false;
		try {
			Session session = sessionFactory.openSession();
			String hql = "select count(*) from User u where u.username='" + user.getUsername()+"'";
			Long count = (Long) session.createQuery(hql).uniqueResult();
			if (count != 0) {
				result = true;
			}
			return result;
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	public Boolean VerfiyPassword(User user) {
		Boolean result = false;
		try {
			Session session = sessionFactory.openSession();
			String hql = "select  count(*) from User u where u.username='" + user.getUsername()+"' and u.password='"+user.getPassword()+"'";
			Long count = (Long) session.createQuery(hql).uniqueResult();
			if (count != 0) {
				result = true;
			}
			return result;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Boolean Insert(Object obj) {
		Boolean result = false;
		try {
			if (obj != null) {
				Session session = sessionFactory.openSession();
				Transaction tx = session.beginTransaction();
				session.saveOrUpdate(obj);
				tx.commit();
				result = true;
			}
		} catch (Exception e) {
			throw e;
		}
		return result;
	}
	
	
	public User GetOneUser(User user)
	{
		User entity=null;
		try {
			Session session = sessionFactory.openSession();
			String hql = "select u from User u where u.username='" + user.getUsername()+"' and u.password='"+user.getPassword()+"'";
			Query<com.zkz.model.User> query = session.createQuery(hql);
			List<com.zkz.model.User> users = query.list();
			if ( users.size() != 0) {
				entity=users.get(0);
			}
			return entity;
		} catch (Exception e) {
			throw e;
		}
	}
}
