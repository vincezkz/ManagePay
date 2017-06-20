package com.zkz.services;
import java.util.List;

import com.zkz.model.Payment;;
public interface PayServiceInterface {
	public List<Payment> GetPayments();
	
	public Boolean Insert(Payment payment);
	
}
