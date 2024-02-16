package Recursion;

public class fibonacci {

	public static void main(String[] args) {
		System.out.println(fibo(6));

	}
	static int fibo(int n) {
		// base condition
		if(n<2) {
			return n;
		}
		// This is not the tail recursion
		return fibo(n-1)+fibo(n-2);
	}

}
