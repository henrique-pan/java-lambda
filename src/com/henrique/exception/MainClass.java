package com.henrique.exception;

public class MainClass {
	public static void main(String[] args) {
		double[] values = {1.0, 2.0, 3.0, 4.0};
		
		DoubleNumericArrayFunc average = (n) -> {
			double sum = 0;
			if(n.length == 0) {
				throw new EmptyArrayException();
			}
			for(int i = 0; i < n.length; i++) {
				sum += n[i];
			}
			
			return sum / n.length;
		};
		
		try {
			System.out.println("Average: " + average.func(values));
			System.out.println("Average: " + average.func(new double[0]));
		} catch (EmptyArrayException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
