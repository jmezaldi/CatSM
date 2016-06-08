<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<title>Login Page</title>
<style>
body{
	color:#666666;
	font-family: 'helvetica' !important;
	font-size:11px;
	padding:0px; !important;
	margin: 0px;
}
.error {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: F0F0F0;
	border-color: #ebccd1;	
}

.msg {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #31708f;
	background-color: #d9edf7;
	border-color: #bce8f1;
}

#login-box {
	width: 300px;
	padding: 10px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #ED6C23;
}
.titleMsg {
	color:#ED6C23 !important;
	text-align: center;
    font-family:TradeGothicLTStdBold !important;
    font-size:20px !important;
    padding-top: 10px !important;
    padding-bottom: 10px !important;
}

.titleMsg a:link,visited,hover,active{
	color:#ED6C23 !important;
	text-align: center;
    font-family:Arial!important;
    text-decoration:none;
    font-size:20px !important;
    padding-top: 10px !important;
    padding-bottom: 10px !important;
}
.titleMsg2 {
	color:#ED6C23 !important;
	text-align: left;
    font-family:TradeGothicLTStdBold !important;
    font-size:30px !important;
    padding-top: 10px !important;
    padding-bottom: 10px !important;
}

#header{
	background-color: #ed6c23;
	height: 120px;
	width: 100%
}

#contenidoHeader{
	margin: auto;
	width: 100%;
}
#logo{
	float: left;
	margin-left: 10px;
	margin-top: 35px;
}
#tit_cta{
	float: left;
	margin-left: 20%;
	margin-top: 50px;
	color:white !important;
	text-align: left;
    font-family: Verdana;
    font-size:30px !important;
}
#menuHeader{
	float: right;
	margin-top: 18px;
	margin-right: 10px;
}

</style>
</head>
<body >

	<!-- HEADER -->
	<div id="header">
		<div id="contenidoHeader">
			<div id="logo">
				<img src='images/unique-transparente.png' />
			</div>
			<div id="tit_cta">
				Catálogo de Arquitectura
			</div>
			<div id="menuHeader">
				<div class="menutop"><a href="javascript:window.close();"><img src="images/salir.png"></a></div>
			</div>
		</div>
	</div>

	<!-- HEADER -->

	<div id="login-box">
		<div class="titleMsg"><a href="<c:url value="/"/>app">Ingresar</a></div>
	</div>

</body>
</html>