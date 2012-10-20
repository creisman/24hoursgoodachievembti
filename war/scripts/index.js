window.onload = function() {
	initialize();
};

function initialize() {
	// Add form validation.
	var form = $("#mbtiform")[0];
	form.addEventListener("submit", function(e) {
		// If it doesn't validate then don't submit.
		console.log(validate());
		if(!validate()) {
			e.preventDefault();
		}
		//TODO this needs an error message.
	});
};

function validate() {
	var valid = true;
	var elements = $(".percentbox");
	elements.each(function(i, element) {
		var val = parseInt(element.value);
		if (isNaN(val) || element.value < 0 || element.value > 100) {
			$(element).addClass("error");
			valid = false;
		}
	});

	elements = $(".typeselect");
	elements.each(function(i, element) {
		console.log(element.value);
		if (element.value == "") {
			$(element).addClass("error");
			valid = false;
		}
	});

	return valid;
}