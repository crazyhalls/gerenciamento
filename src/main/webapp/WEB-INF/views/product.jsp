<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title></title>
</head>
<body>

	<form action="/product/${product.id }">
		" method="POST">
		<fieldset>
			<legend>Editar Produto</legend>

			<label for="name">Nome:</label> <input id="name" type="text"
				name="product.name" value="${product.name }" /> <label
				for="description">Descrição:</label>
			<textarea id="description" name="product.description">
        ${product.description }
      </textarea>

			<button type="submit" name="_method" value="PUT">Enviar</button>
		</fieldset>
	</form>


</body>
</html>
