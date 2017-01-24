app = angular.module('catalogo');

function SoftwareBaseListController($scope, $rootScope, $state, 
		DTOptionsBuilder, DTColumnBuilder) {
	$rootScope.title = "Lista de Software Base";
		
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
		$scope.softwaresBase = this.softwaresBase;
	    $scope.dtOptions = DTOptionsBuilder.newOptions()
	     	.withBootstrap()
	    	.withDOM('lBfrtip')
	    	.withButtons([
	            'excel',
	            {
	                text: 'Nuevo',
	                action: function (e, dt, node, config) {
	                	$state.go('softwareBase.item', {id: 0});
	                }
	            }
	        ]);
	};
}
app.component("softwareBaseList", {
  templateUrl: URL_BASE + "resources/tpl/softwareBaseList.html",
  controller: SoftwareBaseListController,
  bindings: { softwaresBase: '<' }	
});
