package com.zkz.dao;

import java.util.List;
import org.hibernate.*;
import com.zkz.model.Payment;

public class PayDao implements BaseDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List FindALL() {
		try {
			Session session = sessionFactory.openSession();
			String hql = "from Payment";
			Query<com.zkz.model.Payment> query = session.createQuery(hql);
			List<com.zkz.model.Payment> payments = query.list();
			return payments;
		} catch (Exception e) {
			throw e;
		}
	};

	@Override
	public Payment FindByAttr(String code) {
		try {
			return null;

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
}
