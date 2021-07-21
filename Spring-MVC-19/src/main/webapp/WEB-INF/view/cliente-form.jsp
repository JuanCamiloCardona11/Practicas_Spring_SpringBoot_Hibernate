<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Formulario de Ingreso - Clientes</title>
	<style> 
		.error {
			color: red;
			font-weight: 500;
		}
	</style>
</head>
<body>
	<h1>Formulario de ingreso de clientes</h1>
	<hr>
	<form:form action="cliente/procesarForm" modelAttribute="cliente">
		Nombre (*): <form:input path="nombre"/>
		<form:errors path="apellido" cssClass="error"/>
		<br><br>
		Apellido: <form:input path="apellido"/>
		<br><br>
		Edad (*): <form:input path="edad"/>
		<form:errors path="edad" cssClass="error"/> 
		<br><br>
		Codigo postal: <form:input path="codigoPostal"/>
		<form:errors path="codigoPostal" cssClass="error"/> 
		<br><br>
		Codigo matricula: <form:input path="codigoMatricula"/>
		<form:errors path="codigoMatricula" cssClass="error"/> 
		<br><br>
		<input type="submit" value="Enviar Datos">
	</form:form>
</body>
</html>