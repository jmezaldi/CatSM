app = angular.module('catalogo');

function SolucionListController($scope, $rootScope, $http, $state, 
		$timeout, Solucion) {
	var ctrl = this;
	
	$rootScope.title = "Lista de soluciones";//TODO fix: update after select solucion 
	
	Solucion.query(function(soluciones) {
		$scope.soluciones = soluciones;		
        $timeout(function () {            
        	$('#tblList').DataTable( {
        		"pagingType": "full_numbers",
        		"bPaginate": true,
        		"bLengthChange": true,		
        		"dom": 'lBfrtip',
        		"buttons": [{
        			extend: 'excelHtml5',
        			text: 'Excel'
        		}, {
        			text: 'Nuevo',
        			action: function ( e, dt, node, config ) {        				
        				$state.go('solucion.item', {id: 0});
        			}
        		}
        		],
        		"columnDefs": []
        	});
        }, 400);//after angular updates.//TODO improve this event        
	});
}
app.component("solucionList", {
  templateUrl: URL_BASE + "resources/tpl/solucionList.html",
  controller: SolucionListController
});
