angular.module('catalogo', ["ui.router", "ngResource"])
.config(function($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise("/")
	$stateProvider
		.state("main", {
			url: '/',
			template : "<div class='ui active centered inline loader'></div>",
		    controller: 'mainCtrl'
		})
		.state("solucion", {
			url: '/solucion',
		    component: 'solucionList'
		})	
		.state("solucion.item", {
			parent: 'solucion',
		    url: '/{id}',
		    component: 'solucion'
		});	
})
.config(['$qProvider', function ($qProvider) {
    $qProvider.errorOnUnhandledRejections(false);
}])
.controller("mainCtrl", function ($scope, $rootScope, $http) {
	$rootScope.title = "Inicio";
	$http.get(URL_API + "/catalogo/tablas_codigos")
    .then(function(response) {
    	$rootScope.tablasCodigos = response.data;
    });
	$rootScope.estados = [0, 1]; 
	//TODO add token
	$http.defaults.headers.common['test']= 'team'; 
})
.filter('HTMLActive', function() {
    return function(estado) {        
        return estado? "Activo" : "Inactivo";
    };
})
.factory('Solucion', function($resource) {
	return $resource(URL_API + "/soluciones/:id", { id: '@id' }, {
		update: {
			method: 'PUT'
	    }
	});
})
.factory('TablasCodigos', function($rootScope) {	
	var factory = {};
	factory.getCodigos = function(codTabla){
		var codigos = $rootScope.tablasCodigos.filter(function(item){
			return item.codTabla == codTabla;
		});
		return codigos;
	}
	return factory;
 })
.run(function ($rootScope) {
	
});