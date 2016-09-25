package com.algorithm.test;

import com.algorithm.sort.BinarySort;

public class TestBinarySort {
	//测试二分查找
	public static void main(String[] args) {
		int[] array={1,2,3,4,5,6,7,8};
		int[] array2={10,200,3,-2,5,6,2000,8};
		BinarySort bs=new BinarySort();
		int r=bs.binarySearch(array, 4);
		System.out.println("4位置在-->"+r);
		int r2=bs.binarySearch(array2, 6);
		System.out.println("6位置在-->"+r2);
	}

}
