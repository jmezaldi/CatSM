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
		<% String tituloPagina="Detalle Softwase Base"; %>
		<%@include file="cabecera.inc" %>

		<div id="contenido_p">
		<br>
			<table class="display">
				<tr><td class="rosa" >Nombre:</td><td><c:out value="${swBases.nombre}"/>&nbsp;&nbsp;</td>
				<td class="rosa">Versi&oacute;n:</td><td><c:out value="${swBases.version}"/>&nbsp<c:out value="${swBases.fix}"/></td></tr>
				<tr><td class="rosa" >Licenciado:</td><td ><c:out value="${swBases.licenciado}"/></td></tr>
				<tr><td class="rosa" >Fabricante:</td><td ><c:out value="${swBases.desFabricante}"/></td></tr>
				<fmt:formatDate value="${swBases.fechaFinSoporte}" pattern="dd/MM/yyyy" var="newdatevar" />
				<tr><td class="rosa" >Fecha Fin Soporte:</td><td ><c:out value="${newdatevar}"/></td></tr>
			</table>
			<br />
			<h2>Servidores asociados</h2>				
					<table id="example" class="ybl" >
				   <thead>
					<tr>
						<th>Id</th>
						<th>Nombre</th>					
						<th>Ambiente</th>		
						<th>Comentario</th>
						<th></th>
					</tr>
					</thead>
					<tbody>
					<c:forEach items="${servidores}" var="servidor">
						<tr id="${servidor.id}" onclick="setUpdateForm('${servidor.id}');">
							<td ><c:out value="${servidor.id}"/></td>
							<td><c:out value="${servidor.nombre}"/></td>
							<td><c:out value="${servidor.desAmbiente}"/></td>
							<td><c:out value="${servidor.comentarioInterno}"/></td>
							<td><a href='<c:url value="/"/>app/servidor/consulta?idServidor=${servidor.id}'>Ir</a></td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			<br />
			<h2>Aplicaciones asociadas</h2>				
				<table id="example" class="ybl" >
				   <thead>
					<tr>
						<th>Nombre</th>
						<th>Versi&oacute;n</th>	
						<th>Comentario</th>
						<th></th>
					</tr>
					</thead>      					
					<tfoot>
					<tbody>
					<c:forEach items="${apps}" var="app">
						<tr>
							<td><c:out value="${app.nombre}"/></td>
							<td><c:out value="${app.corVersion}"/></td>
							<td><c:out value="${app.comentario}"/></td>
							<td><a href='<c:url value="/"/>app/appVersion/consulta?idApp=${app.id}&corVer=${app.corVersion}'>Ir</a></td>				
						</tr>
					</c:forEach>      					
					</tbody>
					</table>
			<br />
			<h2>Base de Datos asociadas</h2>				
				<table id="example" class="ybl" >
				   <thead>
					<tr>
						<th>Nombre</th>
						<th>Versi&oacute;n</th>		
						<th>Datos Sensibles</th>				
						<th>Datos Personales</th>			
						<th></th>
					</tr>
					</thead>      					
					<tfoot>
					<tbody>
					<c:forEach items="${bds}" var="bd">
						<tr">
							<td><c:out value="${bd.nombre}"/></td>
							<td><c:out value="${bd.corVersion}"/></td>
							<td><c:out value="${bd.datSensibles}"/></td>
							<td><c:out value="${bd.datPersonales}"/></td>
							<td><a href='<c:url value="/"/>app/basedatosversion/consulta?id=${bd.id}&corVer=${bd.corVersion}'>Ir</a></td>			
						</tr>
					</c:forEach>      					
					</tbody>
				</table>


		</div>
	</body>
</html>