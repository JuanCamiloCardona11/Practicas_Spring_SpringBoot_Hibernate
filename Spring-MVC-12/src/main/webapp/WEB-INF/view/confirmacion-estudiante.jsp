<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmacion de ingreso de estudiante</title>
</head>
<body>

	<h2>Datos del estudiante: </h2>
	Nombre del nuevo estudiante: ${estudiante.nombre} <br>
	Apellido del nuevo estudiante: ${estudiante.apellido} <br>
	Edad del nuevo estudiante: ${estudiante.edad} <br>
	Pais de nacimiento: ${estudiante.nacionalidad} <br>
	Lenguaje de programacion favorito: ${estudiante.lengProgFavorito} <br>
	
	Sistemas Operativos que domina: 
	<ul>
		<c:forEach var="temp" items="${estudiante.sistemasOperativos}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
	
</body>
</html>