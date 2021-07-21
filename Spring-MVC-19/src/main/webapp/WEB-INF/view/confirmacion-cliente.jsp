<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmacion de ingreso de cliente</title>
</head>
<body>

	<h2>Datos del nuevo cliente: </h2>
	
	Nombre del nuevo cliente: ${cliente.nombre} <br>
	Apellido del nuevo cliente: ${cliente.apellido} <br>
	Edad del nuevo cliente: ${cliente.edad} <br>
	Codigo postal del nuevo cliente: ${cliente.codigoPostal} <br>
	Codigo matricula del nuevo cliente: ${cliente.codigoMatricula} <br>
	
</body>
</html>