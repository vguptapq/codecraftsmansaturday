'use strict';

describe('calculator', function() {

	var c = calculator;

	it('should be defined', function() {
		expect(c).toBeDefined();
	});

	it('add 1 and 1', function(){
		expect(c.add(1,1)).toEqual(2);
	});

	it('should return 1 when subtracting 2 from 1', function() {
		expect(c.sub(2,1)).toEqual(1);
	});
6
});
