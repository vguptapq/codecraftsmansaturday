'use strict';

describe('calculator', function() {

	var c = calculator;

	it('should be defined', function() {
		expect(c).toBeDefined();
	});

	it('add 1 and 1', function(){
		expect(c.add(1,1)).toEqual(2);
	});
6
});
