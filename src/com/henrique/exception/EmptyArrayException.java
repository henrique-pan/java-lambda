package com.henrique.exception;

public class EmptyArrayException extends Exception {

	private static final long serialVersionUID = 3701488277217399813L;

	public EmptyArrayException() {
		super("Array Empty");
	}
}
