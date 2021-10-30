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
		
			
			List<Categorias> categoriaList = CategoriasDao.getListaCategorias();%>
<%
		
			pageContext.setAttribute("categoriaList", categoriaList);
			 %>
			 <h2>Listado de categorias</h2>
			 <table border="2">
				<tr>
				
				    <th>Id</th>
				    <th>Nombre</th>
				    <th>Descripcion</th>
				
			    </tr>
			    <c:forEach items="${pageScope.categoriaList}" var="categorias" varStatus="status" begin="0" end="${pageScope.categoriaList.size() - 1}">
			        <tr>
			        	
			            <td><c:out value="${categorias.id}"></c:out></td>
			            <td><c:out value="${categorias.nombre}"></c:out></td>
			            <td><c:out value="${categorias.descripcion}"></c:out></td>
			                  
			        </tr>
			    </c:forEach>
			</table>
	<%@ include file="PiePagina.jsp" %>
</body>
</html>