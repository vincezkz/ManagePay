package com.zkz.model;

public enum PayTypeEnum {
	zhifupay("֧����"),
	weixinpay("΢��"),
	cash("�ֽ�"),
	creditcard("���ÿ�");
	
    private String name;
    private PayTypeEnum(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}