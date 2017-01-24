app = angular.module('catalogo');

function ServidorListController($scope, $rootScope, $state, 
		DTOptionsBuilder, DTColumnBuilder) {
	$rootScope.title = "Lista de Servidores";
		
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
		$scope.servidores = this.servidores;
	    $scope.dtOptions = DTOptionsBuilder.newOptions()
	     	.withBootstrap()
	    	.withDOM('lBfrtip')
	    	.withButtons([
	            'excel',
	            {
	                text: 'Nuevo',
	                action: function (e, dt, node, config) {
	                	$state.go('servidor.item', {id: 0});
	                }
	            }
	        ]);
	};
}
app.component("servidorList", {
  templateUrl: URL_BASE + "resources/tpl/servidorList.html",
  controller: ServidorListController,
  bindings: { servidores: '<' }	
});
