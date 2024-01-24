package com.hema.demo;

import java.util.Scanner;

public class examples {
	
		public static void main(String []args) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			boolean ans=isPrime(n);
			System.out.println(ans);
			for(int i=100;i<=999;i++) {
				if(isArmstrong(i)) {
					System.out.println(i+" ");
				}
			}
		}
		static boolean isPrime(int n) {
			if(n<=1) {
				return false;
			}
			int c=2;
			while(c*c<=n) {
				if(n%c==0) {
					return false;
				}
				c+=1;
			}
			return true;
		}
		static boolean isArmstrong(int n) {
			int org=n;
			int sum=0;
			while(n>0) {
				int rem=n%10;
				n=n/10;
				sum=sum+rem*rem*rem;
			}
			return sum==org;
		}

}
