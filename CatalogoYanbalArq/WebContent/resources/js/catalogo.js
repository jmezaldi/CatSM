angular.module('catalogo', ["ui.router", "ngResource", "ncy-angular-breadcrumb", 
                            'datatables', 'datatables.buttons', 'datatables.bootstrap',
                            'angular-growl', 'ngAnimate'])

.config(function($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise("/")
	$stateProvider
		.state("main", {
			url: '/',
			template : "<div class='ui active centered inline loader'></div>",
		    controller: 'mainCtrl',
		    ncyBreadcrumb: {
	          label: 'Catálogo'
	        }
		})
		.state("solucion", {
			url: '/solucion',
		    component: 'solucionList',
		    resolve:{
				soluciones: function(Solucion){					
					return Solucion.query().$promise;
		        }
		    },
		    ncyBreadcrumb: {
	          label: 'Soluciones'
	        }		    	
		})	
		.state("solucion.item", {
			parent: 'solucion',
		    url: '/{id}',
		    component: 'solucion',
		    resolve:{
				solucion: function(Solucion, $stateParams){					
		        	if($stateParams.id == 0){
		        		return new Solucion();
			     	}
		        	return Solucion.get({ id: $stateParams.id }).$promise;
		        }
		    },
		    ncyBreadcrumb: {
		       label: '{{$$childHead.$ctrl.label}}'
	        }
		})
	    .state("aplicacion", {
			url: '/aplicacion',
		    component: 'aplicacionList',
		    ncyBreadcrumb: {
		    	label: 'Aplicaciones'
	        }
		})
	;
})
.config(['$qProvider', function ($qProvider) {
    $qProvider.errorOnUnhandledRejections(false);
}])
.config(function($breadcrumbProvider) {
    $breadcrumbProvider.setOptions({
      prefixStateName: 'main',
      template: 'bootstrap3'
    });
 })
.config(['growlProvider', function(growlProvider) {
  growlProvider.globalPosition('bottom-left');
  growlProvider.globalTimeToLive(5000);
  growlProvider.globalDisableCountDown(true);
  growlProvider.globalDisableCloseButton(true);
}])
.factory('appInterceptor', function($q, $window, $state, $rootScope){
    return {
        response: function(response){
            return response || $q.when(response);
        },
        responseError: function(responseError) {
        	console.log(responseError);
        	var status = responseError.status;        	
            if (status == 401) {  
            	//TODO IMPROVE redirect
            	//$window.location.href = URL_BASE + "?sessionExpired";
            	$window.location.reload();
                return;
            }else if ((status >= 400) && (status < 600) ) {
            	return $q.reject(responseError);
            }
        	$rootScope.$broadcast("HttpError", status);
            return;
        }
    }
})
.config(['$httpProvider',function($httpProvider) {
    $httpProvider.interceptors.push('appInterceptor');
}])
.controller("mainCtrl", function ($scope, $rootScope, $http, $window, growl) {	
	$rootScope.title = "Inicio";
	$scope.isSidebar = true;
	
	$scope.$on("HttpError", function(param){
		console.log(param);
		growl.error('No hay conexión a internet. Reintente más tarde.');
	});
	
	$http.get(URL_API + "/catalogo/tablas_codigos")
    .then(function(response) {
    	$rootScope.tablasCodigos = response.data;
    });
	$rootScope.estados = [0, 1];
	//$http.defaults.headers.common['test']= 'team'; 
	$scope.salir = function(){		
		$http.post(URL_LOGOUT)
		.then(function(response){
			$window.location.href = URL_BASE;
		});
	};
	$rootScope.codTabla = {
		vertical: 2,
		ambito: 3,
		tipo: 4,
		area: 22
	}
})
.filter('HTMLActive', function() {
    return function(estado) {        
        return estado? "Activo" : "Inactivo";
    };
})
.filter('TCDescripcionBy', function(TablasCodigos) {
    return function(codDato, codTabla) {
    	var codigo = TablasCodigos.getCodigo(codTabla, codDato);    	
    	return codigo == undefined ? "" : codigo.desAbreviada;
    };
})
.factory('Solucion', function($resource) {
	return $resource(URL_API + "/soluciones/:id", { id: '@id' }, {
		update: {
			method: 'PUT'
	    }
	});
})
//TODO improve: constants for tablas 
.factory('TablasCodigos', function($rootScope) {	
	var factory = {};
	factory.getCodigos = function(codTabla){
		var codigos = $rootScope.tablasCodigos.filter(function(item){
			return item.codTabla == codTabla;
		});
		return codigos;
	};
	factory.getCodigo = function(codTabla, codDato){
		var codigo = factory.getCodigos(codTabla).find(function(item){
			return item.codDato == codDato;
		});
		return codigo;
	};
	return factory;
 })
.run(function ($rootScope) {
	
});