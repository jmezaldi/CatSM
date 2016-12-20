<%@ page language="java" pageEncoding="UTF-8" session="true" isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<base href="<c:url value="/app/"/>">
	<meta charset="UTF-8">
    <title>${initParam.appName}</title>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/bootstrap.min.css"/>'>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/dashboard.css"/>'>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/estilo.css"/>'>
	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/jquery.dataTables.min.css"/>'>
	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/buttons.dataTables.min.css"/>'>
	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/dataTables.bootstrap.min.css"/>'>    
</head>
<body ng-app="catalogo" ng-controller="mainCtrl">
	<script>
		URL_BASE = "<c:url value="/"/>";
		URL_API = URL_BASE + "api";
	</script>
	<nav class="navbar navbar-fixed-top" id="navbar">
      <div class="container-fluid">
        <div class="navbar-collapse collapse">
        	<div id="contenidoHeader">
				<div id="tit_cta">
					Catálogo: {{title}}
				</div>
				<div id="menuHeader">
					<div class="menutop">
						<a href="#">SALIR</a><!-- TODO implement logout -->
					</div>
					<br/><br/>
					<div style="display: inline-block; text-align: right;">
					<!-- improve, implement main menu, go back -->
					<a class="linkb" href="<c:url value="/"/>app">Ir al menú principal</a>
					<a class="linkb" href="javascript:window.history.back();">Regresar</a>
					</div>
				</div>
			</div>  
        </div>
      </div>
    </nav>
	<div class="container-fluid">
		<div clas="row">
			<div id="menulistado" class="col-sm-3 col-md-2 sidebar">
				<a class="linkm" ui-sref="solucion" ui-sref-active="active">Soluciones</a>
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
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<ui-view></ui-view>		
			</div>
			
		</div>
	</div>
	<script src='<c:url value="/resources/jquery-1.12.0.min.js"/>'></script><!-- TODO update version -->	
	<!-- datatables -->
	<script src='<c:url value="/resources/jquery.dataTables.min.js"/>'></script>
	<script src='<c:url value="/resources/dataTables.buttons.min.js"/>'></script>
	<script src='<c:url value="/resources/jszip.min.js"/>'></script>
	<script src='<c:url value="/resources/buttons.html5.min.js"/>'></script>
	<script src='<c:url value="/resources/buttons.print.min.js"/>'></script>
	
	<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
	<script src="<c:url value="/resources/js/angular.min.js"/>"></script>
	<script src="<c:url value="/resources/js/angular-resource.min.js"/>"></script>
	<script src="<c:url value="/resources/js/angular-ui-router.min.js"/>"></script>
	<script src="<c:url value="/resources/js/catalogo.js"/>"></script>
	<script src="<c:url value="/resources/app/solucionList.js"/>"></script>	
	<script src="<c:url value="/resources/app/solucion.js"/>"></script>
	<script src="<c:url value="/resources/app/selectTablasCodigos.js"/>"></script>
</body>
</html>