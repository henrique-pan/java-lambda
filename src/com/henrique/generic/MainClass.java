package com.henrique.generic;

public class MainClass {

	public static void main(String[] args) {
		GenericFunc<String> reverse = str -> {
			String result = "";
			for(int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		
		System.out.println(reverse.func("This is a big phrase"));
		System.out.println(reverse.func("esarhp gib a si sihT"));
	
	
		GenericFunc<Integer> factorial = (n) -> {
			int result = 1;
			for(int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		};
	
		System.out.println("The factorial of 3 is : " + factorial.func(3));
		System.out.println("The factorial of 5 is : " + factorial.func(5));
	}
	
	
	
}
