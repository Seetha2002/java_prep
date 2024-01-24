package com.hema.demo;

import java.util.Scanner;

public class swap {
	public static void main(String []args) {
		int a,b;
		
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		swapp(a,b);
	    System.out.println(a+" "+b);
	}
	static void swapp(int n , int m) {
		int temp;
	    temp=n;
	    n=m;
	    m=temp;
	}

}
