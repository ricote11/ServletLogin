<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
 <%@ include file="Cabecera.jsp" %>
<h1>Menu de opciones</h1>

<form action="" method="post">
			<p class="center">
				<button type="submit" formaction="AltaRol.jsp">Dar de alta un nuevo rol</button>
				<button type="submit" formaction="VerRol.jsp">Ver listado de roles</button>	
				<button type="submit" formaction="AltaUsuario.jsp">Dar de alta nuevo usuario</button>				
			</p>
		</form>	
			<%@ include file="PiePagina.jsp" %>
</body>
</html>