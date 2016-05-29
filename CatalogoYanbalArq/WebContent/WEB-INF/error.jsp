<%@ page language="java" pageEncoding="UTF-8" session="true" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>Error</title>

<!-- Bootstrap core CSS -->
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
		<div style='width:100%;height:1px;background-color:#ED6C23;'></div>
		<div class="contentMsg">
			<c:choose>
			 	<c:when test="${not empty errorObject}">
			 		<p>${errorObject}</p>
			 		<p>Atentamente,</p>
					<p>Unique - Yanbal</p>
			 	</c:when>
			 	<c:otherwise>
			 		<p>Ha ocurrido un error, por favor vuelve a intentarlo ¡Gracias!.</p>
					<p>Atentamente,</p>
					<p>Unique - Yanbal</p>
				</c:otherwise>
			</c:choose>
		</div>
		<div style='width:100%;height:1px;background-color:#ED6C23;'></div>
		<div style="height:100px">&nbsp;</div>
	</div>
</body>
</html>

 

