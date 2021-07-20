<!DOCTYPE html>
<html>
<head>
	<title>HolaMundo - Formulario</title>	
</head>
<body>
	<form method="GET" action="procesarFormulario">
		<label for="nombre">Nombre: </label>
		<input type="text" id="nombre" name="nombre">
		<input type="submit" value="Enviar Datos">
	</form>
	<p>Nota: Al enviar este formulario se producira un conflicto en las Request Paths</p>
</body>
</html>  