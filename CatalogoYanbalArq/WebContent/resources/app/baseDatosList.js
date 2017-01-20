app = angular.module('catalogo');

function BaseDatosListController($scope, $rootScope, $http, $state, 
		DTOptionsBuilder, DTColumnBuilder) {
	$rootScope.title = "Lista de Bases de datos";
		
	/*$scope.updateList = function(solucion, isNew){
		//TODO update table list without losing state		
		if(solucion != null){
			if(isNew){
				$scope.soluciones.push(solucion);
			}else{				
				$scope.soluciones.forEach(function(item, index){
					if(item.id == solucion.id){	
						$scope.soluciones[index] = solucion;
					}
				});
			}
		}
	}*/
	this.$onInit = function() {
		$scope.basesDatos = this.basesDatos;
	    $scope.dtOptions = DTOptionsBuilder.newOptions()
	     	.withBootstrap()
	    	.withPaginationType('full_numbers')
	    	.withDOM('lBfrtip')
	    	.withButtons([
	            'excel',
	            {
	                text: 'Nuevo',
	                action: function (e, dt, node, config) {
	                	$state.go('baseDatos.item', {id: 0});
	                }
	            }
	        ]);
	};
}
app.component("baseDatosList", {
  templateUrl: URL_BASE + "resources/tpl/baseDatosList.html?v=" + 
  	(new Date()).getTime(),//TEST
  controller: BaseDatosListController,
  bindings: { basesDatos: '<' }	
});
