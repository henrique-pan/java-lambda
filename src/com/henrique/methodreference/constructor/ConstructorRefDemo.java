package com.henrique.methodreference.constructor;

public class ConstructorRefDemo {
	
	public static void main(String[] args) {
		MyFunc<Integer> myClassCons = MyClass<Integer>::new;
		
		MyClass<Integer> mc = myClassCons.func(100);
		
		System.out.println("Val in mc is: " + mc.getVal());
	}
	
}
