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
		<input type="submit" value="Enviar Datos">
	</form:form>
</body>
</html>