<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" session="true" isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Cat&aacute;logo de Arquitectura</title>
	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/estilo.css"/>'>
</head>
<body>
		<% String tituloPagina="Men&uacute; Principal"; %>
		<%@include file="cabecera.inc" %>

	<c:url value="/j_spring_security_logout" var="logoutUrl" />
	<form action="${logoutUrl}" method="post" id="logoutForm">
	</form>
	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>

<c:if test="${pageContext.request.userPrincipal.name != null}">

<br/>
<div id="menulistado">
<a class="linkm" href="<c:url value="/"/>app/solucion">Soluciones</a>
<br/>
<a class="linkm" href="<c:url value="/"/>app/appVersion/todas">Aplicaciones</a>
<br/>
<a class="linkm" href="<c:url value="/"/>app/basedatosversion">Bases de Datos</a>
<br/>
<a class="linkm" href="<c:url value="/"/>app/swBaseVersion">Software Base</a>
<br/>
<a class="linkm" href="<c:url value="/"/>app/servidor">Servidores</a>
<br/>
<a class="linkm" href="<c:url value="/"/>app/cluster">Clusters</a>
</div>

</c:if>

</body>
</html>