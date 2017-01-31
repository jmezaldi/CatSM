app = angular.module('catalogo');

function VersionListController($scope, $state, 
		DTOptionsBuilder, DTColumnBuilder) {
		
	this.$onInit = function() {
		$scope.versiones = this.versiones;
		var dom = 'rt';
		if($scope.versiones.length > 10){
			dom = 'lfrtip';
		}
	    $scope.dtOptions = DTOptionsBuilder.newOptions()
	     	.withBootstrap()
	    	.withDOM(dom);
	};
}
app.component("versionList", {
  templateUrl: URL_BASE + "resources/tpl/versionList.html",
  controller: VersionListController,
  bindings: { versiones: '<' }	
});
