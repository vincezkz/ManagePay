<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="com.zkz.model.Payment"%>
<%@ page   import="java.util.*"  %>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
		
		
		<s:iterator value="payments">
				<tr>
					<td><s:property value="Paytype" /></td>
				<td><s:property value="Paywhat" /></td>
				<td><s:property value="Money" /></td>
				<td><s:property value="Place" /></td>
			    <td><s:property value="Paytime" /></td>
				<td><s:property value="Remark" /></td>
				</tr>

			</s:iterator>
		 
	</table>
</body>
</html>