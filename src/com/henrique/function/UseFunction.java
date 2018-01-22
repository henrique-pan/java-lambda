package com.henrique.function;

import java.util.function.Function;

public class UseFunction {
	
	public String add(String string, Function<String, String> fn) {
	    return fn.apply(string);
	}
	
}
