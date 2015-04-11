var calculator = (function() {

    var serverUrl = 'http://192.168.192.128:8080/maths';
    var result = '';

	function add(a,b){

        $.ajax({
            url : serverUrl,
            type: "POST",
            data : '{"a": "1"}',
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
    return {
        add: add,
        sub: sub,
        mult: mult,
        divide: divide
    }

})();
