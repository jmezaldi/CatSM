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
		<link rel="stylesheet" type="text/css" href='<c:url value="/resources/jquery.dataTables.min.css"/>'>
		<link rel="stylesheet" type="text/css" href='<c:url value="/resources/jquery-1.12.0.ui.css"/>'>
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
		<script type="text/javascript" src='<c:url value="/resources/common.js"/>'></script>
		<script type="text/javascript" src='<c:url value="/resources/solucion.js"/>'></script>
		<script type="text/javascript" language="javascript" src='<c:url value="/resources/jquery-1.12.0.min.js"/>'></script>
		<script type="text/javascript" language="javascript" src='<c:url value="/resources/jquery-1.12.0.ui.min.js"/>'></script>
		<script type="text/javascript" language="javascript" src='<c:url value="/resources/jquery.dataTables.min.js"/>'></script>
		<link rel="stylesheet" type="text/css" href='<c:url value="/resources/estilo.css"/>'>

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
					width: 600
				});
				$dialog.dialog('open');

				return false;
			});
		});
	});
	</script>
	</head>
	<body>
		<% String tituloPagina="Detalle Base de Datos"; %>
		<%@include file="cabecera.inc" %>

		<div id="contenido_p">
		<br>
			<table class="display">
				<tr><td class="rosa">Nombre:</td><td><c:out value="${bd.nombre}"/>&nbsp;&nbsp;&nbsp;</td><td class="rosa">Versi&oacute;n:</td><td><c:out value="${bd.corVersion}"/></td></tr>
				<tr><td class="rosa" >Software:</td><td colspan="3"><c:out value="${bd.desSoftwareBaseVersion}"/></td></tr>
				<tr><td class="rosa" >Estado:</td><td ><c:choose><c:when test="${bd.estado==1}">Activo</c:when><c:otherwise>Inactivo</c:otherwise></c:choose></td></tr>
				<tr><td>&nbsp;</td></tr>
				<tr><td class="rosa" >Datos Sensibles:</td><td><c:if test="${bd.datSensibles==1}">Si</c:if><c:if test="${bd.datSensibles!=1}">No</c:if></td><td class="rosa" >Datos Personales:</td><td><c:if test="${bd.datPersonales==1}">Si</c:if><c:if test="${bd.datPersonales!=1}">No</c:if></td></tr>
			</table>
			<br />
		<table border="0"><tr><td><h2>Instalaciones</h2></td><td style="width:50px;">&nbsp;</td><td><div id="modal"><a title="Unidades de Negocio vs Instalaciones" href='<c:url value="/"/>app/basedatosversion/consultaInstUN?id=${bd.id}&corVer=${bd.corVersion}'>&#60;Unidades de Negocio vs Instalaciones&#62;</a></div></td></tr></table>
							
				<table id="example" class="ybl" >
				   <thead>
					<tr>
						<th>Tipo</th>
						<th>Nombre</th>	
						<th>Ambiente</th>
						<th>Comentario</th>
						<th>Nombre F&iacute;sico</th>
						<th>Descripci&oacute;n</th>
						<th></th>
					</tr>
					</thead>      					
					<tfoot>
					<tbody>
					<c:forEach items="${clusters}" var="cluster">
						<tr>
							<td><c:out value="${cluster.nombre}"/></td>
							<td><c:out value="${cluster.servidor.nombre}"/></td>
							<td><c:out value="${cluster.servidor.desAmbiente}"/></td>
							<td><c:out value="${cluster.servidor.comentarioInterno}"/></td>
							<td><c:out value="${cluster.bdVersion.nomFisico}"/></td>
							<td><c:out value="${cluster.bdVersion.descripcion}"/></td>
							<td><a href='<c:url value="/"/>app/cluster/consulta?idCluster=${cluster.id}'>Ir</a></td>				
						</tr>
					</c:forEach>      					
					</tbody>
					</table>
			<br />
			<br />
			<h2>Aplicaciones Relacionadas</h2>				
				<table id="example" class="ybl" >
				   <thead>
					<tr style="background-color: #ed6c23; color:white !important;">
						<th>Nombre</th>
						<th>Versi&oacute;n</th>	
						<th>Tipo Instalaci&oacute;n</th>
						<th></th>
					</tr>
					</thead>      					
					<tfoot>
					<tbody>
					<c:forEach items="${appVersiones}" var="app">
						<tr>
							<td><c:out value="${app.nombre}"/></td>
							<td><c:out value="${app.corVersion}"/></td>
							<td><c:out value="${app.comentario}"/></td>
							<td><a href='<c:url value="/"/>app/appVersion/consulta?idApp=${app.id}&corVer=${app.corVersion}'>Ir</a></td>				
						</tr>
					</c:forEach>      					
					</tbody>
					</table>

		</div>
	</body>
</html>