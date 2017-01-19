app = angular.module('catalogo');

function SolucionController($scope, $rootScope, $state, $stateParams, $http, 
		$window, 
		TablasCodigos) {
		
    $scope.setCodTablas = function(solucion){
		solucion.codTablaVertical = $rootScope.codTabla.vertical;
		solucion.codTablaAmbito = $rootScope.codTabla.ambito;
		solucion.codTablaTipo = $rootScope.codTabla.tipo;
		solucion.codTablaArea = $rootScope.codTabla.area;
	};
	//TODO validate form
	$scope.save = function() {
		if(typeof $scope.solucion.id == "undefined"){
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
		if($stateParams.id == 0){		
			this.label = "Nueva Solución";
			$scope.isNew = true;
		}	
		$scope.solucion = this.solucion;
		$scope.setCodTablas(this.solucion);
		$window.scrollTo($window.innerWidth, 0);
	     
		$scope.showResult = function(){//and reload
			$scope.frmSolucion.$setPristine();
			$scope.result = 1;//OK
			//TODO improve messages
			$scope.$parent.updateList(angular.copy($scope.solucion), $scope.isNew);
			$scope.isNew = false;
		};
    };
}
app.component("solucion", {
  templateUrl: URL_BASE + "resources/tpl/solucion.html?v=" + 
  	(new Date()).getTime(),//TEST
  controller: SolucionController,
  bindings: { solucion: '<' }	
});
