<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.yanbal.catalogo.util.constantes.ConstantesComunes" %>

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
			<% String tituloPagina="Detalle Aplicaciуn"; %>
			<%@include file="cabecera.inc" %>
		<c:url var="post_ctx"  value="/" />

		<div id="contenido_p">
		<br>
			<table class="display">
				<tr><td class="rosa">Nombre:</td><td><c:out value="${appVersion.nombre}"/>&nbsp;&nbsp;</td>
				<td class="rosa">Versi&oacute;n:</td><td><c:out value="${appVersion.corVersion}"/></td></tr>
				<tr><td class="rosa">Descripciуn:</td><td><c:out value="${appVersion.descripcion}"/></td></tr>
				<tr><td class="rosa">Tipo:</td><td><form:select path="appVersion.codDatoTipoApp" id="DatoTipoApp" class="form-control" disabled="${true}">
						    <form:option value="" label="--"/>
							<form:options items="${TabCod18}" itemValue="codDato" itemLabel="desAbreviada" />
				</form:select></td></tr>
				<tr><td class="rosa">Criticidad:</td><td><form:select path="appVersion.codDatoCriticidad" id="DatoCriticidad" class="form-control" disabled="${true}">
						    <form:option value="" label="--"/>
							<form:options items="${TabCod7}" itemValue="codDato" itemLabel="desAbreviada" />
				</form:select></td></tr>
				<tr><td class="rosa">Exposici&oacute;n:</td><td><form:select path="appVersion.codDatoExposicion" id="DatoExposicion" class="form-control" disabled="${true}">
						    <form:option value="" label="--"/>
							<form:options items="${TabCod8}" itemValue="codDato" itemLabel="desAbreviada" />
				</form:select></td></tr>
				<tr><td class="rosa">Custodio:</td><td><form:select path="appVersion.codDatoCustodio" id="DatoCustodio" class="form-control" disabled="${true}">
						    <form:option value="" label="--"/>
							<form:options items="${TabCod9}" itemValue="codDato" itemLabel="desAbreviada" />
				</form:select></td></tr>
				<tr><td class="rosa">&Aacute;rea:</td><td><form:select path="appVersion.codDatoArea" id="DatoArea" class="form-control" disabled="${true}">
						    <form:option value="" label="--"/>
							<form:options items="${TabCod999}" itemValue="codDato" itemLabel="desAbreviada" />
				</form:select></td></tr>	
				<tr><td class="rosa">Usuario Lider:</td><td><c:out value="${appVersion.usuarioLider}"/></td></tr>
				<tr><td class="rosa">Software Base:</td><td colspan="3"><c:out value="${appVersion.swbaseVersion.nombre}"/> Versiуn <c:out value="${appVersion.swbaseVersion.version}"/> Fix <c:out value="${appVersion.swbaseVersion.fix}"/></td></tr>
			</table>

		<h2>Base de Datos</h2>
		<table class="display">
						<tr style="background-color: #ed6c23; color:white !important;">
							<th>Nombre</th>			
							<th>Versiуn</th>		
							<th>Datos Sensibles</th>			
							<th>Datos Personales</th>		
							<th colspan="2">Software</th>			
						</tr>
			<c:forEach items="${basedatos}" var="bd">     
						<tr>
							<td ><c:out value="${bd.nombre}"/></td>			
							<td ><c:out value="${bd.corVersion}"/></td>		
							<td ><c:out value="${bd.datSensibles}"/></td>			
							<td ><c:out value="${bd.datPersonales}"/></td>		
							<td ><c:out value="${bd.swBaseVersion.nombre}"/></td>			
							<td ><c:out value="${bd.swBaseVersion.version}"/> <c:out value="${bd.swBaseVersion.fix}"/></td>				
						</tr>
			</c:forEach>
		</table>
		<h2>Caracterнsticas</h2>
		<table class="display">
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
		<br>
		<h2>Instancias</h2>	

				<table class="display">
						<tr style="background-color: #ed6c23; color:white !important;">
							<th>INSTALACION</th>			
							<th>NOMBRE SERVIDOR</th>		
							<th>TIPO</th>					
						</tr>
			<c:forEach items="${clusters}" var="cl">
						<tr>
							<td ><c:out value="${cl.nombre}"/></td>			
							<td ><c:out value="${cl.servidor.nombre}"/></td>		
							<td ><c:out value="${cl.servidor.desAmbiente}"/></td>				
						</tr>
			</c:forEach>
		</table>
		</div>
	</body>
</html>

