<%@ page language="java" pageEncoding="UTF-8" session="true" isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<base href="<c:url value="/app"/>">
	<meta charset="UTF-8">
    <title>${initParam.appName} ${initParam.appVersion}</title>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/font-awesome.min.css"/>'>    
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/bootstrap.min.css"/>'>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/dashboard.css"/>'>    
	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/datatables.bootstrap.min.css"/>'>    
	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/buttons.dataTables.min.css"/>'>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/angular-growl.min.css"/>'>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/angular-loading-bar.css"/>'>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/estilo.css"/>'>
</head>
<body ng-app="catalogo" ng-controller="mainCtrl">
	<script>
		URL_BASE = "<c:url value="/"/>";
		URL_API = URL_BASE + "api";
		URL_LOGOUT = URL_BASE + "logout";
	</script>
	<div growl></div>
	<nav class="navbar navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">          
          <div class="navbar-brand">
          	<button type="button" class="navbar-toggle" 
			data-toggle="collapse" data-target="#sidebar-nav" 
			aria-expanded="true" aria-controls="sidebar-nav"
			ng-click="isSidebar = !isSidebar"
			>
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>            
        	</button>
        	<span ncy-breadcrumb></span>
        </div>
        <div id="navbar" class="navbar-collapse" style="height: 1px;">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#" ng-click="salir()"><span class="glyphicon glyphicon-off" aria-hidden="true"></span></a></li>
          </ul>
        </div>
      </div>
    </nav>
	<div class="container-fluid content">
		<div clas="row">
			<div class="col-sm-12 col-md-12">
				<div class="sidebar" ng-class="{'active': isSidebar}">
				  <ul id="sidebar-nav" class="sidebar-nav collapse in">				
					<li><a ui-sref="solucion" ui-sref-active="active">
						<i class="fa fa-cubes" aria-hidden="true"></i>
						Soluciones</a></li>
					<li><a ui-sref="aplicacion" ui-sref-active="active">
						<i class="fa fa-cube" aria-hidden="true"></i>
						Aplicaciones</a></li>
					<li><a ui-sref="baseDatos" ui-sref-active="active">
						<i class="fa fa-database" aria-hidden="true"></i>
						Bases de datos</a></li>
					<li><a ui-sref="softwareBase" ui-sref-active="active">
						<i class="fa fa-square-o" aria-hidden="true"></i>
						Softwares Base</a></li>
					<li><a ui-sref="servidor" ui-sref-active="active">
						<i class="fa fa-server" aria-hidden="true"></i>
						Servidores</a></li>
					<li><a ui-sref="cluster" ui-sref-active="active">
						<i class="fa fa-object-group" aria-hidden="true"></i>
						Clusters</a></li>
					<!-- TEST TMP
					<li><a href="<c:url value="/"/>app/solucion">Soluciones</a></li>
					<li><a href="<c:url value="/"/>app/appVersion/todas">Aplicaciones</a></li>
					<li><a href="<c:url value="/"/>app/basedatosversion">Bases de Datos</a></li>
					<li><a href="<c:url value="/"/>app/swBaseVersion">Software Base</a></li>
					<li><a href="<c:url value="/"/>app/servidor">Servidores</a></li>
					<li><a href="<c:url value="/"/>app/cluster">Clusters</a></li>
					 -->
				  </ul>
				</div>
				<div class="main">
					<ui-view></ui-view>		
				</div>
			</div>
		</div>
	</div>
	<script src='<c:url value="/resources/js/jquery-1.12.0.min.js"/>'></script><!-- TODO update version -->	
	<script src='<c:url value="/resources/js/jquery.dataTables.min.js"/>'></script>	
	<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
	<script src="<c:url value="/resources/js/angular.min.js"/>"></script>
	<!-- datatables -->
	<script src='<c:url value="/resources/js/dataTables.buttons.min.js"/>'></script>	
	<script src='<c:url value="/resources/js/buttons.html5.min.js"/>'></script>
	<script src='<c:url value="/resources/js/buttons.print.min.js"/>'></script>
	<script src='<c:url value="/resources/js/jszip.min.js"/>'></script>
	<script src='<c:url value="/resources/js/angular-datatables.min.js"/>'></script>
	<script src='<c:url value="/resources/js/angular-datatables.buttons.min.js"/>'></script>
	<script src='<c:url value="/resources/js/angular-datatables.bootstrap.min.js"/>'></script>

	<script src="<c:url value="/resources/js/angular-animate.min.js"/>"></script>
	<script src="<c:url value="/resources/js/angular-resource.min.js"/>"></script>
	<script src="<c:url value="/resources/js/angular-ui-router.min.js"/>"></script>
	<script src="<c:url value="/resources/js/angular-breadcrumb.min.js"/>"></script>
	<script src="<c:url value="/resources/js/angular-growl.min.js"/>"></script>
	<script src="<c:url value="/resources/js/angular-loading-bar.js"/>"></script>
	<script src="<c:url value="/resources/app/catalogo.js"/>"></script>
	<script src="<c:url value="/resources/app/selectTablasCodigos.js"/>"></script>
	<script src="<c:url value="/resources/app/solucionList.js"/>"></script>	
	<script src="<c:url value="/resources/app/solucion.js"/>"></script>
	<script src="<c:url value="/resources/app/aplicacionList.js"/>"></script>	
	<script src="<c:url value="/resources/app/baseDatosList.js"/>"></script>	
	<script src="<c:url value="/resources/app/softwareBaseList.js"/>"></script>	
	<script src="<c:url value="/resources/app/servidorList.js"/>"></script>	
	<script src="<c:url value="/resources/app/clusterList.js"/>"></script>	
</body>
</html>