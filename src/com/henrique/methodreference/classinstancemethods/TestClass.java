package com.henrique.methodreference.classinstancemethods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestClass {

	public static void main(String[] args) {
		Shipment shipment = new Shipment();
		
		List<Shipment> l = new ArrayList<Shipment>();

		// Using an anonymous class
		shipment.calculateOnShipments(l, new Function<Shipment, Double>() {
			public Double apply(Shipment s) { // The object
				return s.calculateWeight(); // The method
			}
		});

		// Using a lambda expression
		shipment.calculateOnShipments(l, s -> s.calculateWeight());

		// Using a method reference
		shipment.calculateOnShipments(l, Shipment::calculateWeight);
	}

}
