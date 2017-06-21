<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>record the pay</title>
<link rel="stylesheet" type="text/css" href="css/jquery-ui.min.css">
<link type="text/css" href="css/jquery-ui-timepicker-addon.min.css"
	rel="stylesheet" />

</head>
<body>
	<form action="record.action" method="post">
		<table>
			<tr>
				<td>record the payment</td>
			</tr>
		</table>
		<table>
			<tr>
				<th>付款支付方式：</th>
				<td><s:select name="payment.paytype" list="PayType"></s:select></td>
			</tr>
			<tr>
				<th>付款对象：</th>
				<td><s:select name="payment.paywhat" list="PayWhat"></s:select></td>
			</tr>
			<tr>
				<th>付款金额：</th>
				<td><s:textfield name="payment.money" /></td>
			</tr>
			<tr>
				<th>付款地点：</th>
				<td><s:textfield name="payment.place" /></td>
			</tr>
			<tr>
			<tr>
				<th>付款时间：</th>
				<td><s:textfield name="payment.paytime" class="ui_timepicker"
						id="paytime">
					</s:textfield></td>
			</tr>
			<tr>
				<th>备注：</th>
				<td><s:textarea  name="payment.remark" cols="40" rows="10"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交"></td>
			</tr>
		</table>
		<div>跳转:<a href="list.action">list</a></div>
	</form>
</body>
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/jquery-ui.min.js"></script>
<script type="text/javascript"
	src="js/jquery-ui-timepicker-addon.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-timepicker-zh-CN.js"></script>
<script>
	$(function() {
		$("#paytime").datetimepicker({
			dateFormat : "yy-mm-dd",
			showSecond : true,
			timeFormat : 'hh:mm:ss'

		});
	});

	
</script>
</html>
