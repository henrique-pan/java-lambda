package com.henrique.methodreference.classinstancemethods;

@FunctionalInterface
public interface MyFunc<T> {

	boolean func(T v1, T v2);
	
}
