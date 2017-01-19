app = angular.module('catalogo');

function SolucionListController($scope, $rootScope, $http, $state, 
		$timeout, Solucion, DTOptionsBuilder, DTColumnBuilder) {
	$rootScope.title = "Lista de soluciones";
		
	$scope.updateList = function(solucion, isNew){
		//TODO update table list without losing state
		console.log(solucion);
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
	}
	this.$onInit = function() {
		$scope.soluciones = this.soluciones;
	    $scope.dtOptions = DTOptionsBuilder.newOptions()
	     	.withBootstrap()
	    	.withPaginationType('full_numbers')
	    	.withDOM('lBfrtip')
	    	.withButtons([
	            'excel',
	            {
	                text: 'Nuevo',
	                action: function (e, dt, node, config) {
	                	$state.go('solucion.item', {id: 0});
	                }
	            }
	        ]);
	};
}
app.component("solucionList", {
  templateUrl: URL_BASE + "resources/tpl/solucionList.html",
  controller: SolucionListController,
  bindings: { soluciones: '<' }	
});
