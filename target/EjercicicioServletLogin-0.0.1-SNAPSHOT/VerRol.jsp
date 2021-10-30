<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*, daos.*, tablas.*" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%-- --%>
 <%@ include file="Cabecera.jsp" %>
<%!
		
			
			List<Roles> rolesList = RolDao.getListaRoles();%>
<%
		
			pageContext.setAttribute("rolesList", rolesList);
			 %>
			 <h2>Listado de roles</h2>
			 <table border="2">
				<tr>
				
				    <th>Id</th>
				    <th>Descripción</th>
				
			    </tr>
			    <c:forEach items="${pageScope.rolesList}" var="roles" varStatus="status" begin="0" end="${pageScope.rolesList.size() - 1}">
			        <tr>
			        	
			            <td><c:out value="${roles.id}"></c:out></td>
			            <td><c:out value="${roles.rol}"></c:out></td>
			                  
			        </tr>
			    </c:forEach>
			</table>
	<%@ include file="PiePagina.jsp" %>
</body>
</html>