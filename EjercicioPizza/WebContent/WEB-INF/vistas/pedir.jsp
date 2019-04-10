<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Titulo Pedir</title>
</head>
<body>
	<h1>Usuario: ${usuario}</h1>
	<form action="creaPedido" method="post"> 
		Direccion: <input type="text" name="direccion"
			placeholder="Direccion"> <br>
		<label>Size: </label> <br>
		<input type="radio" name="size"
			value="small"> Small<br> 
		<input type="radio" name="size"
			value="medium">Medium <br> 
		<input type="radio"
			name="size" value="large"> Large <br>
			
		<label>Ingredientes:</label> <br>
		<input type="checkbox" name="ingrediente" value="pineaple">Pineaple <br>
		<input type="checkbox" name="ingrediente" value="chesse">Chesse <br>
		<input type="checkbox" name="ingrediente" value="chicken">Chicken <br>
		<hr>
		<input type="submit" value="Pedir"/>
	</form>
</body>
</html>