package com.zkz.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.zkz.services.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.zkz.vo.*;
import com.zkz.model.*;
import com.zkz.until.*;

public class IndexAction extends ActionSupport {
	private PayServiceInterface service;
	private Map PayType;
	private Map PayWhat;
	private PaymentValue payment;
	private List payments;
	public void setService(PayServiceInterface service) {
		this.service = service;
	}

	public Map getPayWhat() {
		return this.PayWhat;
	}

	public void setPayment(PaymentValue payment) {
		this.payment = payment;
	}

	public PaymentValue getPayment() {
		return this.payment;
	}

	public void setPayWhat(Map PayWhat) {
		this.PayWhat = PayWhat;
	}

	public Map getPayType() {
		return this.PayType;
	}

	public void setPayType(Map PayType) {
		this.PayType = PayType;
	}

	
	public List getPayments() {
		return this.payments;
	}

	
	public void setPayments(List payments) {
		this.payments = payments;
	}	
	
	public String execute() throws Exception {

		try {
			Map mapPayType = new HashMap();
			for (int i = 0; i < PayTypeEnum.values().length; i++) {
				mapPayType.put(PayTypeEnum.values()[i].ordinal(), PayTypeEnum.values()[i].getName());
			}
			Map mapPayWhat = new HashMap();
			for (int i = 0; i < PayWhatEnum.values().length; i++) {
				mapPayWhat.put(PayWhatEnum.values()[i].ordinal(), PayWhatEnum.values()[i].getName());
			}
			setPayWhat(mapPayWhat);
			setPayType(mapPayType);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

	public String record() throws Exception {
		try {
			PaymentValue p = getPayment();
			Payment pentity = new Payment();
			pentity.setMoney(p.getMoney());
			pentity.setPaytime(p.getPaytime());
			pentity.setPaytype(p.getPaytype());
			pentity.setPaywhat(p.getPaywhat());
			pentity.setPlace(p.getPlace());
			pentity.setRemark(p.getRemark());
			Boolean result = service.Insert(pentity);
			if (result == true) {
				return SUCCESS;
			} else {
				return ERROR;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	
	
	public String list() throws Exception {
		try {
			List<com.zkz.model.Payment> query = service.GetPayments();
			//ActionContext ctx = ActionContext.getContext();
			//ValueStack vs=ctx.getValueStack();
			//vs.push(query);
			setPayments(query);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

	public void validateRecord() {
		if (payment.getMoney() == null) {
			addFieldError("payment.money", "money is required.");
		} else if (payment.getPaytime()==null) {
			addFieldError("payment.paytime", "time is required.");
		} else if (payment.getPlace() == "") {
			addFieldError("payment.place", "place is required.");
		} else if (payment.getRemark() == "") {
			addFieldError("payment.remark", "remark is required.");
		}
	}
}
