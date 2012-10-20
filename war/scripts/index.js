window.onload = function() {
	console.log("enter");
	initialize();
};

function initialize() {
	var form = document.getElementById("mbtiform");
	form.addEventListener("submit", function() {
		console.log("test");
		return false;
	});
};