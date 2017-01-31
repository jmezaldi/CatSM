angular.module('catalogo', ["ui.router", "ngResource", "ncy-angular-breadcrumb", 
                            'datatables', 'datatables.buttons', 'datatables.bootstrap',
                            'angular-growl', 'ngAnimate', 'angular-loading-bar',
                            'angular.filter'])

.config(function($stateProvider, $urlRouterProvider) {
	$stateProvider
		.state("main", {
			url: '/',
			template : "<div class='ui active centered inline loader'></div>",
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
		    resolve:{
				aplicaciones: function(Aplicacion){					
					return Aplicacion.query().$promise;
		        }
		    },
		    ncyBreadcrumb: {
		    	label: 'Aplicaciones'
	        }
		})
		.state("aplicacion.item", {
			parent: 'aplicacion',
		    url: '/{id}',
		    component: 'aplicacion',
		    resolve:{
				aplicacion: function(Aplicacion, $stateParams){					
		        	if($stateParams.id == 0){
		        		return new Aplicacion();
			     	}
		        	return Aplicacion.get({ id: $stateParams.id }).$promise;
		        }
		    },
		    ncyBreadcrumb: {
		       label: '{{$$childHead.$ctrl.label}}'
	        }
		})
		.state("baseDatos", {
			url: '/baseDatos',
			component: 'baseDatosList',
			resolve:{
				basesDatos: function(BaseDatos){					
					return BaseDatos.query().$promise;
				}
			},
			ncyBreadcrumb: {
				label: 'Bases de Datos'
			}
		})
		.state("softwareBase", {
			url: '/softwareBase',
			component: 'softwareBaseList',
			resolve:{
				softwaresBase: function(SoftwareBase){					
					return SoftwareBase.query().$promise;
				}
			},
			ncyBreadcrumb: {
				label: 'Softwares Base'
			}
		})
		.state("servidor", {
			url: '/servidor',
			component: 'servidorList',
			resolve:{
				servidores: function(Servidor){					
					return Servidor.query().$promise;
				}
			},
			ncyBreadcrumb: {
				label: 'Servidores'
			}
		})
		.state("cluster", {
			url: '/cluster',
			component: 'clusterList',
			resolve:{
				clusters: function(Cluster){					
					return Cluster.query().$promise;
				}
			},
			ncyBreadcrumb: {
				label: 'Clusters'
			}
		})
		//TODO improve: avoid duplicated request
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
.config(['cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
	cfpLoadingBarProvider.includeSpinner = false;
}])
.factory('appInterceptor', function($q, $window, $state, $rootScope){
	$rootScope.pendingRequests = 0;
	//TODO handle response length = 0
	return {    	
    	request: function (config) {
            return config || $q.when(config);
        },
        requestError: function(rejection) {
            return $q.reject(rejection);
        },
        response: function(response){
        	if(response.data.length == 0){
        		$rootScope.$broadcast("HttpError", 500);//error
        	}
            return response || $q.when(response);
        },
        responseError: function(responseError) {
        	var status = responseError.status;        	
            if (status == 401) {  
            	//TODO IMPROVE redirect
            	//$window.location.href = URL_BASE + "?sessionExpired";
            	$window.location.reload();
                return;
            }
        	$rootScope.$broadcast("HttpError", status);        	
            return $q.reject(responseError);
        }
    }
})
.config(['$httpProvider',function($httpProvider) {
    $httpProvider.interceptors.push('appInterceptor');
    //TEST avoid cache
    if (!$httpProvider.defaults.headers.get) {
        $httpProvider.defaults.headers.get = {};    
    }
    $httpProvider.defaults.headers.get['Cache-Control'] = 'no-cache';
    $httpProvider.defaults.headers.get['Pragma'] = 'no-cache';
}])
.controller("mainCtrl", function ($scope, $rootScope, $http, $window, growl) {	
	$rootScope.title = "Inicio";
	$scope.isSidebar = true;
	
	$scope.$on("HttpError", function(event, status){
		if(status == 500){
			growl.error('Error en el servidor. Reintente. Si persiste, contacte a Soporte.');
		}
		else if ((status >= 400) && (status < 600) ) {
        	//
        }else{        	
        	growl.error('No hay conexión a internet. Reintente más tarde.');
        }		
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
		vertical: 	2,
		ambito: 	3,
		tipo: 		4,
		area: 		22,
		
		criticidad: 7,
		exposicion: 8,
		publico: 	19,
		custodio: 	9,
		tipoApp: 	18,
		
		tipoAmbiente: 1,
		tipoServidor: 14,
		ubicacionServidor: 15,
		tipoContrato: 16,
		tecnologiaServidor: 17		
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
.factory('Aplicacion', function($resource) {
	return $resource(URL_API + "/aplicaciones/:id", { id: '@id' }, {//aplicacionesVersion
		update: {
			method: 'PUT'
	    }
	});
})
.factory('BaseDatos', function($resource) {
	return $resource(URL_API + "/bases_datos/:id", { id: '@id' }, {//basesDatosVersion
		update: {
			method: 'PUT'
		}
	});
})
.factory('SoftwareBase', function($resource) {
	return $resource(URL_API + "/softwares_base/:id", { id: '@id' }, {
		update: {
			method: 'PUT'
		}
	});
})
.factory('Servidor', function($resource) {
	return $resource(URL_API + "/servidores/:id", { id: '@id' }, {
		update: {
			method: 'PUT'
		}
	});
})
.factory('Cluster', function($resource) {
	return $resource(URL_API + "/clusters/:id", { id: '@id' }, {
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
.run(function ($rootScope, DTDefaultOptions) {
	DTDefaultOptions.setOption('stateSave', true);
	DTDefaultOptions.setOption('pagingType', 'full_numbers');
});