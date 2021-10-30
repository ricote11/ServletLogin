<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header>
<%@ include file="Cabecera.jsp" %>
</header>
<form id="loginForm" action="servletAltaRol" method="post" class="center">
			<fieldset class="fontCalibri">
				<legend>Datos de acceso</legend>	
				<div>
					<label for="rol">rol</label>
					<input type="text" name="rol" id="rol" />
				</div>
				
				<div class="center">
					<input type="submit" value="Dar alta" id="button-login" />
				</div>
			</fieldset>
		</form>
		<footer>
			<%@ include file="PiePagina.jsp" %>
			</footer>

</body>
</html>