package com.neurons.attack.activation;

import java.util.List;

public class SigmoidalFunction implements ActivationFunction {
	
	private static double result = 0;
	
	/**
	 * Calculate Activation Function - Sigmoid type
	 */
	
	@Override
	public double calculate(List<Double> inputs, List<Double> weights) {
		inputs.forEach(input-> result += function(input, input));
		inputs.clear();
		return result;
	}

	@Override
	public double function(double inputValue, double weightValue) {
		return 1.0f / (1.0f + (float) Math.exp(-inputValue));
	}

}
