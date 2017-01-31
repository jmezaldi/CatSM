app = angular.module('catalogo');

function SolucionController($scope, $rootScope, $state, $window, TablasCodigos) {
		
    $scope.setCodTablas = function(solucion){
		solucion.codTablaVertical = $rootScope.codTabla.vertical;
		solucion.codTablaAmbito = $rootScope.codTabla.ambito;
		solucion.codTablaTipo = $rootScope.codTabla.tipo;
		solucion.codTablaArea = $rootScope.codTabla.area;
	};
	$scope.showResult = function(){//and reload
		$scope.frmSolucion.$setPristine();
		$scope.result = 1;//OK
		//TODO improve messages
		$scope.$parent.updateList(angular.copy($scope.solucion), $scope.isNew);
		$scope.isNew = false;
	};
	//TODO validate form
	$scope.save = function() {
		if($scope.solucion.id == undefined){
			$scope.solucion.$save(function() {//TODO use params
				$scope.showResult();
			});
		}else{
			$scope.solucion.$update(function() {
				$scope.showResult();
			});
		}
    };
    $scope.cancel = function() {
    	$state.go('^');
    };
    //console.log($scope.$parent.soluciones);//TODO avoid works only after state list
    this.$onInit = function() {
		$scope.isNew = false;
		this.label = "Solución";
		if(this.solucion.id == undefined){		
			this.label = "Nueva Solución";
			$scope.isNew = true;
		}	
		$scope.solucion = this.solucion;
		$scope.setCodTablas(this.solucion);
		$window.scrollTo($window.innerWidth, 0);
    };
}
app.component("solucion", {
  templateUrl: URL_BASE + "resources/tpl/solucion.html",
  controller: SolucionController,
  bindings: { solucion: '<' }	
});
