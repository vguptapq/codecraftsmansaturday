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

	function setResult( text ) {
		$('#calculator-display').text(text);
	}

    var serverUrl = 'http://192.168.192.128:8080/maths';
    var result = '';

	function add(){

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
                setResult(data.answer);
            },
            error: function (jqXHR, textStatus, errorThrown)
            {
                alert(errorThrown);
            }
        });
    }
    function sub(){
        return 1;
    }
    function mult(){
        return 6;
    }
    function divide(){
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
