package com.zkz.model;

public enum PayWhatEnum {
	eat("�Է�"),
	webshopping("����"),
	shopping("����"),
	entertainment("������ˣ");
	
    private String name;
    private PayWhatEnum(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
