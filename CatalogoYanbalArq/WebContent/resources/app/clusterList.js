app = angular.module('catalogo');

function ClusterListController($scope, $rootScope, $state, 
		DTOptionsBuilder, DTColumnBuilder) {
	$rootScope.title = "Lista de Clusters";
		
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
		$scope.clusters = this.clusters;
	    $scope.dtOptions = DTOptionsBuilder.newOptions()
	     	.withBootstrap()
	    	.withPaginationType('full_numbers')
	    	.withDOM('lBfrtip')
	    	.withButtons([
	            'excel',
	            {
	                text: 'Nuevo',
	                action: function (e, dt, node, config) {
	                	$state.go('cluster.item', {id: 0});
	                }
	            }
	        ]);
	};
}
app.component("clusterList", {
  templateUrl: URL_BASE + "resources/tpl/clusterList.html?v=" + 
  	(new Date()).getTime(),//TEST
  controller: ClusterListController,
  bindings: { clusters: '<' }	
});
