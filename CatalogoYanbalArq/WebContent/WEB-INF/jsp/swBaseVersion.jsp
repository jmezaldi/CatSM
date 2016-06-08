<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
							<td><a href="">Ir</a></td>
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