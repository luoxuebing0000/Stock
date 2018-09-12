window.onload = function() {

	let register = document.getElementById("register");
	register.onclick = function() {
		alert("hello");
		window.location.href = "/Server03/register.html";
	}

	let login = document.getElementById("login");
	login.onclick = function() {
		window.location.href = "/Server03";
	}

}