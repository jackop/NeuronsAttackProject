package com.neurons.attack.neuron;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class Neuron {
	
	protected ArrayList<Double> inputs;
	protected ArrayList<Double> weights;
	
	public Neuron(int numberOfInputs) {
		IntStream.range(0, numberOfInputs)
		.forEach(a -> System.out.println(randomDoubleValue(-1, 1)));
	}
	
	private Double randomDoubleValue(double start, double end) {
		Random random = new Random();
		double result = start + (random.nextDouble() * (end - start));
		
		return result;
	}
}
