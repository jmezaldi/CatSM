<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/estilo.css"/>'>
</head>
<body>
		<% String tituloPagina="Menú Principal"; %>
		<%@include file="cabecera.inc" %>

	<c:url value="/j_spring_security_logout" var="logoutUrl" />
	<form action="${logoutUrl}" method="post" id="logoutForm">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
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
<a class="linkm" href="<c:url value="/"/>app/servidor">Servidores</a>
<br/>
<a class="linkm" href="<c:url value="/"/>app/basedatosversion">Bases de Datos</a>
<br/>
<a class="linkm" href="<c:url value="/"/>app/swBaseVersion">Software Base</a>
</div>

</c:if>

</body>
</html>