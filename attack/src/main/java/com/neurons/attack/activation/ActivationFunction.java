package com.neurons.attack.activation;

import java.util.List;

public interface ActivationFunction {
	
	public double calculate(List<Double> inputs, List<Double> weights);
	
	public double function(double inputValue, double weightValue);
	
}
