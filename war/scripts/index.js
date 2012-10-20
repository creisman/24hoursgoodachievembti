window.onload = function() {
	initialize();
};

/*
 * Adds a validator to the form so it won't submit if there's an error. It also
 * adds a listener on the drop downs so they delete the default option if it's
 * changed.
 */
function initialize() {
	// Add form validation.
	var form = $("#mbtiform")[0];
	form.addEventListener("submit", function(e) {
		var err = $("#errormessage")[0];
		// If it doesn't validate then don't submit.
		if(!validate()) {
			e.preventDefault();
			err.innerHTML = "Please make sure you have picked a " +
				"personality type and percentage between 0 and 100 for each " +
				"field.";
			return false;
		}
		
		err.innerHTML = "";
		return true;
	});
	
	// Remove the default option from checkboxes.
	$(".typeselect").each(function(index, element) {
		element.addEventListener("change", function(event) {
			// Remove the default decision if still present.
			var child = event.target.children[0];
			if (child.value == "") {
				$(child).remove();
			}
			
			// Set the string after percent.
			$(event.target).parents(".type").find(".percentlabel")[0].innerHTML = event.target.value;
		})
	});
	
	///TODO remove
	var elements = $(".percentbox").each(function(index, element) {
		element.value = 45;
	});
	
	elements = $(".typeselect").each(function(index, element) {
		element.selectedIndex = 2;
	});
};

/*
 * Tests that all the textboxes contain a number between 0 and 100 and that the
 * drop downs do not contain the default value. Adds the "error" class to all
 * elements that fail the test and then returns true if all passed, or false if
 * one or more failed.
 */
function validate() {
	var valid = true;
	var elements = $(".percentbox");
	elements.each(function(i, element) {
		var val = parseInt(element.value);
		if (isNaN(val) || element.value < 0 || element.value > 100) {
			$(element).addClass("error");
			valid = false;
		} else {
			// Remove the error if they've fixed it.
			$(element).removeClass("error");
		}
	});

	elements = $(".typeselect");
	elements.each(function(i, element) {
		if (element.value == "") {
			$(element).addClass("error");
			valid = false;
		} else {
			// Remove the error if they've fixed it.
			$(element).removeClass("error");
		}
	});

	return valid;
}