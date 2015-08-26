<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title></title>
</head>
<body>
	
	<form method="post" action="/client">
		<table>
			<tr>
				<td><label>Nome:</label></td>
				<td><input type="text" name="name" id="name" /></td>
			</tr>
			<tr>
				<td><label>Sobrenome:</label></td>
				<td><input type="text" name="surname" id="surname" /></td>
			</tr>
			<tr>
				<td><label>Idade:</label></td>
				<td><input type="text" name="age" id="age" /></td>
			</tr>
		</table>
		<input type="submit" value="Salvar" />
	</form>

	<br>
	<br>
	<h1>Produtos</h1>
	<br>
	
</body>
</html>
