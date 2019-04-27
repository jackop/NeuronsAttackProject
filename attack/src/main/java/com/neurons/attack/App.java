package com.neurons.attack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.neurons.attack.neuron.Neuron;
import com.neurons.attack.utils.CSVReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Neurons Attack!" );
        
//        Neuron neuron = new Neuron(7);
        
        CSVReader csvReader = new CSVReader();
        
        csvReader.read();
    }
}
