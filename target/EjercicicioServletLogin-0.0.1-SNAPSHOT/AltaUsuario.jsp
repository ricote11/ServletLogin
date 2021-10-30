<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Doble validacion</title>
	<meta charset="UTF-8">

	<script type="text/javascript">
		function validacion() {
			var pass1 = document.getElementById('pass1');
			var pass2 = document.getElementById('pass2');
			if(pass1.value != pass2.value){
				alert("Las contraseñas deben coincidir");
				return false;
			}else{
				
				location.reload();
			}
		}
	</script>
</head>
<body>
	<form id="formulario" action="servletAltaUsuario" method="post" class="center">
		<p>Usuario<input name="nombre" type="text" id="nombre"></p>
		<p>Contraseña <input name= "pass1" type="password" id="pass1"></p>
		<p>Repite la contraseña <input name= "pass2" type="password" id="pass2"></p>
		<p><input type="submit" name="send" value="Enviar" onclick="return validacion();"></p>
	</form>
</body>
</html>