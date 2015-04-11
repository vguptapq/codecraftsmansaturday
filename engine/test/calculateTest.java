package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import main.Calculator;
import main.Operations;

import org.junit.Before;
import org.junit.Test;

public class calculateTest {
	Calculator calculator;

	@Before
	public void setUp() {
		calculator = new Calculator();
	}

	@Test(expected = Exception.class)
	public void testforexist() throws Exception {
		Double result = calculator.CalculateThisSetOfStuff(null, null);
		assertEquals(0.00, result, 0.00);
	}

	@Test(expected = Exception.class)
	public void testfornulloperation() throws Exception {
		List<Double> inputs = Arrays.asList(0.0, 0.0);
		Double result = calculator.CalculateThisSetOfStuff(inputs, null);
		assertEquals(0.00, result, 0.00);
	}

	@Test(expected = Exception.class)
	public void testfornullinputs() throws Exception {
		Double result = calculator
				.CalculateThisSetOfStuff(null, Operations.ADD);
		assertEquals(0.00, result, 0.00);
	}

	@Test(expected = Exception.class)
	public void testfortoomanyinputs() throws Exception {
		List<Double> inputs = Arrays.asList(1.38, 2.56, 4.3);
		Double result = calculator.CalculateThisSetOfStuff(inputs,
				Operations.ADD);
		assertEquals(0.00, result, 0.00);
	}

	@Test(expected = Exception.class)
	public void testfortoofewinputs() throws Exception {
		List<Double> inputs = Arrays.asList(1.38);
		Double result = calculator.CalculateThisSetOfStuff(inputs,
				Operations.ADD);
		assertEquals(0.00, result, 0.00);
	}

	@Test(expected = Exception.class)
	public void testfornoinputs() throws Exception {
		List<Double> inputs = Arrays.asList();
		Double result = calculator.CalculateThisSetOfStuff(inputs,
				Operations.ADD);
		assertEquals(0.00, result, 0.00);
	}

	@Test
	public void testforsumzero() throws Exception {
		List<Double> inputs = Arrays.asList(0.0, 0.0);
		Double result = calculator.CalculateThisSetOfStuff(inputs,
				Operations.ADD);
		assertEquals(0.00, result, 0.00);
	}

	@Test
	public void testforsumodoppositesigns() throws Exception {

		List<Double> inputs = Arrays.asList(1.0, -1.0);
		Double result = calculator.CalculateThisSetOfStuff(inputs,
				Operations.ADD);
		assertEquals(0.00, result, 0.00);
	}

	@Test
	public void testformultiply() throws Exception {

		List<Double> inputs = Arrays.asList(2.0, 2.0);
		Double result = calculator.CalculateThisSetOfStuff(inputs,
				Operations.MULTIPLY);
		assertEquals(4.00, result, 0.00);
	}

	@Test
	public void testForDivisionOfTwoDivisiblePositiveNumbers() throws Exception {
		List<Double> inputs = Arrays.asList(4.0, 2.0); 
		Double result = calculator.CalculateThisSetOfStuff(inputs,
				Operations.DIVIDE);
		assertEquals(2.0, result, 0.00); 

	}

	@Test(expected = Exception.class)
	public void testForDivisionByZero() throws Exception {
		List<Double> inputs = Arrays.asList(4.0, 0.0); 
		Double result = calculator.CalculateThisSetOfStuff(inputs,
				Operations.DIVIDE);
		assertEquals(0.0, result, 0.00); 

	}

}
