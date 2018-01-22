package com.henrique.methodreference.instancemethods;

public class MethodRefDemo2 {

	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		String inStr = "Lambdas add power to Java";
		String outStr;
		
		MyStringOps myStringOps = new MyStringOps();
		outStr = stringOp(myStringOps::strReverse, inStr);
		
		System.out.println("Original string: " + inStr);
		System.out.println("String reversed: " + outStr);
	}
	
}
