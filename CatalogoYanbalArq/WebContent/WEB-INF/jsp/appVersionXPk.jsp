<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.yanbal.catalogo.util.constantes.ConstantesComunes" %>

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
		<h1>Detalle Aplicaciуn</h1>
		<c:url var="post_ctx"  value="/" />
			<table>
				<tr><td>Id</td><td><c:out value="${appVersion.id}"/></td></tr>
				<tr><td>Nombre</td><td><c:out value="${appVersion.nombre}"/></td></tr>
				<tr><td>Versi&oacute;n</td><td><c:out value="${appVersion.corVersion}"/></td></tr>
				<tr><td>Descripciуn</td><td><c:out value="${appVersion.descripcion}"/></td></tr>
				<tr><td>Criticidad</td><td><form:select path="appVersion.codDatoCriticidad" id="DatoCriticidad" class="form-control">
						    <form:option value="" label="--"/>
							<form:options items="${TabCod7}" itemValue="codDato" itemLabel="desAbreviada" />
				</form:select></td></tr>
				<tr><td>Exposici&oacute;n</td><td><form:select path="appVersion.codDatoExposicion" id="DatoExposicion" class="form-control">
						    <form:option value="" label="--"/>
							<form:options items="${TabCod8}" itemValue="codDato" itemLabel="desAbreviada" />
				</form:select></td></tr>
				<tr><td>Custodio</td><td><form:select path="appVersion.codDatoCustodio" id="DatoCustodio" class="form-control">
						    <form:option value="" label="--"/>
							<form:options items="${TabCod9}" itemValue="codDato" itemLabel="desAbreviada" />
				</form:select></td></tr>
				<tr><td>&Aacute;rea</td><td><form:select path="appVersion.codDatoArea" id="DatoArea" class="form-control">
						    <form:option value="" label="--"/>
							<form:options items="${TabCod999}" itemValue="codDato" itemLabel="desAbreviada" />
				</form:select></td></tr>	
				<tr><td>Usuario Lider</td><td><c:out value="${appVersion.usuarioLider}"/></td></tr>
			</table>

		<h2>Base de Datos</h2>
		<table border=1>
						<tr>
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
		<table border=1>
			<c:forEach items="${caracteristicas}" var="caract">
						<c:if test="${caract.codDato==0}">
						<tr style="background-color: gray;">
							<td colspan="3"><c:out value="${caract.desAbreviada}"/></td>				
						</tr>
						</c:if>
						<c:if test="${caract.codDato>0}">
						<tr>
							<td ><c:out value="${caract.codDato}"/></td>
							<td><c:out value="${caract.desAbreviada}"/></td>
							<td><c:out value="${caract.seleccion}"/></td>					
						</tr></c:if>
			</c:forEach>
		</table>
		<br>

		<h2>Instancias</h2>	

				<table border=1>
						<tr>
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
	</body>
</html>

