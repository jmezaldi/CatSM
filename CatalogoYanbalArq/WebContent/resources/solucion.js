var newsolucionId;
var addUrl = "app/solucion/add";
var deleteUrl = "app/solucion/delete";
var updateUrl = "app/solucion/update";

function setUpdateForm(element,estado){
	newsolucionId = document.solucionForm.id.value;
	trElement = document.getElementById(element);
	document.solucionForm.id.value = element;
	document.solucionForm.nombre.value = trElement.children[1].innerHTML;
	document.solucionForm.descripcion.value = trElement.children[2].innerHTML;
	changeSelectText(document.solucionForm.codDatoVertical, trElement.children[3].innerHTML);
	changeSelectText(document.solucionForm.codDatoAmbito, trElement.children[4].innerHTML);
	changeSelectText(document.solucionForm.codDatoTipo, trElement.children[5].innerHTML);
	changeSelectText(document.solucionForm.codDatoArea, trElement.children[6].innerHTML);
	document.solucionForm.estado.value = estado;
	document.solucionForm.newSolucion.disabled = false;
	//document.solucionForm.deleteSolucion.disabled = false;
	document.solucionForm.action = projectUrl + updateUrl;
}

function setAddForm(){
	document.solucionForm.nombre.value = "";
	document.solucionForm.descripcion.value = "";
	changeSelectText(document.solucionForm.codDatoVertical, "--");
	changeSelectText(document.solucionForm.codDatoAmbito, "--");
	changeSelectText(document.solucionForm.codDatoTipo, "--");
	changeSelectText(document.solucionForm.codDatoArea, "--");
	document.solucionForm.newSolucion.disabled = true;
	//document.solucionForm.deletesolucion.disabled = true;
	document.solucionForm.action = projectUrl + addUrl;
}

function setDeleteForm() {
	document.solucionForm.action = projectUrl + deleteUrl;
	return true;
}

