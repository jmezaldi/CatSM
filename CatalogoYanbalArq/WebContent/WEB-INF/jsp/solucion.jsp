<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" pageEncoding="UTF-8" session="true" isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Cat&aacute;logo de Arquitectura</title>
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
			<% String tituloPagina="Listado de Soluciones"; %>
			<%@include file="cabecera.inc" %>
		<c:if test="${!empty soluciones}">		
			<br />
			<div id="listado_p">
				<table id="example" width="100%" class="display " >
				   <thead>
					<tr style="background-color: #ed6c23;color:white !important;">
						<th>Id</th>
						<th>Nombre</th>
						<th>Descripci&oacute;n</th>
						<th>Vertical</th>
						<th>&Aacute;mbito</th>
						<th>Tipo</th>
						<th>&Aacute;rea</th>	
						<th>Estado</th>	
						<th></th>
					</tr>
					</thead>
					<tfoot>
					<tr style="background-color: #ed6c23; color:white !important;">
						<th>Id</th>
						<th>Nombre</th>
						<th>Descripci&oacute;n</th>
						<th>Vertical</th>
						<th>&Aacute;mbito</th>
						<th>Tipo</th>
						<th>&Aacute;rea</th>	
						<th>Estado</th>
						<th></th>
					</tr>
					</tfoot>
					<tbody>

					<c:forEach items="${soluciones}" var="solucion">
						<tr id="${solucion.id}" onclick="setUpdateForm('${solucion.id}','${solucion.estado}');">
							<td ><c:out value="${solucion.id}"/></td>
							<td><c:out value="${solucion.nombre}"/></td>
							<td><c:out value="${solucion.descripcion}"/></td>
							<td><c:out value="${solucion.desVertical}"/></td>
							<td><c:out value="${solucion.desAmbito}"/></td>
							<td><c:out value="${solucion.desTipo}"/></td>
							<td><c:out value="${solucion.desArea}"/></td>
							<td><c:choose><c:when test="${solucion.estado==1}">Activo</c:when><c:otherwise>Inactivo</c:otherwise></c:choose></td>
							<td><a href="appVersion/show?idSolucion=${solucion.id}">Ir</a></td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				</div>
			<br />
		</c:if>
	</body>
</html>