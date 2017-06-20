package com.zkz.vo;

import java.io.Serializable;
import java.util.Date;

import com.zkz.model.PayTypeEnum;
import com.zkz.model.PayWhatEnum;

public class PaymentValue implements Serializable {
	private int id;
	private int paywhat;
	private Date paytime;
	private String place;
	private java.math.BigDecimal money;
	private int paytype;
	private String remark;

	public PaymentValue() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PayWhatEnum getPaywhat() {
		PayWhatEnum penum = null;
		for (int i = 0; i < PayWhatEnum.values().length; i++) {
			if (paywhat == PayWhatEnum.values()[i].ordinal()) {
				penum = PayWhatEnum.values()[i];
			}
		}
		return penum;
	}

	public void setPaywhat(int paywhat) {
		this.paywhat = paywhat;
	}

	public PayTypeEnum getPaytype() {
		PayTypeEnum penum = null;
		for (int i = 0; i < PayTypeEnum.values().length; i++) {
			if (paywhat == PayTypeEnum.values()[i].ordinal()) {
				penum = PayTypeEnum.values()[i];
			}
		}
		return penum;
	}

	public void setPaytype(int paytype) {
		this.paytype = paytype;
	}

	public Date getPaytime() {
		return paytime;
	}

	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public java.math.BigDecimal getMoney() {
		return money;
	}

	public void setMoney(java.math.BigDecimal money) {
		this.money = money;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
