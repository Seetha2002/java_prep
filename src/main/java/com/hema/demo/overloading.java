package com.hema.demo;

public class overloading {
	public static void main(String []args) {
		fun(20,30);
		fun(20,30,40);
	}
	static void fun(int a, int b) {
		System.out.println(a+b);
	}
	static void fun(int a, int b, int c) {
		System.out.println(a+b+c);
	}

}
