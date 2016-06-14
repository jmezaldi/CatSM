<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<body>
		<center>
		<div id="content">

				<h2>Aplicaciones que utiliza:</h2>	
				<table id="example" class="ybl" >
				   <thead>
					<tr style="background-color: #ed6c23; color:white !important;">
						<th>Id</th>
						<th>Nombre</th>
						<th>Relación</th>
						<th>Comentario</th>
						<th></th>
					</tr>
					</thead>      					
					<tfoot>
					<tbody>
					<c:forEach items="${appHijo}" var="hijo">
						<tr>
							<td><c:out value="${hijo.id}"/></td>		
							<td><c:out value="${hijo.nombre}"/></td>
							<td><c:out value="${hijo.desRelacion}"/></td>
							<td><c:out value="${hijo.comentario}"/></td>
							<td><a href='<c:url value="/"/>app/appVersion/consulta?idApp=${hijo.id}&corVer=${hijo.corVersion}'>Ir</a></td>
						</tr>
					</c:forEach>      					
					</tbody>
					</table>
				<h2>Donde se utiliza:</h2>	
				<table id="example" class="ybl" >
				   <thead>
					<tr style="background-color: #ed6c23; color:white !important;">
						<th>Id</th>
						<th>Nombre</th>
						<th>Relación</th>
						<th>Comentario</th>
						<th></th>
					</tr>
					</thead>      					
					<tfoot>
					<tbody>
					<c:forEach items="${appPadre}" var="padre">
						<tr>
							<td><c:out value="${padre.id}"/></td>		
							<td><c:out value="${padre.nombre}"/></td>
							<td><c:out value="${padre.desRelacion}"/></td>
							<td><c:out value="${padre.comentario}"/></td>
							<td><a href='<c:url value="/"/>app/appVersion/consulta?idApp=${padre.id}&corVer=${padre.corVersion}'>Ir</a></td>
						</tr>
					</c:forEach>      					
					</tbody>
					</table>

	</div>
	</center>
	</body>
</html>