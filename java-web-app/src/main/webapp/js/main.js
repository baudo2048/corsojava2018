function performClick(){
	$.ajax({
		url: './MainServlet',
		method: 'GET',
		success: function(dati, status, xhr){
			alert('Received ' + dati.greeting);
		}
	});
}

$(document).ready(function(){
	var button = document.createElement('button');
	button.innerHTML = 'CLICCA';
	button.onclick = (e)=>{
		performClick();
	};
	
	$('body').append(button);
});




