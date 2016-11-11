<!DOCTYPE html>
<html>
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
	<body>
		<center>
		<div id="content">
					<table id="example" class="ybl" >
				   <thead>
					<tr style="background-color: #ed6c23; color:white !important;">
						<th>Unidad de Negocio</th>
						<th colspan="2">Instalación Aplicación</th>
					</tr>
					</thead>      					
					<tbody>
					<c:forEach items="${instalaciones}" var="inst">
						<tr>
							<td><c:out value="${inst.nombreUN}"/></td>		
							<td><c:out value="${inst.tipoInstalacion}"/></td>
							<td><c:out value="${inst.nombreInstalacion}"/></td>
						</tr>
					</c:forEach>      					
					</tbody>
					</table>
	</div>
	</center>
	</body>
</html>