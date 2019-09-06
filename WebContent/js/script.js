//Paso 1. Crear el objeto Ajax
let xhr = new XMLHttpRequest();

window.onload = function()
{
	 document.querySelector("#btnPotencia").addEventListener("click", enviarAjax);
}
function enviarAjax( ) {
	//paso2. abrir la conexion 
	xhr.open("POST", "CalcularPotenciaServlet");
	//traer los valores de los txtBoxes 
	var miForm = new FormData( );
	var miBase = document.getElementById("txtBase").value;
	var miExponente= document.getElementById("txtExpo").value;
	
	miForm.append("txtBase", miBase);
	miForm.append("txtExpo", miExponente);
	//paso3. Cargamos la funcion en el metodo onload
	xhr.onload = funcionCallBack;
	
	//paso4. enviar Ajax
	xhr.send(miForm);
}
function funcionCallBack () {
	if(xhr.status=200) {
		document.getElementById("divRes").innerHTML+=xhr.responseText;
	}
}