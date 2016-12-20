<%@ include file="common/header.inc" %>
		<script type="text/javascript">
		$(document).ready(function() {
			$('#example').DataTable( {
				"pagingType": "full_numbers",
				"bPaginate": true,
				"bLengthChange": true,
				"columnDefs": [ ],
				 "dom": 'lBfrtip',
				 "buttons": [
					'excel'
				]
			} );
			
		} );
		</script>
	<body>
		<% String tituloPagina="Listado de Soluciones"; %>
		<%@include file="cabecera.inc" %>
		<c:if test="${!empty soluciones}">		
			<br />
			<div id="listado_p">
				<table id="example" width="100%" class="display " >
				   <thead>
					<tr style="background-color: #ed6c23;color:white !important;">
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
					<tr style="background-color: #ed6c23; color:white !important;">
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
						<tr id="${solucion.id}" onclick="setUpdateForm('${solucion.id}','${solucion.estado}');">
							<td ><c:out value="${solucion.id}"/></td>
							<td><c:out value="${solucion.nombre}"/></td>
							<td><c:out value="${solucion.descripcion}"/></td>
							<td><c:out value="${solucion.desVertical}"/></td>
							<td><c:out value="${solucion.desAmbito}"/></td>
							<td><c:out value="${solucion.desTipo}"/></td>
							<td><c:out value="${solucion.desArea}"/></td>
							<td><c:choose><c:when test="${solucion.estado==1}">Activo</c:when><c:otherwise>Inactivo</c:otherwise></c:choose></td>
							<td><a href="appVersion/show?idSolucion=${solucion.id}">Ir</a></td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				</div>
			<br />
		</c:if>
	</body>
</html>