<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>PEDIDO:</h1>
	<h3>Nombre: ${pedido.usuario }</h3>
	<h3>Direccion: ${pedido.direccion }</h3>
	<h3>Precio: ${pedido.precio}€</h3>
	<h3>${pizza}</h3>
</body>
</html>