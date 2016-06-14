<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="com.yanbal.catalogo.util.constantes.ConstantesComunes" %>

<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Catбlogo de Arquitectura</title>
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
			<% String tituloPagina="Detalle Aplicaciуn"; %>
			<%@include file="cabecera.inc" %>
		<div id="contenido_p">
		<br>
			<table class="display">
				<tr><td class="rosa">Nombre:</td><td><c:out value="${appVersion.nombre}"/>&nbsp;&nbsp;</td>
				<td class="rosa">Versi&oacute;n:</td><td><c:out value="${appVersion.corVersion}"/></td><td><div id="modal"><a title="Aplicaciones Relacionadas" href='<c:url value="/"/>app/appVersion/consultaRel?idApp=${appVersion.id}&corVer=${appVersion.corVersion}'>&#60;Aplicaciones Relacionadas&#62;</a></div></td></tr>
				<tr><td class="rosa">Descripciуn:</td><td colspan="7"><c:out value="${appVersion.descripcion}"/></td></tr>
				<tr><td class="rosa">Criticidad:</td><td><form:select path="appVersion.codDatoCriticidad" id="DatoCriticidad" class="form-control" disabled="${true}">
						    <form:option value="" label="--"/>
							<form:options items="${TabCod7}" itemValue="codDato" itemLabel="desAbreviada" />
				</form:select></td><td class="rosa">Exposici&oacute;n:</td><td><form:select path="appVersion.codDatoExposicion" id="DatoExposicion" class="form-control" disabled="${true}">
						    <form:option value="" label="--"/>
							<form:options items="${TabCod8}" itemValue="codDato" itemLabel="desAbreviada" />
				</form:select></td><td class="rosa">Pъblico:</td><td><form:select path="appVersion.codDatoPublico" id="DatoPublico" class="form-control" disabled="${true}">
						    <form:option value="" label="--"/>
							<form:options items="${TabCod19}" itemValue="codDato" itemLabel="desAbreviada" />
				</form:select></td></tr>
				<tr><td class="rosa">&Aacute;rea:</td><td><form:select path="appVersion.codDatoArea" id="DatoArea" class="form-control" disabled="${true}">
						    <form:option value="" label="--"/>
							<form:options items="${TabCod999}" itemValue="codDato" itemLabel="desAbreviada" />
				</form:select>&nbsp;&nbsp;</td><td class="rosa">Usuario Lider:</td><td><c:out value="${appVersion.usuarioLider}"/></td></tr>
				<fmt:formatDate value="${appVersion.fechaVersion}" pattern="dd/MM/yyyy" var="newdatevar" />
				<tr><td class="rosa">Estado:</td><td ><c:choose><c:when test="${appVersion.estado==1}">Activo</c:when><c:otherwise>Inactivo</c:otherwise></c:choose></td>
				<td class="rosa">Fecha de Pase:</td><td><c:out value="${newdatevar}"/></td><td class="rosa">Ticket:</td><td><c:out value="${appVersion.ticketPase}"/></td></tr>
				<tr><td>&nbsp;</td></tr>
				<tr><td class="rosa">Tipo:</td><td><form:select path="appVersion.codDatoTipoApp" id="DatoTipoApp" class="form-control" disabled="${true}">
						    <form:option value="" label="--"/>
							<form:options items="${TabCod18}" itemValue="codDato" itemLabel="desAbreviada" />
				</form:select>&nbsp;&nbsp;</td></tr>
				<tr><td class="rosa">Custodio:</td><td><form:select path="appVersion.codDatoCustodio" id="DatoCustodio" class="form-control" disabled="${true}">
						    <form:option value="" label="--"/>
							<form:options items="${TabCod9}" itemValue="codDato" itemLabel="desAbreviada" />
				</form:select></td></tr>
				<tr><td class="rosa">Fuente:</td><td colspan="3"><c:out value="${appVersion.fuente}"/></td></tr>
				<tr><td class="rosa">Documentaciуn:</td><td colspan="3"><c:out value="${appVersion.documentacion}"/></td></tr>
				<tr><td class="rosa">Software Base:</td><td colspan="3"><c:out value="${appVersion.swbaseVersion.nombre}"/> Versiуn <c:out value="${appVersion.swbaseVersion.version}"/> Fix <c:out value="${appVersion.swbaseVersion.fix}"/>&nbsp;<a href='<c:url value="/"/>app/swBaseVersion/consulta?id=${appVersion.swbaseVersion.id}&corVer=${appVersion.swbaseVersion.corVersion}'>Ir</a></td></tr>
			</table>

		<h2>Base de Datos</h2>
		<table class="ybl">
						<thead><tr>
							<th>Nombre</th>			
							<th>Versiуn</th>		
							<th>Datos Sensibles</th>			
							<th>Datos Personales</th>		
							<th colspan="2">Software</th>		
							<th></th>
						</tr></thead>
			<c:forEach items="${basedatos}" var="bd">     
						<tr>
							<td ><c:out value="${bd.nombre}"/></td>			
							<td ><c:out value="${bd.corVersion}"/></td>		
							<td ><c:out value="${bd.datSensibles}"/></td>			
							<td ><c:out value="${bd.datPersonales}"/></td>		
							<td ><c:out value="${bd.swBaseVersion.nombre}"/></td>			
							<td ><c:out value="${bd.swBaseVersion.version}"/> <c:out value="${bd.swBaseVersion.fix}"/></td>	
							<td><a href='<c:url value="/"/>app/basedatosversion/consulta?id=${bd.id}&corVer=${bd.corVersion}'>Ir</a></td>
						</tr>
			</c:forEach>
		</table>
		<h2>Caracterнsticas</h2>
		<table class="ybl">
			<c:forEach items="${caracteristicas}" var="caract">
						<c:if test="${caract.codDato==0}">
						<tr style="background-color: #ed6c23; color:white !important;">
							<td colspan="3"><c:out value="${caract.desAbreviada}"/></td>				
						</tr>
						</c:if>
						<c:if test="${caract.codDato>0}">
						<tr>
							<td ><c:out value="${caract.codDato}"/></td>
							<td><c:out value="${caract.desAbreviada}"/></td>
							<td><c:if test="${caract.seleccion==1}">x</c:if></td>					
						</tr></c:if>
			</c:forEach>
		</table> 
		<table border="0"><tr><td><h2>Instancias</h2></td><td style="width:50px;">&nbsp;</td><td><div id="modal"><a title="Instalaciones VS Base de Datos" href='<c:url value="/"/>app/appVersion/consultaInstVs?idApp=${appVersion.id}&corVer=${appVersion.corVersion}'>&#60;Instalaciones VS Base de Datos&#62;</a></div></td></tr></table>

				<table class="ybl">
						<thead>
						<tr>
							<th>Instalaciуn</th>			
							<th>Servidor</th>		
							<th>Tipo</th>					
						</tr>
						</thead>
			<c:forEach items="${clusters}" var="cl">
						<tr>
							<td ><c:out value="${cl.nombre}"/></td>			
							<td ><c:out value="${cl.servidor.nombre}"/></td>		
							<td ><c:out value="${cl.servidor.desAmbiente}"/></td>				
						</tr>
			</c:forEach>
		</table>
		<h2>Unidades de Negocio</h2>	
		<table class="ybl">
						<thead>
						<tr>
							<th>Id</th>
							<th>Cуdigo</th>
							<th>Nombre</th>
							<th>Fecha Activaciуn</th>			
							<th>Ticket</th>	
						</tr>
						</thead>
					<c:forEach items="${unidades}" var="unidad">
						<tr>
							<td ><c:out value="${unidad.id}"/></td>
							<td><c:out value="${unidad.codigo}"/></td>
							<td><c:out value="${unidad.nombre}"/></td>
						    <fmt:formatDate value="${unidad.fechaActivacion}" pattern="dd/MM/yyyy" var="fechaAct" />
							<td><c:out value="${fechaAct}"/></td>
							<td><c:out value="${unidad.ticketActivacion}"/></td>
						</tr>
					</c:forEach>
		</table>

		<h2>Soluciones</h2>	
		<table class="ybl">
						<thead>
						<tr>
							<th>Id</th>
							<th>Nombre</th>
							<th>Vertical</th>
							<th>&Aacute;mbito</th>
							<th>Estado</th>	
							<th></th>				
						</tr>
						</thead>
					<c:forEach items="${soluciones}" var="solucion">
						<tr>
							<td ><c:out value="${solucion.id}"/></td>
							<td><c:out value="${solucion.nombre}"/></td>
							<td><c:out value="${solucion.desVertical}"/></td>
							<td><c:out value="${solucion.desAmbito}"/></td>
							<td><c:choose><c:when test="${solucion.estado==1}">Activo</c:when><c:otherwise>Inactivo</c:otherwise></c:choose></td>
							<td><a href='<c:url value="/"/>app/appVersion/show?idSolucion=${solucion.id}'>Ir</a></td>
						</tr>
					</c:forEach>
		</table>
		</div>
	</body>
</html>

