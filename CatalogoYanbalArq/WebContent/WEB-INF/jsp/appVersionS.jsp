<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Hello World with Spring 3 MVC JM</title>
		<link rel="stylesheet" type="text/css" href='<c:url value="/resources/jquery.dataTables.min.css"/>'>
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
		<script type="text/javascript" src='<c:url value="/resources/common.js"/>'></script>
		<script type="text/javascript" src='<c:url value="/resources/solucion.js"/>'></script>


	<script type="text/javascript" language="javascript" src='<c:url value="/resources/jquery-1.12.0.min.js"/>'></script>
	<script type="text/javascript" language="javascript" src='<c:url value="/resources/jquery.dataTables.min.js"/>'></script>

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
		<legend>Aplicaciones</legend>
		<center>
		<c:url var="post_ctx"  value="/" />

		</center>
		</fieldset>
		<c:if test="${!empty appVersiones}">
		
			<br />
			<center>
				<table id="example" width="100%" class="display compact" >
				   <thead>
					<tr style="background-color: gray;">
						<th>Id</th>
						<th>Nombre</th>
						<th>Versi&oacute;n</th>		
						<th>Criticidad</th>				
						<th>Exposici&oacute;n</th>
						<th>&Aacute;rea</th>
						<th>Custodio</th>
						<th></th>
					</tr>
					</thead>
					<tfoot>
					<tr style="background-color: gray;">
						<th>Id</th>
						<th>Nombre</th>
						<th>Versi&oacute;n</th>
						<th>Criticidad</th>				
						<th>Exposici&oacute;n</th>
						<th>&Aacute;rea</th>
						<th>Custodio</th>
						<th></th>
					</tr>
					</tfoot>
					<tbody>
					<c:forEach items="${appVersiones}" var="appVersion">
						<tr style="background-color: silver;" id="${appVersion.id}" onclick="setUpdateForm('${appVersion.id}');">
							<td ><c:out value="${appVersion.id}"/></td>
							<td><c:out value="${appVersion.nombre}"/></td>
							<td><c:out value="${appVersion.corVersion}"/></td>
							<td><c:out value="${appVersion.desCriticidad}"/></td>
							<td><c:out value="${appVersion.desExposicion}"/></td>
							<td><c:out value="${appVersion.desArea}"/></td>
							<td><c:out value="${appVersion.desCustodio}"/></td>				
							<td><a href="consulta?idApp=${appVersion.id}&corVer=${appVersion.corVersion}">Ir</a></td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				</center>
			<br />

		</c:if>

	</body>
</html>