function changeSelectValue(selectNode, value){
	for(var index=0;index<selectNode.length;index++){
		if(selectNode[index].value == value)
			selectNode.selectedIndex = index;
	}	
}

function changeSelectText(selectNode, value){
	for(var index=0;index<selectNode.length;index++){
		if(selectNode[index].text == value)
			selectNode.selectedIndex = index;
	}	
}
