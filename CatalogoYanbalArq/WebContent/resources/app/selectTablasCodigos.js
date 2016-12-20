var app = angular.module('catalogo');

function SelectTablasCodigosController($scope, TablasCodigos, $timeout) {	
	var ctrl = this;	
	this.$onInit = function() {				
		$timeout(function(){
			$scope.codigos = TablasCodigos.getCodigos(ctrl.codTabla);
			$scope.codDatoObj = { codDato: ctrl.codDato};
		}, 300);//TODO improve. angularjs issue.		
	};
	$scope.update = function() {
		ctrl.codDato = $scope.codDatoObj.codDato;
	}
}
app.component("selectTablasCodigos", {
  templateUrl: URL_BASE + "resources/tpl/selectTablasCodigos.html?v=" + 
  	(new Date()).getTime(),//TEST,
  controller: SelectTablasCodigosController,
  bindings: {
    codTabla: '<',
    codDato: '='
  }	
});
