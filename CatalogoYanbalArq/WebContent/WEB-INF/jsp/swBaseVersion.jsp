<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Catálogo de Arquitectura</title>
		<script type="text/javascript" language="javascript" src='<c:url value="/resources/jquery-1.12.0.min.js"/>'></script>
		<script type="text/javascript" language="javascript" src='<c:url value="/resources/jquery.dataTables.min.js"/>'></script>
		<script type="text/javascript" language="javascript" src='<c:url value="/resources/dataTables.buttons.min.js"/>'></script>
		<script type="text/javascript" language="javascript" src='<c:url value="/resources/jszip.min.js"/>'></script>
		<script type="text/javascript" language="javascript" src='<c:url value="/resources/buttons.html5.min.js"/>'></script>
		<script type="text/javascript" language="javascript" src='<c:url value="/resources/buttons.print.min.js"/>'></script>
		<!--estilos -->
		<link rel="stylesheet" type="text/css" href='<c:url value="/resources/jquery.dataTables.min.css"/>'>
		<link rel="stylesheet" type="text/css" href='<c:url value="/resources/buttons.dataTables.min.css"/>'>
		<link rel="stylesheet" type="text/css" href='<c:url value="/resources/estilo.css"/>'>

		<script type="text/javascript">
		$(document).ready(function() {
			$('#example').DataTable( {
				"pagingType": "full_numbers",
				"bPaginate": true,
				"bLengthChange": true,
				"columnDefs": [ ],
				 "dom": 'lBfrtip',
				 "buttons": [
					'excel'
				]
			} );
			
		} );
		</script>
	</head>
	<body>
			<% String tituloPagina="Listado de Software Base"; %>
			<%@include file="cabecera.inc" %>
		<center>
		<c:url var="post_ctx"  value="/" />

		</center>
		<c:if test="${!empty swBaseVersiones}">
		
			<br />
			<center>
				<div id="listado_p">			
				<table id="example" width="100%" class="display compact" >
				   <thead>
					<tr style="background-color: #ed6c23; color:white !important;">
						<th>Id</th>
						<th>Nombre</th>
						<th>Versi&oacute;n</th>		
						<th>Fix</th>				
						<th>Fin de Soporte </th>
						<th>Licenciado</th>
						<th>Fabricante</th>
						<th></th>
					</tr>
					</thead>      					
					<tfoot>
					<tr style="background-color: #ed6c23; color:white !important;">
						<th>Id</th>
						<th>Nombre</th>
						<th>Versi&oacute;n</th>		
						<th>Fix</th>				
						<th>Fin de Soporte </th>
						<th>Licenciado</th>
						<th>Fabricante</th>
						<th></th>
					</tr>
					</tfoot>
					<tbody>
					<c:forEach items="${swBaseVersiones}" var="swBaseVersion">
						<tr id="${swBaseVersion.id}" onclick="setUpdateForm('${appVersion.id}');">
							<td ><c:out value="${swBaseVersion.id}"/></td>
							<td><c:out value="${swBaseVersion.nombre}"/></td>
							<td><c:out value="${swBaseVersion.version}"/></td>
							<td><c:out value="${swBaseVersion.fix}"/></td>
							<fmt:formatDate value="${swBaseVersion.fechaFinSoporte}" pattern="dd/MM/yyyy" var="newdatevar" />
							<td><c:out value="${newdatevar}"/></td>
							<td><c:out value="${swBaseVersion.licenciado}"/></td>
							<td><c:out value="${swBaseVersion.desFabricante}"/></td>				
							<td><a href='<c:url value="/"/>app/swBaseVersion/consulta?id=${swBaseVersion.id}&corVer=${swBaseVersion.corVersion}'>Ir</a></td>
						</tr>
					</c:forEach>
      					
					</tbody>
				</table>
				</div>
				</center>
			<br />

		</c:if>

	</body>
</html>