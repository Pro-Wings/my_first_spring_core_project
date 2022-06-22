package com.pro.wings;

public class HelloWorld {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("setter called for message");
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}
	
	

}
