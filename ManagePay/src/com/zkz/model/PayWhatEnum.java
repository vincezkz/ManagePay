package com.zkz.model;

public enum PayWhatEnum {
	eat("³Ô·¹"),
	webshopping("Íø¹º"),
	shopping("¹ºÎï"),
	entertainment("ÓéÀÖÍæË£");
	
    private String name;
    private PayWhatEnum(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
