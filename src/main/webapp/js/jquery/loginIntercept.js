function loginIntercept(data){
	if(data.status == 200 && data.statusText == "OK" && data.responseText){
		document.body.innerHTML = data.responseText;
	}
}