app = angular.module('catalogo');

function AplicacionController($scope, $rootScope, $state, $window, TablasCodigos) {
		
    $scope.setCodTablas = function(aplicacion){
		aplicacion.codTablaCriticidad = $rootScope.codTabla.criticidad;
		aplicacion.codTablaExposicion = $rootScope.codTabla.exposicion;
		aplicacion.codTablaPublico = $rootScope.codTabla.publico;
		aplicacion.codTablaArea = $rootScope.codTabla.area;
		aplicacion.codTablaCustodio = $rootScope.codTabla.custodio;
		aplicacion.codTablaTipoApp = $rootScope.codTabla.tipoApp;
	};
	$scope.showResult = function(){//and reload
		$scope.frmAplicacion.$setPristine();
		$scope.result = 1;//OK
		//TODO improve messages
		$scope.$parent.updateList(angular.copy($scope.aplicacion), $scope.isNew);
		$scope.isNew = false;
	};
	//TODO validate form
	$scope.save = function() {
		if(typeof $scope.aplicacion.id == "undefined"){
			$scope.aplicacion.$save(function() {//TODO use params
				$scope.showResult();
			});
		}else{
			$scope.aplicacion.$update(function() {
				$scope.showResult();
			});
		}
    };
    $scope.cancel = function() {
    	$state.go('^');
    };
    //console.log($scope.$parent.aplicaciones);//TODO avoid works only after state list
    this.$onInit = function() {
		$scope.isNew = false;
		this.label = "Aplicación";
		if(this.aplicacion.id == undefined){		
			this.label = "Nueva Aplicación";
			$scope.isNew = true;
		}	
		$scope.aplicacion = this.aplicacion;
		$scope.setCodTablas(this.aplicacion);
		$window.scrollTo($window.innerWidth, 0);
    };
    
}
app.component("aplicacion", {
  templateUrl: URL_BASE + "resources/tpl/aplicacion.html",
  controller: AplicacionController,
  bindings: { aplicacion: '<' }	
});
