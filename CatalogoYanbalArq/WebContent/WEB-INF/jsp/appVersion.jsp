<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" pageEncoding="UTF-8" session="true" isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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

			<% String tituloPagina="Listado de Aplicaciones"; %>
			<%@include file="cabecera.inc" %>
		<c:if test="${!empty appVersiones}">
		
			<br />
			<div id="listado_p">
				<table id="example" width="100%" class="display compact" >
				   <thead>
					<tr style="background-color: #ed6c23;color:white !important;">
						<th>Id</th>
						<th>Nombre</th>
						<th>Versi&oacute;n</th>		
						<th>Criticidad</th>				
						<th>Exposici&oacute;n</th>
						<th>P&uacute;blico</th>
						<th>&Aacute;rea</th>
						<th>Custodio</th>
						<th>Tipo</th>		
						<th>Fecha Pase</th>
						<th align="left">Estado</th>							
						<th></th>
					</tr>
					</thead>
					<tfoot>
					<tr style="background-color: #ed6c23;color:white !important;">
						<th>Id</th>
						<th>Nombre</th>
						<th>Versi&oacute;n</th>		
						<th>Criticidad</th>				
						<th>Exposici&oacute;n</th>
						<th>P&uacute;blico</th>
						<th>&Aacute;rea</th>
						<th>Custodio</th>
						<th>Tipo</th>		
						<th>Fecha Pase</th>
						<th align="left">Estado</th>							
						<th></th>
					</tr>
					</tfoot>
					<tbody>
					<c:forEach items="${appVersiones}" var="appVersion">
						<tr  id="${appVersion.id}" onclick="setUpdateForm('${appVersion.id}');">
							<td ><c:out value="${appVersion.id}"/></td>
							<td><c:out value="${appVersion.nombre}"/></td>
							<td><c:out value="${appVersion.corVersion}"/></td>
							<td><c:out value="${appVersion.desCriticidad}"/></td>
							<td><c:out value="${appVersion.desExposicion}"/></td>
							<td><c:out value="${appVersion.desPublico}"/></td>
							<td><c:out value="${appVersion.desArea}"/></td>
							<td><c:out value="${appVersion.desCustodio}"/></td>	
							<td><c:out value="${appVersion.desTipoApp}"/></td>	
							<fmt:formatDate value="${appVersion.fechaVersion}" pattern="dd/MM/yyyy" var="newdatevar" />
							<td><c:out value="${newdatevar}"/></td>
							<td><c:choose><c:when test="${appVersion.estado==1}">Activo</c:when><c:otherwise>Inactivo</c:otherwise></c:choose></td>
							<td><a href="consulta?idApp=${appVersion.id}&corVer=${appVersion.corVersion}">Ir</a></td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				</div>
			<br />

		</c:if>

	</body>
</html>