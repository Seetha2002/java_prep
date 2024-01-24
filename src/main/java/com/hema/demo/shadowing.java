package com.hema.demo;

public class shadowing {
	static int x=40;//this value will be shadowed at line 8
	public static void main(String []args) {
		System.out.println(x);
		int x=90;
		System.out.println(x);
		fun();
		
		
	}
	static void fun() {
		System.out.println(x);
	}

}
