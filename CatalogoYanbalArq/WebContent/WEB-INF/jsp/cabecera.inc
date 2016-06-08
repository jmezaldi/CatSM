	<!-- HEADER -->

	<div id="header">
		<div id="contenidoHeader">
			<div id="tit_cta">
				Catálogo: <%=tituloPagina%>
			</div>
			<div id="menuHeader">
				<div class="menutop"><a href="javascript:formSubmit();"><img src='<c:url value="/images/salir.png"/>'></a></div>
				<br/><br/>
				<div  style="display: inline-block; text-align: right;">
				<a class="linkb" href="<c:url value="/"/>app">Ir al menú principal</a>
				<a class="linkb" href="javascript:window.history.back();">Regresar</a>
				</div>
			</div>
		</div>
	</div>

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

	<!-- HEADER -->