package com.henrique.methodreference.constructor;

@FunctionalInterface
public interface MyFunc<T> {
	
	MyClass<T> func(T n);
	
}
