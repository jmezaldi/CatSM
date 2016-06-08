<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Catбlogo de Arquitectura</title>
		<link rel="stylesheet" type="text/css" href='<c:url value="/resources/jquery.dataTables.min.css"/>'>
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
		<script type="text/javascript" src='<c:url value="/resources/common.js"/>'></script>
		<script type="text/javascript" src='<c:url value="/resources/solucion.js"/>'></script>


	<script type="text/javascript" language="javascript" src='<c:url value="/resources/jquery-1.12.0.min.js"/>'></script>
	<script type="text/javascript" language="javascript" src='<c:url value="/resources/jquery.dataTables.min.js"/>'></script>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/estilo.css"/>'>
	<script type="text/javascript" class="init">
	
$(document).ready(function() {
	$('#example').DataTable( {
		"pagingType": "full_numbers",
		"columnDefs": [
            {
                
            }
        ]
	} );
	
} );

	</script>

		<script type="text/javascript">
			var projectUrl = '<c:url value="/"/>';
			if(projectUrl.indexOf(";", 0) != -1){
				projectUrl = projectUrl.substring(0, projectUrl.indexOf(";", 0));
			}
		</script>		

			<script type="text/javascript" class="init">
	


	</script>
	</head>
	<body>
		<fieldset>
			<% String tituloPagina="Listado de Servidores"; %>
			<%@include file="cabecera.inc" %>
		<center>
		<c:url var="post_ctx"  value="/" />

		</center>
		</fieldset>
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
						<th></th>						
					</tr>
					</tfoot>
					<tbody>
					<c:forEach items="${servidores}" var="servidor">
						<tr id="${servidor.id}" onclick="setUpdateForm('${servidor.id}');">
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