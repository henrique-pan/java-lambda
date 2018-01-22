package com.henrique.exception;

@FunctionalInterface
public interface DoubleNumericArrayFunc {

	double func(double[] n) throws EmptyArrayException;
	
}
