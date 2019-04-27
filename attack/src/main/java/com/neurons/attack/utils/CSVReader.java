package com.neurons.attack.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.neurons.attack.models.Flower;

public class CSVReader {

	public Flower read() {
		String csvFile = "/Users/jacekkoprowski/eclipse-workspace/NeuronsAttackProject/attack/iris.csv";
		String line = "";
		String cvsSplitBy = ",";
		Flower flower = new Flower();
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			while ((line = br.readLine()) != null) {
				String[] country = line.split(cvsSplitBy);
				System.out.println(country[1]);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return flower;
	}

}
