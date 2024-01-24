package com.hema.demo;

public class demo {
	public static void main(String []args) {
		String name="hema";
		greeting(name);
		int sum;
		sum=addtwonum(20,30);
		System.out.println(sum);
		test(20,30,"hema");
	}
	static void greeting( String naaam) {
		System.out.println("Hi" + naaam);
	}
	static int addtwonum(int a, int b) {
		return a+b;
	}
	static void test(int a, int b, String c) {
		
	}

}
