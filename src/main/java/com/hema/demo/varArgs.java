package com.hema.demo;

import java.util.Arrays;

public class varArgs {
	public static void main(String []args) {
		num(2,3,4,5,6,7);
		num1(1,2,3,"Hema","Sri","Seetha");
	}
	static void num(int...a) {
		System.out.println(Arrays.toString(a));
	}
	static void num1(int a, int b, int c, String...v) {
		System.out.println(a + " " + b + " " + c + " " + Arrays.toString(v));
	}

}
