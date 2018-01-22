package com.henrique.capture;

public class VarCapture {

	public static void main(String[] args) {
		// A local variable that can be captured
		int num = 10;

		MyFunc myLambda = (n) -> {
			// This use of num is OK. It does not modify num.
			int v = num + n;

			// However the following is illegal because it attempts to modify the value of num.
			// Even if the variable is not declared as final, it should work as one.
			// num++;

			return v;
		};

		System.out.println(myLambda.func(10));
	}

}
