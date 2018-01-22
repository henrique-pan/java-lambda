package com.henrique;

/*
 But using the @FunctionalInterface annotation, the compiler will trigger an error in response to 
 any attempt to break the predefined structure of a functional interface. 
 It is also a very handy tool to make your application architecture easier to understand for other developers.
 */
@FunctionalInterface
public interface Foo {
	
	// Public
	String method(String string);
	
}
