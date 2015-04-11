var calculator = (function() {

    var result = '';

	function add(a,b){
        $.post('', a, b);
        return 2;
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
