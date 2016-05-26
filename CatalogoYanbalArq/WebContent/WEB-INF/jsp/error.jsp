<%@ page language="java" pageEncoding="UTF-8" session="true" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>Solicitud de Actualización</title>

<!-- Bootstrap core CSS -->
<link href="./resources-yel/js/bootstrap/css/bootstrap-add.css" rel="stylesheet">
<script type="text/javascript" src="./resources-yel/js/jquery-1.9.1.js"></script>

<style type="text/css">
.message {
    display: block;
    width: 100%;
    background: #FFF;
    border-radius: 20px 20px 20px 20px;
    -moz-border-radius: 20px 20px 20px 20px;
    -webkit-border-radius: 20px 20px 20px 20px;
}
.titleMsg {
	color:#ED6C23 !important;
	text-align: center;
    font-family:TradeGothicLTStdBold !important;
    font-size:18px !important;
    padding-top: 10px !important;
    /*padding-bottom: 10px !important;*/
}
.contentMsg {
	color: #747373;
	text-align: center;
	font-family:Arial, Helvetica, sans-serif;
	font-size:12px;
}
</style>
</head>
<body>
	<div class="message">
	    <div style="height:100px">&nbsp;</div>
		<div style='width:80px;height:1px;background-color:#ED6C23;'></div>
		<div class="contentMsg">
			<c:choose>
			 	<c:when test="${not empty errorObject}">
			 		<p>${errorObject}</p>
			 		<p>Atentamente,</p>
					<p>Unique - Yanbal</p>
			 	</c:when>
			 	<c:otherwise>
			 		<p>No hemos podido recibir tu solicitud de Actualización de Datos, por favor vuelve a intentarlo ¡Gracias!.</p>
					<p>Atentamente,</p>
					<p>Unique - Yanbal</p>
				</c:otherwise>
			</c:choose>
		</div>
		<div style='width:80px;height:1px;background-color:#ED6C23;'></div>
		<div style="height:100px">&nbsp;</div>
	</div>
	<script type="text/javascript">
		$(document).ready(function(){
			window.parent.postMessage('height_'+$('.message').height(), '*');
		});
	</script>
</body>
</html>
 
