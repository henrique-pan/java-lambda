package com.henrique;

//http://www.oracle.com/webfolder/technetwork/tutorials/obe/java/Lambda-QuickStart/index.html

public class MainClass {

	public static void main(String[] args) {
		UseFoo useFoo = new UseFoo();
		
		String result;
		
		// Single line
		Foo singleLineFoo = parameter -> "Method Implementation: " + parameter;
		
		result = useFoo.add("As Lambda (Single Line)", singleLineFoo);
		System.out.println(result);
		
		// Lambda Body		
		Foo lambBlockFoo = (String parameter) -> { 
			return "Method Implementation: " + parameter; 
		};
		result = useFoo.add("As Lambda (Lambda Body)", lambBlockFoo);
		System.out.println(result);
		
		
		Foo innerClassFoo = new Foo() {
		    @Override
		    public String method(String string) {
		        return "Method Implementation: " + string;
		    }
		};
		
		result = useFoo.add("As Inner Class", innerClassFoo);
		System.out.println(result);
		
		
		System.out.println(innerClassFoo.method("Calling Directely"));
		
		MyNumber myNumber = () -> 3.14;
		System.out.println("Lambda with no parameters, called directely: " + myNumber.getValue());
	}
	
}
