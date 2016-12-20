app = angular.module('catalogo');

function SolucionController($scope, $rootScope, $stateParams, $http, Solucion) {		
	$scope.id = $stateParams.id;
	if($scope.id == 0){
		$scope.solucion = new Solucion();
		$rootScope.title = "Nueva Solución";
	}else{		
		Solucion.get({ id: $scope.id }, function(solucion) {
			$scope.solucion = solucion;
			$rootScope.title = solucion.nombre;
		});
	}
	$scope.showResult = function(){//and reload
		$scope.frmSolucion.$setPristine();
		$scope.result = 1;//OK
		//TODO improve messages
	};
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
    //console.log($scope.$parent.soluciones);
}
app.component("solucion", {
  templateUrl: URL_BASE + "resources/tpl/solucion.html?v=" + 
  	(new Date()).getTime(),//TEST
  controller: SolucionController
});
