app = angular.module('catalogo');

function AplicacionListController($scope, $state, $filter, $compile,
		DTOptionsBuilder, DTColumnBuilder, DTColumnDefBuilder) {
	function wrapAplicacion(aplicacion){
		aplicacion.isOpen = false; 
		return aplicacion;
	};	
	function openVersiones(row, aplicacion){
		var newScope = $scope.$new(true, $scope);
    	if($scope.group[aplicacion.id] == undefined){
    		newScope.versionesParam = [];
    	}else{
    		newScope.versionesParam = 
    			$filter('removeWith')($scope.group[aplicacion.id], {corVersion: null});
    	}
        row.child(
        	$compile("<version-list versiones='versionesParam'></version-list>")(newScope),
        	'child').show();
	}
	$scope.updateList = function(aplicacion, isNew){		
		if(aplicacion != null){
			if(isNew){
				$scope.aplicaciones.push(wrapAplicacion(aplicacion));
			}else{				
				$scope.aplicaciones.forEach(function(item, index){
					if(item.id == aplicacion.id){	
						var isOpen = $scope.aplicaciones[index].isOpen;
						$scope.aplicaciones[index] = aplicacion;
						$scope.aplicaciones[index].isOpen = isOpen;
					}
				});
			}
		}
	}
	this.$onInit = function() {
		$scope.group = $filter('groupBy')(this.aplicaciones, 'id');
		$scope.aplicaciones = [];
		Object.keys($scope.group).forEach(function(key, index) {
			$scope.aplicaciones.push(wrapAplicacion($scope.group[key][0]));
		});		
		
	    $scope.dtOptions = DTOptionsBuilder.newOptions()
	     	.withBootstrap()
	    	.withDOM('lBfrtip')
	    	.withButtons([
	            'excel',
	            {
	                text: 'Nuevo',
	                action: function (e, dt, node, config) {
	                	$state.go('aplicacion.item', {id: 0});
	                }
	            }
	        ])
	        .withOption('rowCallback', function(tr, data){
	        	var api = this.api();
	            var row = api.row(tr);
	            var aplicacion = $scope.aplicaciones.find(function(item){
	            	return item.id == parseInt(data[0]);
	            });
	            if(aplicacion.isOpen){	            	
	            	openVersiones(row, aplicacion);
	            }
	        });
	        ;
	    $scope.dtColumnDefs = [
	        DTColumnDefBuilder.newColumnDef(2).notSortable()
       	]
	    $scope.dtInstance = {};
	};
	$scope.showVersion = function(aplicacion, $event){
		var tr = $event.currentTarget.closest('tr');
		var row = $scope.dtInstance.DataTable.row(tr);
		if ( row.child.isShown() ) {
            row.child.hide();
            aplicacion.isOpen = false;
        }
        else {
        	aplicacion.isOpen = true;
        	openVersiones(row, aplicacion);
        }
	}
	
}
app.component("aplicacionList", {
  templateUrl: URL_BASE + "resources/tpl/aplicacionList.html",
  controller: AplicacionListController,
  bindings: { aplicaciones: '<' }	
});
