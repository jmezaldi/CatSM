app = angular.module('catalogo');

function AplicacionListController($scope, $rootScope, $http, $state, 
		$timeout, DTOptionsBuilder, DTColumnBuilder) {
	$rootScope.title = "Lista de aplicaciones";
		
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
		$scope.aplicaciones = this.aplicaciones;
	    $scope.dtOptions = DTOptionsBuilder.newOptions()
	     	.withBootstrap()
	    	.withDOM('lBfrtip')
	    	.withButtons([
	            'excel',
	            {
	                text: 'Nuevo',
	                action: function (e, dt, node, config) {
	                	$state.go('aplicacion.item', {id: 0});
	                }
	            }
	        ]);
	};
}
app.component("aplicacionList", {
  templateUrl: URL_BASE + "resources/tpl/aplicacionList.html",
  controller: AplicacionListController,
  bindings: { aplicaciones: '<' }	
});
