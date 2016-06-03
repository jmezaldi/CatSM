<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<body>
	<h1>Title : ${title}</h1>
	<h1>Message : ${message}</h1>

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
<H1>Listas Maestras</H1>
<br/>
<a href="app/solucion">Soluciones</a>
<br/>
<a href="app/appVersion/todas">Aplicaciones</a>
<br/>
<a href="app/servidor">Servidores</a>
<br/>
<a href="app/basedatosversion">Bases de Datos</a>
<br/>
<a href="app/swBaseVersion">Software Base</a>
<br/>
 <a	href="javascript:formSubmit()"> Logout</a>
		</h2>
	</c:if>

</body>
</html>