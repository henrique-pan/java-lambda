package com.henrique.methodreference.classinstancemethods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Shipment {

	public double calculateWeight() {
		double weight = 0;
		weight += weight * 2;
		return weight;
	}

	public List<Double> calculateOnShipments(List<Shipment> l, Function<Shipment, Double> f) {
		List<Double> results = new ArrayList<>();
		for (Shipment s : l) {
			results.add(f.apply(s));
		}
		return results;
	}
}
