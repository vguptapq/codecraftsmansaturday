'use strict';

describe('calculator', function() {

	var c = calculator;

	beforeEach(function() {
		spyOn($, 'ajax').and.callFake( function (params) {
			return 2;
		});
	});

	it('should be defined', function() {
		expect(c).toBeDefined();
	});

	it('add 1 and 1', function(){
		expect(c.add(1,1)).toEqual(2);
	});

	it('should return 1 when subtracting 2 from 1', function() {
		expect(c.sub(2,1)).toEqual(1);
	});

	it('should return 6 when multiplying 3 by 2', function() {
		expect(c.mult(3,2)).toEqual(6);
	});

	it('should return 3 when dividing 6 by 2', function() {
		expect(c.divide(6,2)).toEqual(3);
	});

	it('should send call send when we send add', function() {

		c.add(1,1);
		expect(postMock).toHaveBeenCalled();
	});

	xit('should return hello when we call the server', function() {
		spyOn( $, 'post' ).andCallFake( function (params) {
			params.success({foo: '3'});
		});
		//var postMock = spyOn($, 'post').and.returnValue('hello');
		debugger;
		var result = c.add(2,1);
		expect(result).toEqual('3');
	});
6
});
