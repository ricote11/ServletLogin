<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="footerText center">
			
			<!-- <div>Navegador de la petición =&nbsp<%= request.getHeader("user-agent") %></div>  -->
			<div>Lenguaje de la petición =&nbsp<%= request.getLocale() %></div>
			<div>Todos los derechos reservados.&nbsp<a href="https://policies.google.com/privacy?hl=es">Politica de privacidad</a></div>
		</div>

</body>
</html>