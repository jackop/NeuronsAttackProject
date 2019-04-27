package com.neurons.attack.activation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class LinearFunction implements ActivationFunction {

	private static double result = 0;
	
	@Override
	public double calculate(List<Double> inputs, List<Double> weights, double bias) {
		DoubleStream.iterate(0, n -> inputs.size()-1)
		.map(n -> result += function(inputs.get((int) n), weights.get((int) n), bias))
        .boxed().collect(Collectors.toList());
//		inputs.clear();
		return result;
	}

	@Override
	public double function(double inputValue, double weightValue, double bias) {
		return weightValue * inputValue + bias;
	}

	

}
