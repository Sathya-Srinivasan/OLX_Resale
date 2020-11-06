<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<div align="center">
		<h1>Welcome to Login Page</h1>
		<form:form action="login" method="post" modelAttribute="login">
			<table border=1>
				<tr>
					<td>Email</td>
					<td><form:input type="text" path="email" style="width: 120px"
							placeholder="Enter your email" /><font color="red"><form:errors
								path="userId"></form:errors></font></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password"
							style="width: 120px" placeholder="Enter your password" /><font
						color="red"><form:errors path="password"></form:errors></font></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="Login"> <input type="reset" value="Reset">
						<a href="registration">Register</a></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>