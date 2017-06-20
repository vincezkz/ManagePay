package com.zkz.model;

public enum PayTypeEnum {
	zhifupay("支付宝"),
	weixinpay("微信"),
	cash("现金"),
	creditcard("信用卡");
	
    private String name;
    private PayTypeEnum(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}