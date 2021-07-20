<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario de Ingreso</title>
</head>
<body>
	<h1>Formulario de ingreso de estudiantes</h1>
	<hr>
	<form:form action="estudiante/procesarForm" modelAttribute="estudiante">
		Nombre: <form:input path="nombre"/>
		<br><br>
		Apellido: <form:input path="apellido"/>
		<br><br>
		Edad: <form:input path="edad"/>
		<br><br>
		Pais de nacimiento: 
		<form:select path="nacionalidad">
			<form:option value="Colombia" label="Colombia"/>
			<form:option value="Brazil" label="Brazil"/>
			<form:option value="Alemania" label="Alemania"/>
			<form:option value="EEUU" label="EEUU"/>
		</form:select>
		<br><br>
		Lenguaje de programacion favorito: 
		Java<form:select path="lengProgFavorito" value="Java"/> 
		C++<form:select path="lengProgFavorito" value="C++"/>
		PHP<form:select path="lengProgFavorito" value="PHP"/>
		JavaScript<form:select path="lengProgFavorito" value="JavaScript"/>
		<br><br>
		Sistemas Operativos que domina:
		Windows <form:checkbox path="sistemasOperativos" value="Windows"/>
		Mac OS<form:checkbox path="sistemasOperativos" value="Mac OS"/>
		Linux <form:checkbox path="sistemasOperativos" value="Linux"/>
		<br><br>
		<input type="submit" value="Enviar Datos">
		
	</form:form>
</body>
</html>