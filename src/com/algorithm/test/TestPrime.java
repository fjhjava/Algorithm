package com.algorithm.test;

import java.util.List;
import java.util.Map;

import com.algorithm.math.Prime;

public class TestPrime {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		List<Integer> divisor = Prime.getDivisor(n);
		System.out.print("Divisor of integer " + n + ":");
		for (int d : divisor)
			System.out.print(" " + d);
		System.out.println();
		System.out.println();
		
		Map<Integer, Integer> primeFactor = Prime.getPrimeFactor(n);
		System.out.println("Prime factor of integer " + n + ":");
		for (Map.Entry<Integer, Integer> entry : primeFactor.entrySet()) {
			System.out.println("prime: " + entry.getKey() + ", times: " + entry.getValue());
		}
		System.out.print("Sieve prime of integer " + n + ":");
		List<Integer> sievePrime = Prime.sieve(n);
		for (int i : sievePrime)
			System.out.print(" " + i);
		System.out.println();
	}
}
