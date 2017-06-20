package com.zkz.convert;

import com.zkz.model.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Map;
import org.apache.struts2.util.StrutsTypeConverter;
import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class PaymentConverter extends DefaultTypeConverter {
	@Override
	// 从String转成其他类型
	public Object convertValue(Map context, Object value, Class toType) {
		if (toType == Payment.class) {
			String[] params = (String[]) value;
			Payment entity = new Payment();
			String paywhat = params[0].split(",")[0];
			String paytype = params[0].split(",")[1];
			entity.setPaywhat(PayWhatEnum.valueOf(paywhat));
			entity.setPaytype(PayTypeEnum.valueOf(paytype));
			entity.setMoney(new java.math.BigDecimal(params[0].split(",")[2]));
			entity.setPlace(params[0].split(",")[3]);
			entity.setPaytime(new Date(params[0].split(",")[4]));
			entity.setRemark(params[0].split(",")[4]);
			return entity;
		}
		else if(toType==String.class)
		{
			Payment entity = (Payment)value;
			return "<"+entity.getPaywhat()+","+entity.getPaytype()+","+entity.getMoney()+","+entity.getPlace()+","+entity.getPaytime()+","+entity.getRemark()+">";
		}
		else
		{
			return null;
		}
	}

}
