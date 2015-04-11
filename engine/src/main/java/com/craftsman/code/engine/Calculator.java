package src.main.java.com.craftsman.code.engine;

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
		Double result =null;
		switch (operation) {
		case ADD:
			result = inputs.get(0) + inputs.get(1);
			break;
		case MULTIPLY:
			result = inputs.get(0) * inputs.get(1);
			break;
		case DIVIDE:
			if (inputs.get(1) == 0) {
				throw new Exception();
			}
			result = inputs.get(0) / inputs.get(1);
			break;
		}

		return result;
		
	}

}
