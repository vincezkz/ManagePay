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
	<form action="login.action" method="post">
		<table>
			<tr>
				<td>User Login</td>
			</tr>
		</table>
		<table>
			<tr>
				<th>账号名称：</th>
				<td><s:textfield name="user.username" /></td>
			</tr>
		
			<tr>
				<th>密码：</th>
				<td><s:textfield name="user.password" type="password"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
<script src="js/jquery-3.2.1.min.js"></script>

</html>
