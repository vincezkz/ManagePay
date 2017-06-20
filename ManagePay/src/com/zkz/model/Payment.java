package com.zkz.model;

import java.io.Serializable;
import java.util.Date;

public class Payment  implements Serializable{
	private int id;  
    private PayWhatEnum paywhat;  
    private Date paytime;  
    private String place;
    private java.math.BigDecimal money;
    private PayTypeEnum paytype;
    private String remark;
    public Payment() {}  
  
    public int getId() {  
        return id;  
    }  
  
    public void setId(int id) {  
        this.id = id;  
    }  
  
    public PayWhatEnum getPaywhat() {  
        return paywhat;  
    }  
  
    public void setPaywhat(PayWhatEnum paywhat) {  
        this.paywhat = paywhat;  
    }  
    
    public PayTypeEnum getPaytype() {  
        return paytype;  
    }  
  
    public void setPaytype(PayTypeEnum paytype) {  
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