package com.tns.exceptionhandling;

public class Demo {
	public static void main(String[] args) {
		int d=0;
		try {
		   int a=42/d;
		}
		catch(ArithmeticException e){
			System.out.println("Exception handled"+e.getMessage());
		}
		catch(NullPointerException c) {
			System.out.println("exception handled"+c.getMessage());
		}
		finally {
			System.out.println("it will always execute");
		}
		System.out.println("will not be printed");
	}

}
