package com.henrique.function;

import java.util.function.Function;

public class MainClass {
	public static void main(String[] args) {
		UseFunction useFunction = new UseFunction();

		String result;	
		
		Function<String, String> fn = parameter -> "Method Implementation: " + parameter;
		result = useFunction.add("Function<T, R> from java.util.function! ", fn);		
		System.out.println(result);
		
		// Passing as argument:
		result = useFunction.add("Passing a Lambda as Argument!", parameter -> { 
			return "Method Implementation: " + parameter;	
		});
		System.out.println(result);
	}
}
