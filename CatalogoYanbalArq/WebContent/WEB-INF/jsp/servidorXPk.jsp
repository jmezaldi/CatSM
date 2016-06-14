<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
		<title>Catбlogo de Arquitectura</title>
		<link rel="stylesheet" type="text/css" href='<c:url value="/resources/jquery.dataTables.min.css"/>'>
		<link rel="stylesheet" type="text/css" href='<c:url value="/resources/jquery-1.12.0.ui.css"/>'>
		<script type="text/javascript" src='<c:url value="/resources/common.js"/>'></script>
		<script type="text/javascript" src='<c:url value="/resources/solucion.js"/>'></script>

	<script type="text/javascript" language="javascript" src='<c:url value="/resources/jquery-1.12.0.min.js"/>'></script>
	<script type="text/javascript" language="javascript" src='<c:url value="/resources/jquery-1.12.0.ui.min.js"/>'></script>
	<script type="text/javascript" language="javascript" src='<c:url value="/resources/jquery.dataTables.min.js"/>'></script>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/estilo.css"/>'>
		<script type="text/javascript">
			var projectUrl = '<c:url value="/"/>';
			if(projectUrl.indexOf(";", 0) != -1){
				projectUrl = projectUrl.substring(0, projectUrl.indexOf(";", 0));
			}
		</script>	
	<script type="text/javascript">
	$(document).ready(function() {
		$('#modal a').each(function() {
			var $link = $(this);

			$link.click(function() {

				var $dialog = $('<div></div>')
				.load($link.attr('href') +'&a='+Math.random()+ ' #content')
				.dialog({
					autoOpen: false,
					title: $link.attr('title'),
					width: 200
				});
				$dialog.dialog('open');

				return false;
			});
		});
	});
	</script>

	</head>
	<body>
		<% String tituloPagina="Detalle Servidor"; %>
		<%@include file="cabecera.inc" %>

		<div id="contenido_p">
		<br>
			<table class="display">
				<tr><td class="rosa" >Nombre:</td><td colspan="3"><c:out value="${servidor.nombre}"/></td><td><div id="modal"><a title="Ips Relacionadas" href='<c:url value="/"/>app/servidor/consultaIP?idServidor=${servidor.id}'>&#60;Ips Relacionadas&#62;</a></div></td></tr>
				<tr><td class="rosa">Procesador:</td><td><c:out value="${servidor.procesador}"/>&nbsp;&nbsp;&nbsp;</td><td class="rosa">Cantidad:</td><td><c:out value="${servidor.numeroProcesador}"/></td></tr>
				<tr><td class="rosa" >Memoria:</td><td colspan="5"><c:out value="${servidor.memoria}"/></td></tr>
				<tr><td class="rosa" >Serial:</td><td colspan="5"><c:out value="${servidor.serial}"/></td></tr>
				<tr><td class="rosa" >Responsable:</td><td colspan="5"><c:out value="${servidor.responsable}"/></td></tr>
				<tr><td class="rosa" >Ambiente:</td><td colspan="5"><c:out value="${servidor.desAmbiente}"/></td></tr>
				<tr><td class="rosa" >Ubicaciуn:</td><td colspan="5"><c:out value="${servidor.desUbicacionServidor}"/></td></tr>
				<tr><td class="rosa" >Tipo de Contrato:</td><td colspan="5"><c:out value="${servidor.desTipoContrato}"/></td></tr>
				<tr><td class="rosa" >Tipo Servidor:</td><td colspan="5"><c:out value="${servidor.desTipoServidor}"/></td></tr>
				<tr><td class="rosa" >Servidor Fнsico:</td><td colspan="5"><c:out value="${servidor.servidorFisico.nombre}"/>&nbsp;&nbsp;<a href='<c:url value="/"/>app/servidor/consulta?idServidor=${servidor.servidorFisico.id}'>Ir</a></td></tr>
				<tr><td class="rosa" >Tecnologнa:</td><td colspan="5"><c:out value="${servidor.desTecnologia}"/></td></tr>
				<tr><td class="rosa" >Comentario Interno:</td><td colspan="7"><c:out value="${servidor.comentarioInterno}"/></td></tr>
			</table>			<br />
			<h2>Software Base Instalado</h2>				
				<table id="example" class="ybl" >
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
					<tbody>
					<c:forEach items="${swbase}" var="swBaseVersion">
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
			<br />
			<h2>Aplicaciones Instaladas</h2>				
				<table id="example" class="ybl" >
				   <thead>
					<tr style="background-color: #ed6c23; color:white !important;">
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
			<h2>Base de Datos Instaladas</h2>				
				<table id="example" class="ybl" >
				   <thead>
					<tr style="background-color: #ed6c23; color:white !important;">
						<th>Nombre</th>
						<th>Versi&oacute;n</th>		
						<th>Datos Sensibles</th>				
						<th>Datos Personales</th>
						<th>Comentario</th>			
						<th>Nombre Fнsico</th>	
						<th>Descripciуn</th>
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
							<td><c:out value="${bd.comentario}"/></td>
							<td><c:out value="${bd.nomFisico}"/></td>
							<td><c:out value="${bd.descripcion}"/></td>
							<td><a href='<c:url value="/"/>app/basedatosversion/consulta?id=${bd.id}&corVer=${bd.corVersion}'>Ir</a></td>			
						</tr>
					</c:forEach>      					
					</tbody>
				</table>


		</div>
	</body>
</html>