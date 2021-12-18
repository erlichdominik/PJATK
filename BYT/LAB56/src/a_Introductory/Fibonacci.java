package a_Introductory;

import org.junit.Test;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(new Fibonacci().fib(5));
	}
	public int fib(int n) {
		switch (n) {
			case 0: return 0;
			case 1: return 1;
			default: return fib(n - 1) + fib(n - 2);
		}
	}
}

