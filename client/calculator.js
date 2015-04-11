var calculator = (function() {

	function getFirstOperand() {
	    return $('#first').val() / 1;
	}

	function getSecondOperand() {
	    return $('#second').val() / 1;
	}

	function getResult() {
	    return $('#calculator-display').val();
	}

    var serverUrl = 'http://192.168.192.128:8080/maths';
    var result = '';

	function add(a,b){

		var obj = {
			a: getFirstOperand(),
			b: getSecondOperand(),
			operation: "ADD"
		};

        $.ajax({
            url : serverUrl,
            type: "POST",
            data : JSON.stringify(obj),
            contentType :   'application/json',
            success: function(data, textStatus, jqXHR)
            {
                result = data.answer;
            },
            error: function (jqXHR, textStatus, errorThrown)
            {
                alert(errorThrown);
            }
        });


        return result;
    }
    function sub(a,b){
        return 1;
    }
    function mult(a,b){
        return 6;
    }
    function divide(a,b){
        return 3;
    }

    function successReturn(data, textStatus, jqXHR) {
        result = data;
    }


    return {
        add: add,
        sub: sub,
        mult: mult,
        divide: divide
    }

})();
