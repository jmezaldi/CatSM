<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Hello World with Spring 3 MVC JM</title>
		<link rel="stylesheet" type="text/css" href='<c:url value="/resources/jquery.dataTables.min.css"/>'>
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
		<script type="text/javascript" src='<c:url value="/resources/common.js"/>'></script>
		<script type="text/javascript" src='<c:url value="/resources/solucion.js"/>'></script>


	<script type="text/javascript" language="javascript" src='<c:url value="/resources/jquery-1.12.0.min.js"/>'></script>
	<script type="text/javascript" language="javascript" src='<c:url value="/resources/jquery.dataTables.min.js"/>'></script>

	<script type="text/javascript" class="init">
	
$(document).ready(function() {
	$('#example').DataTable( {
		"pagingType": "full_numbers",
		"columnDefs": [
            {
                "targets": [ 7 ],
                "visible": false
            }
        ]
	} );
	
} );

	</script>

		<script type="text/javascript">
			var projectUrl = '<c:url value="/"/>';
			if(projectUrl.indexOf(";", 0) != -1){
				projectUrl = projectUrl.substring(0, projectUrl.indexOf(";", 0));
			}
		</script>		

			<script type="text/javascript" class="init">
	


	</script>
	</head>
	<body>
		<fieldset>
		<legend>Soluciуn</legend>
		<center>
		<c:url var="post_ctx"  value="/" />
		<form:form commandName="solucion" action="${post_ctx}app/solucion/add" name="solucionForm">
		
		<form:hidden path="id"/>
		<form:hidden path="estado"/>
		<table>
			<tr><td colspan="2" align="left"><form:errors path="*" cssStyle="color : red;"/></td></tr>
			<tr><td>Nombre: </td><td><form:input path="nombre" /></td></tr>
			<tr><td>Descripciуn: </td><td><form:input path="descripcion" /></td></tr>
			<tr><td>Vertical : </td><td><form:select path="codDatoVertical">
					<form:option value="">--</form:option>
					<form:option value="1">Comercial</form:option>
					<form:option value="2">Soporte</form:option>
					<form:option value="3">Industrial</form:option>
			</form:select></td></tr>
			<tr><td>&Aacute;mbito : </td><td><form:select path="codDatoAmbito">
					<form:option value="">--</form:option>
					<form:option value="1">Local</form:option>
					<form:option value="2">Corporativa</form:option>
			</form:select></td></tr>
			<tr><td>Tipo : </td><td><form:select path="codDatoTipo">
					<form:option value="">--</form:option>
					<form:option value="1">Desarrollo</form:option>
					<form:option value="2">Enlatado</form:option>
					<form:option value="3">Mixto</form:option>
			</form:select></td></tr>
			<tr><td>&Aacute;rea : </td><td><form:select path="codDatoArea">
					<form:option value="">--</form:option>
			</form:select></td></tr>
			<tr><td colspan="2"><input type="submit" value="Grabar"/>
			&nbsp;<input type="reset" name="newSolucion" value="Nueva Solucion" onclick="setAddForm();" disabled="disabled"/>
			<!--  &nbsp;<input type="submit" name="deleteSolucion" value="Eliminar Solucion" onclick="setDeleteForm();" disabled="disabled"/>--></td></tr>
		</table>
		</form:form>
		</center>
		</fieldset>
		<c:if test="${!empty soluciones}">
		
			<br />
			<center>
				<table id="example" width="100%" class="display compact" >
				   <thead>
					<tr style="background-color: gray;">
						<th>Id</th>
						<th>Nombre</th>
						<th>Descripci&oacute;n</th>
						<th>Vertical</th>
						<th>&Aacute;mbito</th>
						<th>Tipo</th>
						<th>&Aacute;rea</th>	
						<th>Estado</th>	
						<th></th>
					</tr>
					</thead>
					<tfoot>
					<tr style="background-color: gray;">
						<th>Id</th>
						<th>Nombre</th>
						<th>Descripci&oacute;n</th>
						<th>Vertical</th>
						<th>&Aacute;mbito</th>
						<th>Tipo</th>
						<th>&Aacute;rea</th>	
						<th>Estado</th>
						<th></th>
					</tr>
					</tfoot>
					<tbody>
					<c:forEach items="${soluciones}" var="solucion">
						<tr style="background-color: silver;" id="${solucion.id}" onclick="setUpdateForm('${solucion.id}','${solucion.estado}');">
							<td ><c:out value="${solucion.id}"/></td>
							<td><c:out value="${solucion.nombre}"/></td>
							<td><c:out value="${solucion.descripcion}"/></td>
							<td><c:out value="${solucion.desVertical}"/></td>
							<td><c:out value="${solucion.desAmbito}"/></td>
							<td><c:out value="${solucion.desTipo}"/></td>
							<td><c:out value="${solucion.desArea}"/></td>
							<td><c:out value="${solucion.estado}"/></td>
							<td><a href="appVersion/show?idSolucion=${solucion.id}">Ir</a></td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				</center>
			<br />

		</c:if>

	</body>
</html>