<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<% String tituloPagina="Listado de Servidores"; %>
			<%@include file="cabecera.inc" %>
		<c:if test="${!empty servidores}">
		
			<br />
			<center>
				<div id="listado_p">
				<table id="example" width="100%" class="display compact" >
				   <thead>
					<tr style="background-color: #ed6c23; color:white !important;">
						<th>Id</th>
						<th>Nombre</th>
						<th>Procesador</th>
						<th>#</th>			
						<th>Memoria</th>										
						<th>Serial</th>						
						<th>Ambiente</th>		
						<th>Tipo</th>				
						<th>Ubicaci&oacute;n</th>
						<th>Contrato</th>
						<th>Tecnolog&iacute;a</th>
						<th>Responsable</th>
						<th>Comentario</th>
						<th>Estado</th>
						<th></th>
					</tr>
					</thead>
					<tfoot>
					<tr style="background-color: #ed6c23; color:white !important;">
						<th>Id</th>
						<th>Nombre</th>
						<th>Procesador</th>
						<th>#</th>			
						<th>Memoria</th>										
						<th>Serial</th>						
						<th>Ambiente</th>		
						<th>Tipo</th>				
						<th>Ubicaci&oacute;n</th>
						<th>Contrato</th>
						<th>Tecnolog&iacute;a</th>
						<th>Responsable</th>
						<th>Comentario</th>	
						<th>Estado</th>						
						<th></th>						
					</tr>
					</tfoot>
					<tbody>
					<c:forEach items="${servidores}" var="servidor">
						<tr>
							<td ><c:out value="${servidor.id}"/></td>
							<td><c:out value="${servidor.nombre}"/></td>
							<td><c:out value="${servidor.procesador}"/></td>
							<td><c:out value="${servidor.numeroProcesador}"/></td>
							<td><c:out value="${servidor.memoria}"/></td>
							<td><c:out value="${servidor.serial}"/></td>
							<td><c:out value="${servidor.desAmbiente}"/></td>
							<td><c:out value="${servidor.desTipoServidor}"/></td>
							<td><c:out value="${servidor.desUbicacionServidor}"/></td>
							<td><c:out value="${servidor.desTipoContrato}"/></td>
							<td><c:out value="${servidor.desTecnologia}"/></td>	
							<td><c:out value="${servidor.responsable}"/></td>
							<td><c:out value="${servidor.comentarioInterno}"/></td>
						    <td><c:choose><c:when test="${servidor.estado==1}">Activo</c:when><c:otherwise>Inactivo</c:otherwise></c:choose></td>
							<td><a href='<c:url value="/"/>app/servidor/consulta?idServidor=${servidor.id}'>Ir</a></td>
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