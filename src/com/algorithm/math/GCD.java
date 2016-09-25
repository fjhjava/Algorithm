package com.algorithm.math;

/**
 * 最大公约数
 * 
 * @author phantomfjh
 *
 */
public class GCD {
	/*
	 * 常用的方法为辗转相除法，也称为欧几里得算法。不妨设函数 gcd(a, b) 是自然是 a , b 的最大公约 数，不妨设 a > b , 则有 a
	 * = b × p + q, 那么对于 gcd(b, q) 则是 b 和 q 的最大公约数，也就是 说 gcd(b, q) 既能整除 b , 又能整除
	 * a (因为 a = b × p + q, p 是整数)，如此反复最后得到 gcd(a, b) = gcd(c, 0) , 第二个数为0时直接返回
	 * c . 如果最开始 a < b , 那么 gcd(b, a % b) = gcd(b, a) = gcd(a, b % a) .
	 */
	public long gcd(long a, long b) {
		return (b == 0) ? a : gcd(b, (a % b));
	}

}
