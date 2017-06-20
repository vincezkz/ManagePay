package com.zkz.services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zkz.dao.BaseDao;
import com.zkz.model.Payment;

public class PayService implements PayServiceInterface{
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}


	@Override
	public List<Payment> GetPayments()
	{
		return dao.FindALL();
	}
	
	public Boolean Insert(Payment payment)
	{
		return dao.Insert(payment);
	}
	
}
