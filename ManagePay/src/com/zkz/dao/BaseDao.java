package com.zkz.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import java.util.List;
public interface BaseDao {
 
	
	public List FindALL();
	
	public Object FindByAttr(String attr);
	
	public Boolean Insert(Object obj);
	
 
	
}
