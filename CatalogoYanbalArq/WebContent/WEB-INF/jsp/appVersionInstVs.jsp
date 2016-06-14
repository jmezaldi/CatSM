<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<body>
		<center>
		<div id="content">

				<table id="example" class="ybl" >
				   <thead>
					<tr style="background-color: #ed6c23; color:white !important;">
						<th colspan="2">Instalación Aplicación</th>
						<th>Base de Datos</th>
						<th colspan="2">Instalación Base de Datos</th>
					</tr>
					</thead>      					
					<tfoot>
					<tbody>
					<c:forEach items="${instalaciones}" var="inst">
						<tr>
							<td><c:out value="${inst.tipoInstApp}"/></td>		
							<td><c:out value="${inst.nombreInstApp}"/></td>
							<td><c:out value="${inst.nombreBD}"/></td>
							<td><c:out value="${inst.tipoInstBD}"/></td>		
							<td><c:out value="${inst.nombreInstBD}"/></td>
						</tr>
					</c:forEach>      					
					</tbody>
					</table>


	</div>
	</center>
	</body>
</html>