<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Registration</title>
</head>
<body>

	<div align="center">
		<h1>Welcome to Registration Page</h1>
		<form:form action="registration" method="post" modelAttribute="user">
			<table border=1>
				<tr>
					<td>Aadhaar Number</td>
					<td><form:input type="text" path="aadhaarNumber"
						style="width: 120px"/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password"
						style="width: 120px"/></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input type="password" name="confirmpassword"
						style="width: 120px"/></td>
				</tr>
				<tr>
					<td>Role</td>
					<td><form:select path="roleId" id="roleId" style="width: 127px">
							<option value=1>User</option>
							<option value=2>Role</option>
					</form:select></td>
				</tr>

			</table>
			<input type="submit" value="Register">
		</form:form>
	</div>
</body>
</html>