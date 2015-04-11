package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import main.Calculator;
import main.Operations;

import org.junit.Test;

public class calculateTest {

	@Test(expected=Exception.class)
	public void testforexist() throws Exception {
		Calculator calculator = new Calculator ();
		Double result = calculator.CalculateThisSetOfStuff(null, null);
	}

	@Test(expected=Exception.class)
	public void testfornulloperation() throws Exception {
		Calculator calculator = new Calculator ();
		List<Double> inputs = Arrays.asList(0.0,0.0);
		Double result = calculator.CalculateThisSetOfStuff(inputs, null);
	}

	@Test(expected=Exception.class)
	public void testfornullinputs() throws Exception {
		Calculator calculator = new Calculator ();
		Double result = calculator.CalculateThisSetOfStuff(null, Operations.ADD);
	}

	@Test(expected=Exception.class)
	public void testfortoomanyinputs() throws Exception {
		Calculator calculator = new Calculator ();
		List<Double> inputs = Arrays.asList(1.38, 2.56, 4.3);
		Double result = calculator.CalculateThisSetOfStuff(inputs, Operations.ADD);
		assertEquals (result, 3.94, 0.00);
	}

	@Test(expected=Exception.class)
	public void testfortoofewinputs() throws Exception {
		Calculator calculator = new Calculator ();
		List<Double> inputs = Arrays.asList(1.38);
		Double result = calculator.CalculateThisSetOfStuff(inputs, Operations.ADD);
		assertEquals (result, 3.94, 0.00);
	}

	@Test(expected=Exception.class)
	public void testfornoinputs() throws Exception {
		Calculator calculator = new Calculator ();
		List<Double> inputs = Arrays.asList();
		Double result = calculator.CalculateThisSetOfStuff(inputs, Operations.ADD);
		assertEquals (result, 3.94, 0.00);
	}
	
	@Test
	public void testforsumzero() throws Exception {
		Calculator calculator = new Calculator ();
		List<Double> inputs = Arrays.asList(0.0,0.0);
		Double result = calculator.CalculateThisSetOfStuff(inputs, Operations.ADD);
		assertEquals (result, 0.00, 0.00);
	}
	
	@Test
	public void testforsumodoppositesigns() throws Exception {
		Calculator calculator = new Calculator ();
		List<Double> inputs = Arrays.asList(1.0,-1.0);
		Double result = calculator.CalculateThisSetOfStuff(inputs, Operations.ADD);
		assertEquals (result, 0.00, 0.00);
	}
	
	@Test
	public void testforsubtract() throws Exception {
		Calculator calculator = new Calculator ();
		List<Double> inputs = Arrays.asList(1.0,1.0);
		Double result = calculator.CalculateThisSetOfStuff(inputs, (Operations) 4);
		assertEquals (result, 0.00, 0.00);
	}
	
	
}
