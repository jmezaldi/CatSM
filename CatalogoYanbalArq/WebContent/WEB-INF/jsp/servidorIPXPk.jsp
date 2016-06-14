<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<body>
		<center>
		<div id="content">
				<table id="example" class="ybl" >
				   <thead>
					<tr style="background-color: #ed6c23; color:white !important;">
						<th>Tipo</th>	
						<th>Ip</th>
					</tr>
					</thead>      					
					<tfoot>
					<tbody>
					<c:forEach items="${servidor}" var="ser">
						<tr>
							<td><c:out value="${ser.desTipoIp}"/></td>		
							<td><c:out value="${ser.ip}"/></td>
						</tr>
					</c:forEach>      					
					</tbody>
					</table>
	</div>
	</center>
	</body>
</html>