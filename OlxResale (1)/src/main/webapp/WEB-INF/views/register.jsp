<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Registration</title>
</head>
<body>
	<h1>Registration Form</h1>
	<div align="center">
		<h1>Welcome to OlxResale Registration Page</h1>
		<form:form action="registration" method="post" modelAttribute="user"
			commandName="validationForm">
			<table border=1>
				<tr>
					<td>Name</td>
					<td><form:input type="text" path="name" style="width: 120px" /><font
						color="red"><form:errors path="name" /></font></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><form:input type="text" path="email" style="width: 120px" /><font
						color="red"><form:errors path="email" /></font></td>
				</tr>
				<tr>
					<td>mobileNumber</td>
					<td><form:input type="text" path="mobileNumber"
							style="width: 120px" /><font color="red"><form:errors
								path="mobileNumber" /></font></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password"
							style="width: 120px" /><font color="red"><form:errors
								path="password" /></font></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><form:input type="text" path="confirmPassword"
							style="width: 120px" /><font color="red"><form:errors
								path="confirmPassword" /></font></td>
				</tr>
				<tr>
					<td>Role Id</td>
					<td><form:select path="roleId" id="roleId"
							style="width: 127px">
							<option value=1>Seller</option>
							<option value=2>Customer</option>
							<option value=3>Admin</option>
						</form:select></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="Register"> <input type="reset" value="Reset">
						<a href="login">Login</a></td>
				</tr>
			</table>
			<input type="submit" value="Register">
		</form:form>
	</div>
</body>
</html>