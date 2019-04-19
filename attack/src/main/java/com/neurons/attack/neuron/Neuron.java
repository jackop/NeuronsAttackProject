package com.neurons.attack.neuron;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import com.neurons.attack.activation.ActivationFunction;
import com.neurons.attack.activation.LinearFunction;
import com.neurons.attack.activation.SigmoidalFunction;

public class Neuron {
	ActivationFunction function = new SigmoidalFunction();
//	ActivationFunction function = new LinearFunction();
	
	protected ArrayList<Double> inputs;
	protected ArrayList<Double> weights;
	private final static Integer RANDOM_FROM = -1;
	private final static Integer RANDOM_TO = 1;
	
	public Neuron(int numberOfInputs) {
		List<Double> random = randomDoubleValue(numberOfInputs)
			.stream().collect(Collectors.toList());
		
		random.forEach(value -> System.out.println(value));
		
		System.out.println(function.calculate(random, random));
	}
	
	private List<Double> randomDoubleValue(int numberOfInputs) {
		return DoubleStream.iterate(0, n -> numberOfInputs).limit(numberOfInputs)
				.map(n -> generateRandom(RANDOM_FROM, RANDOM_TO))
	            .boxed().collect(Collectors.toList());
	}
	
	private Double generateRandom(int start, int end) {
		return start + (new Random().nextDouble() * (end - start));
	}
}
