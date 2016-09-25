package com.algorithm.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 素数求解
 * 
 * @author phantomfjh
 *
 */
public class Prime {

	// test if n is prime
	public static boolean isPrime(int n) {
		for (int i = 2; i * i < n; i++) {
			if (n % i == 0)
				return false;
		}
		// 1 is not prime
		return n != 1;
	}

	// enum all prime in n
	public static ArrayList<Integer> getDivisor(int n) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				result.add(i);
				if (i != n / i)
					result.add(n / i);
			}
		}
		Collections.sort(result);
		return result;

	}

	// 12=2*3*2 small to big
	public static Map<Integer, Integer> getPrimeFactor(int n) {
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		for (int i = 2; i * i <= n; i++) {
			// if i is a factor of n, repeatedly divide it out
			while (n % i == 0) {
				if (result.containsKey(i)) {
					result.put(i, result.get(i) + 1);
				} else {
					result.put(i, 1);
				}
				n = n / i;
			}
		}
		// if n is not 1 at last
		if (n != 1)
			result.put(n, 1);
		return result;
	}

	// sieve all the prime factor less equal than n
	public static List<Integer> sieve(int n) {
		List<Integer> prime = new ArrayList<Integer>();
		// flag if i is prime
		boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				prime.add(i);
				for (int j = 2 * i; j <= n; j += i) {
					isPrime[j] = false;
				}
			}
		}
		return prime;
	}

	// sieve between [a, b)
	public static List<Integer> sieveSegment(int a, int b) {
		List<Integer> prime = new ArrayList<Integer>();
		boolean[] isPrime = new boolean[b];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for (int i = 2; i < b; i++) {
			if (isPrime(i)) {
				for (int j = 2 * i; j < b; j += i)
					isPrime[j] = false;
				if (i >= a)
					prime.add(i);
			}
		}
		return prime;
	}

}
