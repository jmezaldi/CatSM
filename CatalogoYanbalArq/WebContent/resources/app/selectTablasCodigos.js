var app = angular.module('catalogo');

function SelectTablasCodigosController($scope, TablasCodigos, $timeout) {	
	var ctrl = this;
	this.$onInit = function() {
		var bindingDeReg = $scope.$watch("$ctrl.codTabla", function (value){			
			if(value != undefined){
				$scope.codigos = TablasCodigos.getCodigos(ctrl.codTabla);
				$scope.isRequired = ctrl.required !== undefined;
				bindingDeReg();
			}
	    });	
	};
}
app.component("selectTablasCodigos", {
  templateUrl: URL_BASE + "resources/tpl/selectTablasCodigos.html?v=" + 
  	(new Date()).getTime(),//TEST,
  controller: SelectTablasCodigosController,
  bindings: {
    codTabla: '<',
    codDato: '=',
    name: '@',
    required: '@'
  }	
});