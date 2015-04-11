package main;

import java.util.List;

public class Calculator implements CalculateThis {

	public Calculator() {
		super();
	}

	public Double CalculateThisSetOfStuff(List<Double> inputs,
			Operations operation) throws Exception {
		if (inputs.size() != 2) {
			throw new Exception();
		}
		switch (operation) {
		case ADD:
			return inputs.get(0) + inputs.get(1);
		case MULTIPLY:
			return inputs.get(0) * inputs.get(1);
		default:
			break; 
		}
		return 0.0;
	}

}
