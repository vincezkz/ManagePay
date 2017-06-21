<%@page import="com.zkz.model.Payment"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List</title>
</head>
<body>
	<table>
		<tr>
			<td>付款支付方式：</td>
			<td>付款对象：</td>
			<td>付款金额：</td>
			<td>付款地点：</td>
			<td>付款时间：</td>
			<td>备注：</td>
		</tr>
		<%List<Payment> query=(List<Payment>)[0]; %>
		<%for(int i=0;i<query.size();i++) { %>
			<tr>
				<td><%query.get(i).getPaytype();%></td>
				<td><%query.get(i).getPaywhat();%></td>
				<td><%query.get(i).getMoney();%></td>
				<td><%query.get(i).getPlace();%></td>
			    <td><%query.get(i).getPaytime();%></td>
				<td><%query.get(i).getRemark();%></td>
			</tr>
		<% } %>
	</table>
</body>
</html>