<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.time.*, java.time.format.*" %>
        <%@ page import="java.util.*, daos.*, tablas.*" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="headerText center">

	<%
		
	 
			 %>
 	<div>El nombre del usuario es : <c:out value="${nombreUsuario}"></c:out></div>
	<div>La hora del loggeo es: <c:out value="${hora}"></c:out></div>
	<form id="logout" action="servletCerrarSesion" method="post">
			<p class="">
				
			<button type="submit" value="Log out" id="button-logout" >Cerrar sesion</button>
	
				
			
			</p>
		</form >	
			<form action = "" method="post">

			<input type=<%= (request.getRequestURI().endsWith("Menu.jsp")) ? "hidden" : "button"%> value="Página anterior" onClick="history.go(-1);" >
			
			</form>	

	</div>
</body>
</html>